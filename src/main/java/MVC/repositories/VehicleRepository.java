package MVC.repositories;

import MVC.models.Vehicle;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Carlos Zubiran on 6/9/2016.
 */
public interface VehicleRepository extends CrudRepository <Vehicle, Integer> {


}
