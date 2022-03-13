package read_and_write_file_review.services.impl;

import read_and_write_file_review.models.Car;
import read_and_write_file_review.models.Vehicle;
import read_and_write_file_review.services.IServices;
import read_and_write_file_review.utils.ReadAndWriteFile;
import read_and_write_file_review.utils.Validate;

import java.util.List;
import java.util.Scanner;

public class CarServiceImpl extends VehicleServiceImpl implements IServices {
    public static List<Car> listCar;
    public static final String CAR_FILE = "src\\read_and_write_file_review\\data\\CarList.csv";

    static Scanner scanner = new Scanner(System.in);

    static {
        listCar = ReadAndWriteFile.readCarListFromCSV(CAR_FILE);
    }

    @Override
    public void add() {
        System.out.println("---ADD CAR---");
        String type = "";
        int choseCarType;
        do {
            System.out.println("Enter Type of Car");
            System.out.println("1.Travel");
            System.out.println("2. Bus");
            choseCarType = Integer.parseInt(scanner.nextLine());
            switch (choseCarType) {
                case 1:
                    type = "travel";
                    break;
                case 2:
                    type = "bus";
                    break;
                default:
                    System.out.println("Only chose 1 or 2");
            }
        } while (choseCarType != 1 && choseCarType != 2);
        String licensePlates = getLicensePlates(type);
        super.add();
        System.out.println("Enter Seat");
        int seat = Integer.parseInt(scanner.nextLine());
        Car car = new Car(licensePlates, brand, yearOfManufacture, owner, seat, type);
        listCar.add(car);
        ReadAndWriteFile.writeListCarToCSV(CAR_FILE, listCar);
    }

    @Override
    public void display() {
        System.out.println("---DISPLAY CAR---");
        for (Vehicle cars : listCar) {
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
                    break;
                }
            }
        }
        ReadAndWriteFile.writeListCarToCSV(CAR_FILE, listCar);
    }

    @Override
    public boolean searchByLicensePlates(String licensePlates) {
        for (Car cars : listCar) {
            if (cars.getLicensePlates().equals(licensePlates)) {
                return true;
            }
        }
        return false;
    }

    private String getLicensePlates(String type) {
        String licensePlates;
        do {
            System.out.println("Enter License Plates (XXY-XXX.XX (X : 0÷9 , Y=A if travel car, Y=B  if bus)");
            licensePlates = scanner.nextLine();
            if (searchByLicensePlates(licensePlates)) {
                System.err.println("License Plates already already exists!!! Please Re-Enter");
            } else if (!Validate.checkCarLicensePlates(licensePlates, type)) {
                System.err.println("Invalid license plate!!! Please Re-Enter");
            } else break;
        } while (true);
        return licensePlates;
    }
}

