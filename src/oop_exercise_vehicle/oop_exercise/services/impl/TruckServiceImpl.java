package oop_exercise_vehicle.oop_exercise.services.impl;

import oop_exercise_vehicle.oop_exercise.models.Truck;
import oop_exercise_vehicle.oop_exercise.services.IServices;

import java.util.ArrayList;
import java.util.Scanner;

import static oop_exercise_vehicle.oop_exercise.services.impl.ManufactureBrandList.vehicleBrands;

public class TruckServiceImpl implements IServices {
    static ArrayList<Truck> listTruck = new ArrayList<>();

    static {
        listTruck.add(new Truck("43C-666.66", vehicleBrands[1].getManufacturingBrand(), 2018, "Nghĩa", 3));
        listTruck.add(new Truck("43C-888.66", vehicleBrands[3].getManufacturingBrand(), 2014, "Hoàng", 3));
    }

    static Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("---ADD TRUCK---");
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
        System.out.println("Enter Tonnage");
        double tonnage = Double.parseDouble(scanner.nextLine());
        Truck truck = new Truck(licensePlates, brand, yearOfManufacture, owner, tonnage);
        listTruck.add(truck);
    }

    @Override
    public void display() {
        System.out.println("---DISPLAY TRUCK---");
        for (Truck trucks : listTruck) {
            System.out.println(trucks);
        }
    }

    @Override
    public void delete(String licensePlatesDelete) {
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
