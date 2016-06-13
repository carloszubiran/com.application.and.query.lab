package MVC.models;

import org.springframework.data.annotation.Version;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Carlos Zubiran on 5/9/2016.
 */
@Entity
public class VehicleMake{


    //region PROPERTIES

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer VehicleMakeId;

    @Version
    private Integer version;

    private String vehicleMakeName;
    private Date CreateDate;

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
        return VehicleMakeId;
    }

    public void setVehicleMakeId(Integer vehicleMakeId) {
        VehicleMakeId = vehicleMakeId;
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
        vehicleMakeName = vehicleMakeName;
    }

    public Date getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }

    //endregion






}
