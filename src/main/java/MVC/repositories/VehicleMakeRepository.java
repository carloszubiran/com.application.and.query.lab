package MVC.repositories;

import MVC.models.VehicleMake;
import org.springframework.data.repository.CrudRepository;

import javax.sql.rowset.CachedRowSet;

/**
 * Created by Carlos Zubiran on 6/9/2016.
 */
public interface VehicleMakeRepository extends CrudRepository <VehicleMake, Integer> {

    VehicleMake findByVehicleMakeName(String makeName);

}
