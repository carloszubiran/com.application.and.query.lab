package MVC.controllers;

import MVC.models.Vehicle;
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
public class SelectVehicleMakeAndModel {

    @Autowired
    private VehicleModelRepository vehicleModelRepository;

    @Autowired
    private VehicleMakeRepository vehicleMakeRepository;

    @RequestMapping(value = "/selectVehicleMakeAndModel", method = RequestMethod.GET)
    private String selectVehicleMakeAndModelGet(Model model) {

        model.addAttribute("makeList", vehicleMakeRepository.findAll());
        model.addAttribute("modelList", vehicleModelRepository.findAll());

        return "selectVehicleMakeAndModel";

    }

    @RequestMapping(value = "/selectVehicleMakeAndModel", method = RequestMethod.POST)
    public String selectVehicleMakeAndModelPost(Model model,
                                                @ModelAttribute(value = "updateVehicleModel")
                                                @RequestParam(value = "edit") String edit) {

//        vehicleModelRepository.save(vehicleModel);

        return "redirect:/updateVehicleModel";

    }

}
