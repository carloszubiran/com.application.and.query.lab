package MVC.models;

import java.util.Date;

/**
 * Created by Carlos Zubiran on 5/9/2016.
 */
public class Vehicle{

    //region PROPERTIES

    private int VehicleId;
    private int Year;
    private String LicensePlate;
    private String VIN;
    private String Color;
    private boolean IsPurchase;
    private int PurchasePrice;
    private Date PurchaseDate;
    private VehicleMake vehicleMake;
    private VehicleModel vehicleModel;

    //endregion PROPERTIES

    //region CONSTRUCTORS

    public Vehicle() {

        vehicleMake = new VehicleMake();
        vehicleModel = new VehicleModel();

    }

    public Vehicle(int vehicleId) {
        VehicleId = vehicleId;
    }

    public Vehicle(int vehicleId, int year, String licensePlate,
                   String VIN, String color, boolean isPurchase,
                   int purchasePrice, Date purchaseDate,
                   VehicleMake vehicleMake, VehicleModel vehicleModel) {
        VehicleId = vehicleId;
        Year = year;
        LicensePlate = licensePlate;
        this.VIN = VIN;
        Color = color;
        IsPurchase = isPurchase;
        PurchasePrice = purchasePrice;
        PurchaseDate = purchaseDate;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
    }

//endregion

    //region GETTERS / SETTERS


    public int getVehicleId() {
        return VehicleId;
    }

    public void setVehicleId(int vehicleId) {
        VehicleId = vehicleId;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
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

    public boolean isPurchase() {
        return IsPurchase;
    }

    public void setPurchase(boolean purchase) {
        IsPurchase = purchase;
    }

    public int getPurchasePrice() {
        return PurchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        PurchasePrice = purchasePrice;
    }

    public Date getPurchaseDate() {
        return PurchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        PurchaseDate = purchaseDate;
    }

    public VehicleMake getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(VehicleMake vehicleMake) {
        this.vehicleMake = vehicleMake;
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
                ", vehicleMake=" + vehicleMake.getVehicleMakeName() +
                ", vehicleModel=" + vehicleModel.getVehicleModelName() +
                '}';
    }

    //endregion







}
