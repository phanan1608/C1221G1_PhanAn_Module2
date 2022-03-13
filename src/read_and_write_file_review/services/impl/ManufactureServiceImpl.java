package read_and_write_file_review.services.impl;

import read_and_write_file_review.models.VehicleBrand;
import read_and_write_file_review.utils.ReadAndWriteFile;

import java.util.List;
import java.util.Scanner;

public class ManufactureServiceImpl {
    public static List<VehicleBrand> vehicleBrandList;
    public static final String BRAND_FILE = "src\\read_and_write_file_review\\data\\Manufacturer.csv";

    static {
        vehicleBrandList = ReadAndWriteFile.readVehicleBrandListFromCSV(BRAND_FILE);
    }

    static Scanner scanner = new Scanner(System.in);

    public static String getBrandName() {
        int index;
        do {
            System.out.println("Choose Vehicle Brand");
            System.out.println("1. Yamaha\n" +
                    "2. Honda\n" +
                    "3. Dongfeng\n" +
                    "4. Huyndai\n" +
                    "5. Ford\n" +
                    "6. Toyota\n" +
                    "7. Hino\n");
            index = Integer.parseInt(scanner.nextLine());
            if (index < 0 || index >= vehicleBrandList.size()) {
                System.out.println("Vui lòng nhập lại");
            } else {
                return vehicleBrandList.get(index - 1).getManufacturingBrand();
            }
        } while (true);
    }
}
