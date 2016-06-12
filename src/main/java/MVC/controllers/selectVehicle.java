package MVC.controllers;

import MVC.models.Vehicle;
import MVC.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Carlos Zubiran on 6/9/2016.
 */

@Controller
public class SelectVehicle {

    @Autowired
    private VehicleRepository vehicleRepository;

    @RequestMapping(value = "/selectVehicle", method = RequestMethod.GET)
    private String selectVehicleGet(Model model) {

        model.addAttribute("selectVehicle", new Vehicle());

        return "selectVehicle";

    }

    @RequestMapping(value = "/selectVehicle", method = RequestMethod.POST)
    public String selectVehiclePost(Model model, @ModelAttribute("selectVehicle") Vehicle vehicle) {

        vehicleRepository.save(vehicle);

        return "redirect:/selectVehicle";

    }

}
