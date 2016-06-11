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

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private VehicleMake VehicleMake;

    //endregion

    //region CONSTRUCTORS

    public VehicleModel() {
        this.VehicleMake = new VehicleMake("");
    }

    public VehicleModel(String vehicleModelName, VehicleMake vehicleMake) {
        VehicleModelName = vehicleModelName;
        VehicleMake = vehicleMake;
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
        return VehicleMake;
    }

    public void setVehicleMake(VehicleMake vehicleMake) {
        VehicleMake = vehicleMake;
    }

    //endregion




}
