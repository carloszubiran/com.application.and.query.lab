package MVC.bootstrap;

import MVC.models.Vehicle;
import MVC.models.VehicleMake;
import MVC.models.VehicleModel;
import MVC.repositories.VehicleMakeRepository;
import MVC.repositories.VehicleModelRepository;
import MVC.repositories.VehicleRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Carlos Zubiran on 6/13/2016.
 */

@Component
public class SeedData implements ApplicationListener<ContextRefreshedEvent>{

    @Autowired
    VehicleMakeRepository vehicleMakeRepository;
    @Autowired
    VehicleModelRepository vehicleModelRepository;
    @Autowired
    VehicleRepository vehicleRepository;

    private Logger log = Logger.getLogger(SeedData.class);

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

//        VehicleMake vehicleMake;
//        VehicleModel vehicleModel;
        Vehicle vehicle = new Vehicle();


        vehicleMakeRepository.save(new VehicleMake("Toyota"));
        vehicleMakeRepository.save(new VehicleMake("Ford"));
        vehicleMakeRepository.save(new VehicleMake("Tesla"));
        vehicleMakeRepository.save(new VehicleMake("Apple"));

        vehicleModelRepository.save(new VehicleModel("Corola", vehicleMakeRepository.findOne(1)));
        vehicleModelRepository.save(new VehicleModel("Prius", vehicleMakeRepository.findOne(1)));
        vehicleModelRepository.save(new VehicleModel("150", vehicleMakeRepository.findOne(2)));
        vehicleModelRepository.save(new VehicleModel("Mustang", vehicleMakeRepository.findOne(2)));
        vehicleModelRepository.save(new VehicleModel("Genius", vehicleMakeRepository.findOne(3)));
        vehicleModelRepository.save(new VehicleModel("Edison", vehicleMakeRepository.findOne(3)));
        vehicleModelRepository.save(new VehicleModel("iCar", vehicleMakeRepository.findOne(4)));
        vehicleModelRepository.save(new VehicleModel("iVehicle", vehicleMakeRepository.findOne(4)));


        vehicle.setColor("Orange");
        vehicle.setVehicleModel(vehicleModelRepository.findOne(6));
        vehicle.setPurchasePrice(10000);
        vehicle.setLicensePlate("J4F-732");
        vehicle.setYear(2010);
        vehicle.setPurchase(true);
        vehicle.setVin("32fdasjklsf23");
        vehicle.setPurchaseDate(new Date());
        vehicleRepository.save(vehicle);

        vehicle = new Vehicle();
        vehicle.setColor("Black");
        vehicle.setVehicleModel(vehicleModelRepository.findOne(4));
        vehicle.setPurchasePrice(1000);
        vehicle.setLicensePlate("JDF-432");
        vehicle.setYear(2000);
        vehicle.setPurchase(true);
        vehicle.setVin("323432jklsf23");
        vehicle.setPurchaseDate(new Date());
        vehicleRepository.save(vehicle);

        vehicle = new Vehicle();
        vehicle.setColor("Green");
        vehicle.setVehicleModel(vehicleModelRepository.findOne(7));
        vehicle.setPurchasePrice(20000);
        vehicle.setLicensePlate("SDF-472");
        vehicle.setYear(2011);
        vehicle.setPurchase(true);
        vehicle.setVin("gfd32jklsf23");
        vehicle.setPurchaseDate(new Date());
        vehicleRepository.save(vehicle);

//        for (VehicleModel vm : vehicleModelRepository.findAllByVehicleMakeVehicleMakeId(4)) {
//
//            System.out.println(vm.getVehicleModelName());
//
//        }


    }



}
