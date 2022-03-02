package oop_exercise_vehicle.oop_exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class CarController {
    public static ArrayList<Car> listCar = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        listCar.add(new Car("43A.123.23", "Honda", 2020, "Phan An", 5, "Du lịch"));
        listCar.add(new Car("43A.681.68", "Honda", 2015, "An An", 2, "Thể thao"));
        listCar.add(new Car("43A.111.11", "Mazda", 2018, "An123", 7, "Gia đình"));
    }

    public static void addVehicle() {
        System.out.println("Enter License Plates");
        String licensePlates = scanner.nextLine();
        System.out.println("Enter Brand");
        String brand = scanner.nextLine();
        System.out.println("Enter Year Of Manufacture");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Owner");
        String owner = scanner.nextLine();
        System.out.println("Enter Seat");
        int seat = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Type of Car");
        String type = scanner.nextLine();
        Car car = new Car(licensePlates, brand, yearOfManufacture, owner, seat, type);
        listCar.add(car);
    }


    public static void displayVehicle() {
        for (Car cars : listCar) {
            System.out.println(cars);
        }
    }

    public static void deleteVehicle(String licensePlatesDelete) {
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
