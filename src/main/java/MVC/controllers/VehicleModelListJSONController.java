package MVC.controllers;

import MVC.models.Vehicle;
import MVC.models.VehicleMake;
import MVC.models.VehicleModel;
import MVC.repositories.VehicleMakeRepository;
import MVC.repositories.VehicleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Carlos Zubiran on 6/12/2016.
 */
@Controller
@RequestMapping(value="/vehicleModelListJSONController")
public class VehicleModelListJSONController {

//    VehicleMake vehicleMake = new VehicleMake();

    @Autowired
    VehicleMakeRepository vehicleMakeRepository;

    @Autowired
    VehicleModelRepository vehicleModelRepository;

    @RequestMapping(value="", method = RequestMethod.GET)
    public @ResponseBody List<VehicleModel> getVehicleModelListInJSON(Model model,
                                                               @RequestParam(value = "vehicleMakeId") String vehicleMakeId) {


        return vehicleModelRepository.findAllByVehicleMakeVehicleMakeId(Integer.parseInt(vehicleMakeId));
    }

}
