package MVC.models;

import org.springframework.data.annotation.Version;

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
    private Integer VehicleId;

    @Version
    private Integer version;

    private Integer Year;
    private String LicensePlate;
    private String VIN;
    private String Color;
    private Boolean IsPurchase;
    private Integer PurchasePrice;
    private Date PurchaseDate;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private VehicleModel vehicleModel;

    //endregion PROPERTIES

    //region CONSTRUCTORS

    public Vehicle() {

        vehicleModel = new VehicleModel();

    }

    public Vehicle(Integer vehicleId) {
        VehicleId = vehicleId;
    }

    public Vehicle(Integer vehicleId, Integer year, String licensePlate,
                   String VIN, String color, Boolean isPurchase,
                   Integer purchasePrice, Date purchaseDate, VehicleModel vehicleModel) {
        VehicleId = vehicleId;
        Year = year;
        LicensePlate = licensePlate;
        this.VIN = VIN;
        Color = color;
        IsPurchase = isPurchase;
        PurchasePrice = purchasePrice;
        PurchaseDate = purchaseDate;
        this.vehicleModel = vehicleModel;
    }

    //endregion

    //region GETTERS / SETTERS


    public Integer getVehicleId() {
        return VehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        VehicleId = vehicleId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getYear() {
        return Year;
    }

    public void setYear(Integer year) {
        Year = year;
    }

    public String getLicensePlate() {
        return LicensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        LicensePlate = licensePlate;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Boolean getPurchase() {
        return IsPurchase;
    }

    public void setPurchase(Boolean purchase) {
        IsPurchase = purchase;
    }

    public Integer getPurchasePrice() {
        return PurchasePrice;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        PurchasePrice = purchasePrice;
    }

    public Date getPurchaseDate() {
        return PurchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        PurchaseDate = purchaseDate;
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

        return "Vin: " + getVIN() + ", Color: "
                + getColor() + ", Year: " + getYear() + ", LicensePlate: " + getLicensePlate();

    }

    public String getPurchasePriceAndDate() {

        return "Purchase Price: " + getPurchasePrice() + "Purchase Date: " + getPurchaseDate();

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VehicleId=" + VehicleId +
                ", Year=" + Year +
                ", LicensePlate='" + LicensePlate + '\'' +
                ", VIN='" + VIN + '\'' +
                ", Color='" + Color + '\'' +
                ", IsPurchase=" + IsPurchase +
                ", PurchasePrice=" + PurchasePrice +
                ", PurchaseDate=" + PurchaseDate +
                ", vehicleModel=" + vehicleModel.getVehicleModelName() +
                '}';
    }

    //endregion

}
