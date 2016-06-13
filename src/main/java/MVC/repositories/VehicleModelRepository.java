package MVC.repositories;

import MVC.models.VehicleMake;
import MVC.models.VehicleModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

/**
 * Created by Carlos Zubiran on 6/9/2016.
 */

public interface VehicleModelRepository extends CrudRepository <VehicleModel, Integer> {

//    List<VehicleModel> findAllByVehicleMakeByVehicleMakeId(VehicleMake vehicleMake);

    List<VehicleModel> findAllByVehicleMakeId(VehicleMake vehicleMake);

}
