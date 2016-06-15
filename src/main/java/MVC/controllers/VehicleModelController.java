package MVC.controllers;

import MVC.models.VehicleModel;
import MVC.repositories.VehicleMakeRepository;
import MVC.repositories.VehicleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Carlos Zubiran on 6/15/2016.
 */

@Controller
public class VehicleModelController {

    VehicleModel vehicleModel = new VehicleModel();

    @Autowired
    private VehicleModelRepository vehicleModelRepository;

    @Autowired
    private VehicleMakeRepository vehicleMakeRepository;

    @RequestMapping(value = "/selectVehicleModel", method = RequestMethod.GET)
    private String selectVehicleModelGet(Model model) {

        model.addAttribute("makeList", vehicleMakeRepository.findAll());
        model.addAttribute("modelList", vehicleModelRepository.findAll());

        return "selectVehicleModel";

    }

    @RequestMapping(value = "/selectVehicleModel", method = RequestMethod.POST)
    public String selectVehicleModelPost(Model model,
                                         @ModelAttribute(value = "updateVehicleModel")
                                         @RequestParam(value = "edit") String edit) {

//        vehicleModelRepository.save(vehicleModel);

        return "redirect:/updateVehicleModel";

    }

    @RequestMapping(value = "/updateVehicleModel", method = RequestMethod.GET)
    String updateVehicleModelGet(Model model,
                                 @RequestParam(value = "edit") String edit){

        model.addAttribute("updateVehicleModelForm", vehicleModelRepository.findOne(Integer.parseInt(edit)));
        model.addAttribute("makeList", vehicleMakeRepository.findAll());

        return "/updateVehicleModel";

    }

    @RequestMapping(value = "/updateVehicleModel", method = RequestMethod.POST)
    String updateVehicleModelPost(Model model,
                                  @ModelAttribute(value = "updateVehicleModelForm") VehicleModel vehicleModel){

        vehicleModelRepository.save(vehicleModel);
        return "redirect:selectVehicleModel";

    }

}
