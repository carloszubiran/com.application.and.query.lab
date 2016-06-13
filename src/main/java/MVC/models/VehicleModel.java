package MVC.models;

import javax.persistence.*;

/**
 * Created by Carlos Zubiran on 5/9/2016.
 */

@Entity
public class VehicleModel{


    //region PROPERTIES

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer VehicleModelId;

    @Version
    private Integer version;

    private String VehicleModelName;

    @ManyToOne( fetch = FetchType.EAGER)
    private VehicleMake vehicleMake;

    //endregion

    //region CONSTRUCTORS

    public VehicleModel() {
        this.vehicleMake = new VehicleMake("");
    }

    public VehicleModel(String vehicleModelName, VehicleMake vehicleMake) {
        VehicleModelName = vehicleModelName;
        this.vehicleMake = vehicleMake;
    }

    //endregion

    //region SETTERS AND GETTERS

    public int getVehicleModelId() {
        return VehicleModelId;
    }

    public void setVehicleModelId(int vehicleModelId) {
        VehicleModelId = vehicleModelId;
    }

    public String getVehicleModelName() {
        return VehicleModelName;
    }

    public void setVehicleModelName(String vehicleModelName) {
        VehicleModelName = vehicleModelName;
    }

    public VehicleMake getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(VehicleMake vehicleMake) {
        vehicleMake = vehicleMake;
    }

    //endregion




}
