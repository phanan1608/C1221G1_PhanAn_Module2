package read_and_write_file_review.services.impl;

import java.util.Scanner;

public class VehicleServiceImpl {
    protected String brand;
    protected int yearOfManufacture;
    protected String owner;


    Scanner scanner = new Scanner(System.in);

    public void add() {

        brand = ManufactureServiceImpl.getBrandName();
        System.out.println("Enter Year Of Manufacture");
        yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Owner");
        owner = scanner.nextLine();
    }

}
