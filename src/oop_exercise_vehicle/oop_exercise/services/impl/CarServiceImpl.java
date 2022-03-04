package oop_exercise_vehicle.oop_exercise.services.impl;

import oop_exercise_vehicle.oop_exercise.models.Car;
import oop_exercise_vehicle.oop_exercise.services.IServices;

import java.util.ArrayList;
import java.util.Scanner;

import static oop_exercise_vehicle.oop_exercise.services.impl.ManufactureBrandList.vehicleBrands;

public class CarServiceImpl implements IServices {
    public static ArrayList<Car> listCar = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        listCar.add(new Car("43A.123.23", vehicleBrands[4].getManufacturingBrand(), 2020, "Phan An", 5, "Du lịch"));
        listCar.add(new Car("43A.681.68", vehicleBrands[5].getManufacturingBrand(), 2015, "An An", 2, "Thể thao"));
        listCar.add(new Car("43A.111.11", vehicleBrands[6].getManufacturingBrand(), 2018, "An123", 7, "Gia đình"));
    }

    @Override
    public void add() {
        System.out.println("---ADD CAR---");
        System.out.println("Enter License Plates");
        String licensePlates = scanner.nextLine();
        System.out.println("Choose Vehicle Brand");
        for (int j = 0; j < vehicleBrands.length; j++) {
            System.out.printf("%d. %s\n", j + 1, vehicleBrands[j].getManufacturingBrand());
        }
        int manufacturingBrand = Integer.parseInt(scanner.nextLine());
        String brand = vehicleBrands[manufacturingBrand].getManufacturingBrand();
        System.out.println("Enter Year Of Manufacture");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine()) - 1;
        System.out.println("Enter Owner");
        String owner = scanner.nextLine();
        System.out.println("Enter Seat");
        int seat = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Type of Car");
        String type = scanner.nextLine();
        Car car = new Car(licensePlates, brand, yearOfManufacture, owner, seat, type);
        listCar.add(car);
    }

    @Override
    public void display() {
        System.out.println("---DISPLAY CAR---");
        for (Car cars : listCar) {
            System.out.println(cars);
        }
    }

    @Override
    public void delete(String licensePlatesDelete) {
        for (int i = 0; i < listCar.size(); i++) {
            if (licensePlatesDelete.equals(listCar.get(i).getLicensePlates())) {
                System.out.println("You need delete vehicle have License Plates " + listCar.get(i).getLicensePlates());
                System.out.println("1. Yes");
                System.out.println("2. No");
                int choiceDelete = Integer.parseInt(scanner.nextLine());
                if (choiceDelete == 1) {
                    System.out.println("The car has been deleted");
                    listCar.remove(listCar.get(i));
                } else {
                    System.out.println("The car has not been deleted");
                }
            }
        }
    }


}
