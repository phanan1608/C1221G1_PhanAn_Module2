package read_and_write_file_review.controllers;

import read_and_write_file_review.services.IServices;
import read_and_write_file_review.services.impl.CarServiceImpl;
import read_and_write_file_review.services.impl.MotorbikeServiceImpl;
import read_and_write_file_review.services.impl.TruckServiceImpl;
import read_and_write_file_review.utils.NotFoundVehicelException;

import java.util.Scanner;

public class VehicleController {
    IServices carService = new CarServiceImpl();
    IServices truckService = new TruckServiceImpl();
    IServices motorbikeService = new MotorbikeServiceImpl();

    public void displayMenu() {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-----SELECT FUNCTION-----");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Display Vehicle");
            System.out.println("3. Delete Vehicle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
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


    private void deleteVehicle(Scanner scanner) {
        System.out.println("-----DELETE VEHICLE-----");
        do {
            System.out.println("Enter License Plates Need Delete");
            String licensePlatesNeedDelete = scanner.nextLine();
            if ("".equals(licensePlatesNeedDelete)) {
                break;
            }
            if (carService.searchByLicensePlates(licensePlatesNeedDelete)) {
                carService.delete(licensePlatesNeedDelete);
                break;
            } else if (truckService.searchByLicensePlates(licensePlatesNeedDelete)) {
                truckService.delete(licensePlatesNeedDelete);
                break;
            } else if (motorbikeService.searchByLicensePlates(licensePlatesNeedDelete)) {
                motorbikeService.delete(licensePlatesNeedDelete);
                break;
            } else {
                try {
                    throw new NotFoundVehicelException("License Plates does not exist");
                } catch (NotFoundVehicelException e) {
                    e.printStackTrace();
                }
            }
        } while (true);
    }

    private void displayVehicle(Scanner scanner) {
        System.out.println("-----DISPLAY VEHICLE----- ");
        System.out.println("1. Display Truck");
        System.out.println("2. Display Car");
        System.out.println("3. Display Motorbike");
        int displayChoice = Integer.parseInt(scanner.nextLine());
        switch (displayChoice) {
            case 1:
                truckService.display();
                break;
            case 2:
                carService.display();
                break;
            case 3:
                motorbikeService.display();
                break;
        }
    }

    private void addVehicle(Scanner scanner) {
        System.out.println("-----ADD VEHICLE----- ");
        System.out.println("1. Add Truck");
        System.out.println("2. Add Car");
        System.out.println("3. Add Motorbike");
        int addChoice = Integer.parseInt(scanner.nextLine());
        switch (addChoice) {
            case 1:
                truckService.add();
                break;
            case 2:
                carService.add();
                break;
            case 3:
                motorbikeService.add();
                break;
        }
    }
}
