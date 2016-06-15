package MVC.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Carlos Zubiran on 5/9/2016.
 */

@Entity
public class Vehicle{

    //region PROPERTIES

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer vehicleId;

    @Version
    private Integer version;

    private Integer year;
    private String licensePlate;
    private String vin;
    private String color;
    private Boolean isPurchase;
    private Integer purchasePrice;
    private Date purchaseDate;

    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    private VehicleModel vehicleModel;

    //endregion PROPERTIES

    //region CONSTRUCTORS

    public Vehicle() {

        this.vehicleModel = new VehicleModel();

    }

    public Vehicle(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Vehicle(Integer vehicleId, Integer year, String licensePlate,
                   String vin, String color, Boolean isPurchase,
                   Integer purchasePrice, Date purchaseDate, VehicleModel vehicleModel) {
        this.vehicleId = vehicleId;
        this.year = year;
        this.licensePlate = licensePlate;
        this.vin = vin;
        this.color = color;
        this.isPurchase = isPurchase;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.vehicleModel = vehicleModel;
    }

    //endregion

    //region GETTERS / SETTERS

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getPurchase() {
        return isPurchase;
    }

    public void setPurchase(Boolean purchase) {
        isPurchase = purchase;
    }

    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public VehicleModel getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(VehicleModel vehicleModel) {
        this.vehicleModel = vehicleModel;
    }


//endregion GETTERS / SETTERS

    //region CUSTOM / METHODS

    public String getVinColorYearAndLicensePlateOfVehicle() {

        return "Vin: " + getVin() + ", color: "
                + getColor() + ", year: " + getYear() + ", licensePlate: " + getLicensePlate();

    }

    public String getPurchasePriceAndDate() {

        return "Purchase Price: " + getPurchasePrice() + "Purchase Date: " + getPurchaseDate();

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", year=" + year +
                ", licensePlate='" + licensePlate + '\'' +
                ", vin='" + vin + '\'' +
                ", color='" + color + '\'' +
                ", isPurchase=" + isPurchase +
                ", purchasePrice=" + purchasePrice +
                ", purchaseDate=" + purchaseDate +
                ", vehicleModel=" + vehicleModel.getVehicleModelName() +
                '}';
    }

    //endregion

}
