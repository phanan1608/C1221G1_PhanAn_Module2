package oop_review.exercise_1_vehicle_information_management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("43C1-519.00", "Yamaha", 2015, "Phan An", "white", 110, 1000);
        Vehicle vehicle2 = new Vehicle("43C1-168.68", "Honda", 2014, "An Phan", "white", 80, 2000);
        Vehicle vehicle3 = new Vehicle("43C1-168.97", "Honda", 2014, "An Phan", "white", 250, 5000);

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(vehicle1);
        vehicleList.add(vehicle2);
        vehicleList.add(vehicle3);

        int choice = -1;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Create vehicle object and input vehicle information");
            System.out.println("2. Vehicle tax declaration sheet");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("-----Create vehicle object and input vehicle information-----");
                    System.out.println("Enter License Plates");
                    String licensePlates = scanner.nextLine();
                    System.out.println("Enter brand");
                    String brand = scanner.nextLine();
                    System.out.println("Enter Year Of Manufacture ");
                    int yearOfManufacture = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter Owner");
                    String owner = scanner.nextLine();
                    System.out.println("Enter color");
                    String color = scanner.nextLine();
                    System.out.println("Enter Cylinder Capacity");
                    double cylinderCapacity = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter Vehicle Value ");
                    double vehicleValue = Double.parseDouble(scanner.nextLine());
                    Vehicle vehicle = new Vehicle(licensePlates, brand, yearOfManufacture, owner, color, cylinderCapacity, vehicleValue);
                    vehicleList.add(vehicle);
                    System.out.println(vehicleList);
                    break;
                case 2:
                    System.out.println("-----Vehicle tax declaration sheet-----");
                    for (Vehicle element : vehicleList
                    ) {
                        System.out.println(element.toString());
                        System.out.println("Tax:" + element.getTax());
                        System.out.println("----------------------------------------");

                    }
                    break;
                case 3:
                    System.exit(3);
                default:
                    System.out.println("No choice!");
            }

        } while (true);
    }
}
