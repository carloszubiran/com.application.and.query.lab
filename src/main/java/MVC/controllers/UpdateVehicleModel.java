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
 * Created by Carlos Zubiran on 6/11/2016.
 */
@Controller
public class UpdateVehicleModel {

    @Autowired
    private VehicleMakeRepository vehicleMakeRepository;
    @Autowired
    private VehicleModelRepository vehicleModelRepository;

    @RequestMapping(value = "/updateVehicleModel", method = RequestMethod.GET)
    String updateVehicleModelGet(Model model,
                                 @RequestParam(value = "edit") String update){

        model.addAttribute("makeList", vehicleMakeRepository.findAll());
        model.addAttribute("model", vehicleModelRepository.findOne(Integer.parseInt(update)));

        return "/updateVehicleModel";

    }

    @RequestMapping(value = "/updateVehicleModel", method = RequestMethod.POST)
    String updateVehicleModelPost(Model model){

        return "updateVehicleModel";

    }

}
