package MVC.controllers;

import MVC.models.Vehicle;
import MVC.models.VehicleModel;
import MVC.repositories.VehicleMakeRepository;
import MVC.repositories.VehicleModelRepository;
import MVC.repositories.VehicleRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

/**
 * Created by Carlos Zubiran on 6/15/2016.
 */
@Controller
public class VehicleController {

    Logger logger = Logger.getLogger(VehicleController.class);

    @Autowired
    VehicleRepository vehicleRepository;
    @Autowired
    VehicleMakeRepository vehicleMakeRepository;
    @Autowired
    VehicleModelRepository vehicleModelRepository;


    @RequestMapping(value = "/addVehicle", method = RequestMethod.GET)
    String addVehicleGet(Model model) {

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleModel(new VehicleModel());

        model.addAttribute("vehicleForm", vehicle);
        model.addAttribute("vehicleMakeList", vehicleMakeRepository.findAll());
        model.addAttribute("vehicleModelList", vehicleModelRepository.findAllByVehicleMakeVehicleMakeId(1));
        return "addVehicle";
    }


    @RequestMapping(value = "/addVehicle", method = RequestMethod.POST)
    String addVehiclePost(Model model, @ModelAttribute("vehicleForm") @Valid Vehicle vehicle,
                          BindingResult bindingResultVehicle) {

        logger.info("vehicle to string: " + vehicle.toString());
        if (bindingResultVehicle.hasErrors()) {
            return "form";
        }


        System.out.println(vehicle.getVin());
        System.out.println(vehicle.getVinColorYearAndLicensePlateOfVehicle());
        System.out.println(vehicle.getYear());
        System.out.println(vehicle.getPurchase());
        System.out.println(vehicle.getPurchaseDate().toString());
        System.out.println(vehicle.getVin());


        vehicleRepository.save(vehicle);
        return "redirect:selectVehicle";

    }

    @RequestMapping(value = "/selectVehicle", method = RequestMethod.GET)
    private String selectVehicleGet(Model model) {

        model.addAttribute("selectVehicle", new Vehicle());
        model.addAttribute("vehicleMakeList", vehicleMakeRepository.findAll());
        model.addAttribute("vehicleList", vehicleRepository.findAll());
        return "selectVehicle";

    }

    @RequestMapping(value = "/selectVehicle", method = RequestMethod.POST)
    public String selectVehiclePost(Model model) {

        return "redirect:/selectVehicle";

    }

    @RequestMapping(value = "/updateVehicle", method = RequestMethod.GET)
    String updateVehcileGet(Model model,
                            @RequestParam("edit") String edit) {


        model.addAttribute("vehicleMakeList", vehicleMakeRepository.findAll());
        model.addAttribute("vehicleModelList", vehicleModelRepository.findAllByVehicleMake(
                vehicleRepository.findOne(Integer.parseInt(edit)).getVehicleModel().getVehicleMake()));

        model.addAttribute("updateVehicle", vehicleRepository.findOne(Integer.parseInt(edit)));

        return "updateVehicle";

    }

    @RequestMapping(value = "/updateVehicle", method = RequestMethod.POST)
    String updateVehiclePost(Model model,
                             @ModelAttribute(value = "updateVehicle") Vehicle vehicle) {

        vehicleRepository.save(vehicle);
        return "redirect:selectVehicle";

    }

    @RequestMapping(value = "/deleteVehicle", method = RequestMethod.POST)
    String deleteVehicle(Model model, @RequestParam(value = "delete") String delete){


        vehicleRepository.delete(Integer.parseInt(delete));

        return "redirect:selectVehicle";

    }



}
