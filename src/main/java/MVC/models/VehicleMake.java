package MVC.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Carlos Zubiran on 5/9/2016.
 */
@Entity
public class VehicleMake{


    //region PROPERTIES

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer vehicleMakeId;

    @Version
    private Integer version;

    private String vehicleMakeName;
    private Date createDate;

    //endregion

    //region CONSTRUCTORS

    public VehicleMake() {
    }

    public VehicleMake(String vehicleMakeName) {
        this.vehicleMakeName = vehicleMakeName;
    }



//endregion

    //region GETTERS AND SETTERS


    public Integer getVehicleMakeId() {
        return vehicleMakeId;
    }

    public void setVehicleMakeId(Integer vehicleMakeId) {
        this.vehicleMakeId = vehicleMakeId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getVehicleMakeName() {
        return vehicleMakeName;
    }

    public void setVehicleMakeName(String vehicleMakeName) {
        this.vehicleMakeName = vehicleMakeName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    //endregion






}
