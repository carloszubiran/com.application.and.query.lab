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
    private Integer vehicleModelId;

    @Version
    private Integer version;

    private String vehicleModelName;

    @ManyToOne(fetch = FetchType.EAGER)
    private VehicleMake vehicleMake;

    //endregion

    //region CONSTRUCTORS

    public VehicleModel() {
        this.vehicleMake = new VehicleMake("");
    }

    public VehicleModel(String vehicleModelName, VehicleMake vehicleMake) {
        this.vehicleModelName = vehicleModelName;
        this.vehicleMake = vehicleMake;
    }

    //endregion

    //region SETTERS AND GETTERS


    public Integer getVehicleModelId() {
        return vehicleModelId;
    }

    public void setVehicleModelId(Integer vehicleModelId) {
        this.vehicleModelId = vehicleModelId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getVehicleModelName() {
        return vehicleModelName;
    }

    public void setVehicleModelName(String vehicleModelName) {
        this.vehicleModelName = vehicleModelName;
    }

    public VehicleMake getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(VehicleMake vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    //endregion




}
