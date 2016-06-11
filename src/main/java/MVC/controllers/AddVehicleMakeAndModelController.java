package MVC.controllers;

import MVC.models.Vehicle;
import MVC.models.VehicleMake;
import MVC.models.VehicleModel;
import MVC.repositories.VehicleMakeRepository;
import MVC.repositories.VehicleModelRepository;
import MVC.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Carlos Zubiran on 6/9/2016.
 */

@Controller
public class AddVehicleMakeAndModelController {

    @Autowired
    private VehicleMakeRepository vehicleMakeRepository;

    @Autowired
    private VehicleModelRepository vehicleModelRepository;

    @RequestMapping(value = "/addVehicleMakeAndModel", method = RequestMethod.GET)
    private String addVehicleMakeAndModelGet(Model model) {

        model.addAttribute("addVehicleMake", new VehicleMake());
        model.addAttribute("listOfVehicleMakes", vehicleMakeRepository.findAll());
        model.addAttribute("addVehicleModel", new VehicleModel());

        return "addVehicleMakeAndModel";

    }

    // TODO: 6/10/2016 Make a error or warning to make sure there is a make before inserting a model 
    @RequestMapping(value = "/addVehicleMakeAndModel", method = RequestMethod.POST)
    public String addVehicleMakeAndModelPost(Model model,
                                             @ModelAttribute("addVehicleMake") VehicleMake vehicleMake,
                                             @ModelAttribute("addVehicleModel") VehicleModel vehicleModel,
                                             @RequestParam("submit") String submit) {


        if (submit.equals("insertMake"))
        {
            vehicleMakeRepository.save(vehicleMake);
        }
        if (submit.equals("insertModel"))
        {

            vehicleModelRepository.save(vehicleModel);
        }

        return "redirect:/addVehicleMakeAndModel";

    }

}
