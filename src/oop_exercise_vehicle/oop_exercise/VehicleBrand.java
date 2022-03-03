package oop_exercise_vehicle.oop_exercise;

public final class VehicleBrand {
    private final String manufacturingCode;
    private final String manufacturingBrand;
    private final String manufacturingCountry;

    public VehicleBrand(String manufacturingCode, String manufacturingBrand, String manufacturingCountry) {
        this.manufacturingCode = manufacturingCode;
        this.manufacturingBrand = manufacturingBrand;
        this.manufacturingCountry = manufacturingCountry;
    }

    public String getManufacturingCode() {
        return manufacturingCode;
    }

    public String getManufacturingBrand() {
        return manufacturingBrand;
    }

    public String getManufacturingCountry() {
        return manufacturingCountry;
    }
}
