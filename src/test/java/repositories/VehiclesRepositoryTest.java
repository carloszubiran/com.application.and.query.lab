package repositories;

import MVC.configuration.RepositoryConfiguration;
import MVC.models.Vehicle;
import MVC.models.VehicleMake;
import MVC.models.VehicleModel;
import MVC.repositories.VehicleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.apache.log4j.Logger;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by Carlos Zubiran on 6/10/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {RepositoryConfiguration.class})
public class VehiclesRepositoryTest {

    public static Logger logger = Logger.getLogger(VehiclesRepositoryTest.class);



    @Autowired
    private VehicleRepository vehicleRepository;

//    @Autowired
//    private VehicleMakeRepository vehicleMakeRepository;
//
//    @Autowired
//    private VehicleModelRepository vehicleModelRepository;

    @Test
    public void testSaveVehicle() {
        // setup vehicle
        Vehicle vehicle = new Vehicle();
        vehicle.setLicensePlate("jhfsdaasdf");
        vehicle.setVIN("432432");
        vehicle.setYear(1993);
        vehicle.setVehicleModel(new VehicleModel("Corola", new VehicleMake("Toyota")));

        // persist the vehicle to a data store then check its values
        assertNull(vehicle.getVehicleId());
        vehicleRepository.save(vehicle);
        assertNotNull(vehicle.getLicensePlate());
        assertNotNull(vehicle.getVIN());
        assertNotNull(vehicle.getYear());
        assertNotNull(vehicle.getVehicleModel());
        assertNotNull(vehicle.getVehicleId());

        // get the data from the data store and check it values
        for (Vehicle v: vehicleRepository.findAll()) {
            assertNotNull(v.getLicensePlate());
            assertNotNull(v.getVIN());
            assertNotNull(v.getYear());
            assertNotNull(v.getVehicleModel());
            logger.info("This is the vehicle name :" + v.getVehicleModel().getVehicleModelName());
            assertNotNull(v.getVehicleId());
        }

        // update

        vehicle = vehicleRepository.findOne(1);
        vehicle.getVehicleModel().setVehicleModelName("Pries");
        vehicleRepository.save(vehicle);
        logger.info("This should be the updated value: " + vehicleRepository.findOne(1).getVehicleModel().getVehicleModelName());





    }

    @Test
    public void testSaveVehicleMake() {
        // setup VehicleMake
        VehicleMake vehicleMake = new VehicleMake();


    }

    @Test
    public void testSaveVehicleModel() {
        // setup VehicleModel
        VehicleModel vehicleModel = new VehicleModel();


    }




}
