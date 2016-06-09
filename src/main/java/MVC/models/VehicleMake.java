package MVC.models;

import java.util.Date;

/**
 * Created by Carlos Zubiran on 5/9/2016.
 */
public class VehicleMake{

    private int VehicleMakeId;
    private String VehicleMakeName;
    private Date CreateDate;

    public int getVehicleMakeId() {
        return VehicleMakeId;
    }

    public void setVehicleMakeId(int vechivleMakeId) {
        VehicleMakeId = vechivleMakeId;
    }

    public String getVehicleMakeName() {
        return VehicleMakeName;
    }

    public void setVehicleMakeName(String vehicleMakeName) {
        VehicleMakeName = vehicleMakeName;
    }

    public Date getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }
}
