package MVC.controllers;

import MVC.models.VehicleMake;
import MVC.repositories.VehicleMakeRepository;
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
public class VehicleMakeController {

    @Autowired
    VehicleMakeRepository vehicleMakeRepository;

    VehicleMake vehicleMake = new VehicleMake();

    @RequestMapping(value = "/selectVehicleMake", method = RequestMethod.GET)
    String selectVehicleMakeGet(Model model) {

        model.addAttribute("selectVehicleMake", vehicleMake);
        model.addAttribute("makeList", vehicleMakeRepository.findAll());

        return "selectVehicleMake";
    }

    @RequestMapping(value = "/selectVehicleMake", method = RequestMethod.POST)
    String selectVehicleMakePost(Model model){

        return "";

    }

    @RequestMapping(value = "/updateVehicleMake", method = RequestMethod.GET)
    String updateVehicleMakeGet(Model model,
                                @RequestParam(value = "edit")String edit) {

        model.addAttribute("updateVehicleMakeForm", vehicleMakeRepository.findOne(Integer.parseInt(edit)));
        return "updateVehicleMake";
    }

    @RequestMapping(value = "/updateVehicleMake", method = RequestMethod.POST)
    String updateVehicleMakePost(Model model,
                                 @ModelAttribute(value = "updateVehicleMakeForm") VehicleMake vehicleMake) {

        vehicleMakeRepository.save(vehicleMake);
        return "redirect:selectVehicleMake";
    }
}
