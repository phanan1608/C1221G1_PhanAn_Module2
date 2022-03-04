package oop_exercise_vehicle.oop_exercise.services.impl;

import oop_exercise_vehicle.oop_exercise.models.VehicleBrand;

public class ManufactureBrandList {
    public static final VehicleBrand[] vehicleBrands = new VehicleBrand[7];

    static {
        vehicleBrands[0] = new VehicleBrand("HSX-001", "Yamaha", "Nhật Bản");
        vehicleBrands[1] = new VehicleBrand("HSX-002", "Honda", "Nhật Bản");
        vehicleBrands[2] = new VehicleBrand("HSX-003", "Dongfeng", "Trung Quốc");
        vehicleBrands[3] = new VehicleBrand("HSX-004", "Huyndai", "Hàn Quốc");
        vehicleBrands[4] = new VehicleBrand("HSX-005", "Ford", "Mỹ");
        vehicleBrands[5] = new VehicleBrand("HSX-006", "Toyota", "Nhật Bản");
        vehicleBrands[6] = new VehicleBrand("HSX-007", "Hino", "Nhật Bản");
    }
}
