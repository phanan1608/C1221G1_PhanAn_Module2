package read_and_write_file_review.models;

public class Truck extends Vehicle {
    private double tonnage;

    public Truck(String licensePlates, String brand, int yearOfManufacture, String owner, double tonnage) {
        super(licensePlates, brand, yearOfManufacture, owner);
        this.tonnage = tonnage;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() + "," + tonnage + "}";
    }

    @Override
    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.tonnage;
    }
}
