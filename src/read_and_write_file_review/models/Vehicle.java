package read_and_write_file_review.models;

public abstract class Vehicle {
    private String licensePlates;
    private String brand;
    private int yearOfManufacture;
    private String owner;

    public Vehicle(String licensePlates, String brand, int yearOfManufacture, String owner) {
        this.licensePlates = licensePlates;
        this.brand = brand;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
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

    @Override
    public String toString() {
        return licensePlates + "," + brand + "," + yearOfManufacture + "," + owner;
    }

    public String getInfoToCSV() {
        return this.licensePlates + "," + this.brand + "," + this.yearOfManufacture + "," + this.owner;
    }
}
