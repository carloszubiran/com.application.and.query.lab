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
public class IndexController {

    @Autowired
    private VehicleRepository vehicleRepository;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    private String indexGet(Model model) {

//        model.addAttribute("vehicleForm", new Vehicle());

        return "selectVehicle";

    }

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String indexPost(Model model, @ModelAttribute("vehicleForm") Vehicle vehicle) {

        vehicleRepository.save(vehicle);

        return "redirect:/selectVehicle";

    }

}
