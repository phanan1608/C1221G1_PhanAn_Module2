package oop_review.exercise_1_vehicle_information_management;

public class Vehicle {
    private String licensePlates;
    private String brand;
    private int yearOfManufacture;
    private String owner;
    private String color;
    private double cylinderCapacity;
    private double vehicleValue;

    public Vehicle(String licensePlates, String brand, int yearOfManufacture, String owner, String color, double cylinderCapacity, double vehicleValue) {
        this.licensePlates = licensePlates;
        this.brand = brand;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
        this.color = color;
        this.cylinderCapacity = cylinderCapacity;
        this.vehicleValue = vehicleValue;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(double cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public double getVehicleValue() {
        return vehicleValue;
    }

    public void setVehicleValue(double vehicleValue) {
        this.vehicleValue = vehicleValue;
    }

    public double getTax() {
        if (getCylinderCapacity() < 100) {
            return getVehicleValue() * 0.01;
        } else if (getCylinderCapacity() <= 200) {
            return getVehicleValue() * 0.03;
        } else {
            return getVehicleValue() * 0.05;
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlates='" + licensePlates + '\'' +
                ", brand='" + brand + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", owner='" + owner + '\'' +
                ", color='" + color + '\'' +
                ", cylinderCapacity=" + cylinderCapacity +
                ", vehicleValue=" + vehicleValue +
                '}';
    }
}
