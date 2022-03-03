package oop_exercise_vehicle.oop_exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorbikeController extends ManufactureBrand {
    static ArrayList<Motorbike> listMotorbike = new ArrayList<>();

    static {
        listMotorbike.add(new Motorbike("43C1-519.00", vehicleBrands[2].getManufacturingBrand(), 2015, "an123", 110));
        listMotorbike.add(new Motorbike("43C1-519.19", vehicleBrands[3].getManufacturingBrand(), 2018, "an111", 150));
    }

    static Scanner scanner = new Scanner(System.in);

    public static void addVehicle() {
        System.out.println("Enter License Plates");
        String licensePlates = scanner.nextLine();
        System.out.println("Choose Vehicle Brand");
        for (int j = 0; j < vehicleBrands.length; j++) {
            System.out.printf("%d. %s\n", j + 1, vehicleBrands[j].getManufacturingBrand());
        }
        int manufacturingBrand = Integer.parseInt(scanner.nextLine()) - 1;
        String brand = vehicleBrands[manufacturingBrand].getManufacturingBrand();
        System.out.println("Enter Year Of Manufacture");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Owner");
        String owner = scanner.nextLine();
        System.out.println("Enter Capacity");
        double capacity = Double.parseDouble(scanner.nextLine());
        Motorbike motorbike = new Motorbike(licensePlates, brand, yearOfManufacture, owner, capacity);
        listMotorbike.add(motorbike);
    }

    public static void displayVehicle() {
        for (Motorbike motorbikes : listMotorbike) {
            System.out.println(motorbikes);
        }
    }

    public static void deleteVehicle(String licensePlatesDelete) {
        for (int i = 0; i < listMotorbike.size(); i++) {
            if (licensePlatesDelete.equals(listMotorbike.get(i).getLicensePlates())) {
                System.out.println("You need delete vehicle have License Plates " + listMotorbike.get(i).getLicensePlates());
                System.out.println("1. Yes");
                System.out.println("2. No");
                int choiceDelete = Integer.parseInt(scanner.nextLine());
                if (choiceDelete == 1) {
                    System.out.println("The motorbike has been deleted");
                    listMotorbike.remove(listMotorbike.get(i));
                } else {
                    System.out.println("The motorbike has not been deleted");
                }
            }
        }
    }
}
