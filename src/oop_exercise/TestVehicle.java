package oop_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestVehicle {
    public static void main(String[] args) {
        Car car1 = new Car("43A-123.45", "Audi", 2020, "Phan An", 2, "Thể Thao");
        Car car2 = new Car("43A-168.68", "Lambo", 2021, "An An", 2, "Thể Thao");
        Truck truck1 = new Truck("43C-666.66", "Dongfeng", 2018, "Nghĩa", 3);
        Truck truck2 = new Truck("43C-888.66", "Dongfeng", 2014, "Hoàng", 3);
        Motorbike motorbike1 = new Motorbike("43C1-519.00", "Honda", 2015, "an123", 110);
        Motorbike motorbike2 = new Motorbike("43C1-681.68", "Honda", 2015, "an111", 110);


        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(car1);
        vehicleList.add(car2);
        vehicleList.add(truck1);
        vehicleList.add(truck2);
        vehicleList.add(motorbike1);
        vehicleList.add(motorbike2);
//        System.out.println(vehicleList);

        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        //Tạo menu
        do {
            System.out.println("-----SELECT FUNCTION-----");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Display Vehicle");
            System.out.println("3. Delete Vehicle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            int addChoice = -1;
            int displayChoice = -1;
            String licensePlates;
            String brand;
            int yearOfManufacture;
            String owner;
            switch (choice) {
                //chức năng thêm xe
                case 1:
                    System.out.println("-----ADD VEHICLE----- ");
                    System.out.println("1. Add Truck");
                    System.out.println("2. Add Car");
                    System.out.println("3. Add Motorbike");
                    addChoice = Integer.parseInt(scanner.nextLine());
                    switch (addChoice) {
                        //chức năng xoá xe tải
                        case 1:
                            System.out.println("---ADD TRUCK---");
                            System.out.println("Enter License Plates");
                            licensePlates = scanner.nextLine();
                            System.out.println("Enter Brand");
                            brand = scanner.nextLine();
                            System.out.println("Enter Year Of Manufacture");
                            yearOfManufacture = Integer.parseInt(scanner.nextLine());
                            System.out.println("Enter Owner");
                            owner = scanner.nextLine();
                            System.out.println("Enter Tonnage");
                            double tonnage = Double.parseDouble(scanner.nextLine());
                            Truck truck = new Truck(licensePlates, brand, yearOfManufacture, owner, tonnage);
                            vehicleList.add(truck);
                            break;
                        //chức năng xoá xe ô tô
                        case 2:
                            System.out.println("---ADD CAR---");
                            System.out.println("Enter License Plates");
                            licensePlates = scanner.nextLine();
                            System.out.println("Enter Brand");
                            brand = scanner.nextLine();
                            System.out.println("Enter Year Of Manufacture");
                            yearOfManufacture = Integer.parseInt(scanner.nextLine());
                            System.out.println("Enter Owner");
                            owner = scanner.nextLine();
                            System.out.println("Enter Seat");
                            int seat = Integer.parseInt(scanner.nextLine());
                            System.out.println("Enter Type of Car");
                            String type = scanner.nextLine();
                            Car car = new Car(licensePlates, brand, yearOfManufacture, owner, seat, type);
                            vehicleList.add(car);
                            break;
                        //chức năng xoá xe máy
                        case 3:
                            System.out.println("---ADD MOTORBIKE---");
                            System.out.println("Enter License Plates");
                            licensePlates = scanner.nextLine();
                            System.out.println("Enter Brand");
                            brand = scanner.nextLine();
                            System.out.println("Enter Year Of Manufacture");
                            yearOfManufacture = Integer.parseInt(scanner.nextLine());
                            System.out.println("Enter Owner");
                            owner = scanner.nextLine();
                            System.out.println("Enter Capacity");
                            double capacity = Double.parseDouble(scanner.nextLine());
                            Motorbike motorbike = new Motorbike(licensePlates, brand, yearOfManufacture, owner, capacity);
                            vehicleList.add(motorbike);
                            break;
                    }
                    break;
                //chức năng hiển thị xe
                case 2:
                    System.out.println("-----DISPLAY VEHICLE----- ");
                    System.out.println("1. Display Truck");
                    System.out.println("2. Display Car");
                    System.out.println("3. Display Motorbike");
                    displayChoice = Integer.parseInt(scanner.nextLine());
                    switch (displayChoice) {
                        //chức năng hiển thị xe tải
                        case 1:
                            System.out.println("---DISPLAY TRUCK---");
                            for (Vehicle element : vehicleList) {
                                if (element instanceof Truck) {
                                    System.out.println(element.toString());
                                }
                            }
                            break;
                        //chức năng hiển thị xe ô tô
                        case 2:
                            System.out.println("---DISPLAY CAR---");
                            for (Vehicle element : vehicleList) {
                                if (element instanceof Car) {
                                    System.out.println(element.toString());
                                }
                            }
                            break;
                        //chức năng hiển thị xe máy
                        case 3:
                            System.out.println("---DISPLAY MOTORBIKE---");
                            for (Vehicle element : vehicleList) {
                                if (element instanceof Motorbike) {
                                    System.out.println(element.toString());
                                }
                            }
                            break;
                    }
                    break;
                //chức năng xoá xe
                case 3:
                    System.out.println("-----DELETE VEHICLE-----");
                    System.out.println("Enter License Plates Need Delete");
                    String licensePlatesNeedDelete = scanner.nextLine();
                    System.out.println("Do you want to delete?");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    int deleteChoice = Integer.parseInt(scanner.nextLine());
                    if (deleteChoice == 1) {
                        System.out.println("Vehicle has license plates " + licensePlatesNeedDelete + " has been deleted");
                        vehicleList.removeIf(element -> licensePlatesNeedDelete.equals(element.getLicensePlates()));
                        //nếu BKS nhập vào giống với BKS đã xoá, thì xoá phương tiện
                    } else {
                        System.out.println("Vehicle has license plates " + licensePlatesNeedDelete + " is NOT delete");
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!");
            }
        } while (true);
    }
}
