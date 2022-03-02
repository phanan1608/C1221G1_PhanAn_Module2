package oop_exercise_vehicle.oop_exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class TruckController {
    static ArrayList<Truck> listTruck = new ArrayList<>();

    static {
        listTruck.add(new Truck("43C-666.66", "Dongfeng", 2018, "Nghĩa", 3));
        listTruck.add(new Truck("43C-888.66", "Dongfeng", 2014, "Hoàng", 3));
    }

    static Scanner scanner = new Scanner(System.in);

    public static void addVehicle() {
        System.out.println("---ADD TRUCK---");
        System.out.println("Enter License Plates");
        String licensePlates = scanner.nextLine();
        System.out.println("Enter Brand");
        String brand = scanner.nextLine();
        System.out.println("Enter Year Of Manufacture");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Owner");
        String owner = scanner.nextLine();
        System.out.println("Enter Tonnage");
        double tonnage = Double.parseDouble(scanner.nextLine());
        Truck truck = new Truck(licensePlates, brand, yearOfManufacture, owner, tonnage);
        listTruck.add(truck);
    }

    public static void displayVehicle() {
        for (Truck trucks : listTruck) {
            System.out.println(trucks);
        }
    }

    public static void deleteVehicle(String licensePlatesDelete) {
        for (int i = 0; i < listTruck.size(); i++) {
            if (licensePlatesDelete.equals(listTruck.get(i).getLicensePlates())) {
                System.out.println("You need delete vehicle have License Plates " + listTruck.get(i).getLicensePlates());
                System.out.println("1. Yes");
                System.out.println("2. No");
                int choiceDelete = Integer.parseInt(scanner.nextLine());
                if (choiceDelete == 1) {
                    System.out.println("The truck has been deleted");
                    listTruck.remove(listTruck.get(i));
                } else {
                    System.out.println("The truck has not been deleted");
                }
            }
        }
    }
}
