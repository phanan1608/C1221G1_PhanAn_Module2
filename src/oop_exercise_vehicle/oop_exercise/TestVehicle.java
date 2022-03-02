package oop_exercise_vehicle.oop_exercise;

import java.util.Scanner;

public class TestVehicle {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-----SELECT FUNCTION-----");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Display Vehicle");
            System.out.println("3. Delete Vehicle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addVehicle(scanner);
                    break;
                case 2:
                    displayVehicle(scanner);
                    break;
                case 3:
                    deleteVehicle(scanner);
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!");
            }
        } while (true);
    }

    private static void deleteVehicle(Scanner scanner) {
        System.out.println("-----DELETE VEHICLE-----");
        System.out.println("Enter License Plates Need Delete");
        String licensePlatesNeedDelete = scanner.nextLine();
        TruckController.deleteVehicle(licensePlatesNeedDelete);
        CarController.deleteVehicle(licensePlatesNeedDelete);
        MotorbikeController.deleteVehicle(licensePlatesNeedDelete);
    }

    private static void displayVehicle(Scanner scanner) {
        System.out.println("-----DISPLAY VEHICLE----- ");
        System.out.println("1. Display Truck");
        System.out.println("2. Display Car");
        System.out.println("3. Display Motorbike");
        int displayChoice = Integer.parseInt(scanner.nextLine());
        switch (displayChoice) {
            case 1:
                System.out.println("---DISPLAY TRUCK---");
                TruckController.displayVehicle();
                break;
            case 2:
                System.out.println("---DISPLAY CAR---");
                CarController.displayVehicle();
                break;
            case 3:
                System.out.println("---DISPLAY MOTORBIKE---");
                MotorbikeController.displayVehicle();
                break;
        }
    }

    private static void addVehicle(Scanner scanner) {
        System.out.println("-----ADD VEHICLE----- ");
        System.out.println("1. Add Truck");
        System.out.println("2. Add Car");
        System.out.println("3. Add Motorbike");
        int addChoice = Integer.parseInt(scanner.nextLine());
        switch (addChoice) {
            case 1:
                TruckController.addVehicle();
                break;
            case 2:
                System.out.println("---ADD CAR---");
                CarController.addVehicle();
                break;
            case 3:
                System.out.println("---ADD MOTORBIKE---");
                MotorbikeController.addVehicle();
                break;
        }
    }
}
