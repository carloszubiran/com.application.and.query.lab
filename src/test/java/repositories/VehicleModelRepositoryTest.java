package repositories;

import MVC.configuration.RepositoryConfiguration;
import MVC.models.VehicleMake;
import MVC.models.VehicleModel;
import MVC.repositories.VehicleMakeRepository;
import MVC.repositories.VehicleModelRepository;
import MVC.repositories.VehicleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

/**
 * Created by Bipin on 6/13/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {RepositoryConfiguration.class})
public class VehicleModelRepositoryTest {

    @Autowired
    private VehicleModelRepository vehicleModelRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private VehicleMakeRepository vehicleMakeRepository;

    @Test
    public void testRetrieveModelsByMake() {

        VehicleMake vehicleMake = new VehicleMake("Toyota");
        vehicleMakeRepository.save(vehicleMake);

        VehicleModel vehicleModel1 = new VehicleModel("Carolla", vehicleMake);
        VehicleModel vehicleModel2 = new VehicleModel("Sentra", vehicleMake);
        VehicleModel vehicleModel3 = new VehicleModel("Camery", vehicleMake);
        VehicleModel vehicleModel4 = new VehicleModel("Tundra", vehicleMake);
        VehicleModel vehicleModel5 = new VehicleModel("Something", vehicleMake);

        vehicleModelRepository.save(vehicleModel1);
        vehicleModelRepository.save(vehicleModel2);
        vehicleModelRepository.save(vehicleModel3);
        vehicleModelRepository.save(vehicleModel4);
        vehicleModelRepository.save(vehicleModel5);

        List<VehicleModel> vehicleModels = vehicleModelRepository.findAllByVehicleMake(vehicleMake);
        assertEquals(5, vehicleModels.size());


        VehicleMake retrievedVehicleMake = vehicleMakeRepository.findByVehicleMakeName("Toyota");
        List<VehicleModel> vehicleModelList2 = vehicleModelRepository.findAllByVehicleMake(retrievedVehicleMake);
        assertEquals(5, vehicleModelList2.size());


        //Get an ID from Controller
        Integer ID = 1;
        VehicleMake ByIdVehicleMake = vehicleMakeRepository.findOne(ID);
        List<VehicleModel> vehicleModelListForDropDown = vehicleModelRepository.findAllByVehicleMake(ByIdVehicleMake);
        assertEquals(5, vehicleModelListForDropDown.size());

    }

}
