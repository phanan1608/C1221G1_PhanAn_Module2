package read_and_write_file_review.models;

public class VehicleBrand {
    String manufacturingCode;
    String manufacturingBrand;
    String manufacturingCountry;

    public VehicleBrand(String manufacturingCode, String manufacturingBrand, String manufacturingCountry) {
        this.manufacturingCode = manufacturingCode;
        this.manufacturingBrand = manufacturingBrand;
        this.manufacturingCountry = manufacturingCountry;
    }

//    public static final VehicleBrand[] vehicleBrands = new VehicleBrand[7];
//
//    static {
//        vehicleBrands[0] = new VehicleBrand("HSX-001", "Yamaha", "Nhật Bản");
//        vehicleBrands[1] = new VehicleBrand("HSX-002", "Honda", "Nhật Bản");
//        vehicleBrands[2] = new VehicleBrand("HSX-003", "Dongfeng", "Trung Quốc");
//        vehicleBrands[3] = new VehicleBrand("HSX-004", "Huyndai", "Hàn Quốc");
//        vehicleBrands[4] = new VehicleBrand("HSX-005", "Ford", "Mỹ");
//        vehicleBrands[5] = new VehicleBrand("HSX-006", "Toyota", "Nhật Bản");
//        vehicleBrands[6] = new VehicleBrand("HSX-007", "Hino", "Nhật Bản");
//    }

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
