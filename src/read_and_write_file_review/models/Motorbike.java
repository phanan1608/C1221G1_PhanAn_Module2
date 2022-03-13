package read_and_write_file_review.models;

public class Motorbike extends Vehicle {
    private double capacity;

    public Motorbike(String licensePlates, String brand, int yearOfManufacture, String owner, double capacity) {
        super(licensePlates, brand, yearOfManufacture, owner);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Motorbike{" + super.toString() + "," + capacity +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.capacity;
    }
}
