package MVC.controllers;

import MVC.models.VehicleMake;
import MVC.models.VehicleModel;
import MVC.repositories.VehicleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Carlos Zubiran on 6/12/2016.
 */
@Controller
public class VehicleModelListJSONController {

    VehicleMake vehicleMake = new VehicleMake();

//    @Autowired
//    VehicleModelCustomRepository vehicleModelCustomRepository;

    @Autowired
    VehicleModelRepository vehicleModelRepository;

    @RequestMapping(value="/vehicleModelListJSONController", method = RequestMethod.GET)
    public @ResponseBody
    List<VehicleModel> getVehicleModelListInJSON(@PathVariable String makeId) {
        List<VehicleModel> modelList;
//        Integer.parseInt(makeId)
        vehicleMake.setVehicleMakeId(1);
        return vehicleModelRepository.findAllByVehicleMakeId(vehicleMake);
    }

}
