package read_and_write_file_review.services.impl;

import read_and_write_file_review.models.Truck;
import read_and_write_file_review.models.Vehicle;
import read_and_write_file_review.services.IServices;
import read_and_write_file_review.utils.ReadAndWriteFile;
import read_and_write_file_review.utils.Validate;

import java.util.List;
import java.util.Scanner;

public class TruckServiceImpl extends VehicleServiceImpl implements IServices {
    static List<Truck> listTruck;
    public static final String TRUCK_FILE = "src\\read_and_write_file_review\\data\\TruckList.csv";

    static {
        listTruck = ReadAndWriteFile.readTruckListFromCSV(TRUCK_FILE);
    }

    static Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("---ADD TRUCK---");
        String licensePlates = getLicensePlates();
        super.add();
        System.out.println("Enter Tonnage");
        double tonnage = Double.parseDouble(scanner.nextLine());
        Truck truck = new Truck(licensePlates, brand, yearOfManufacture, owner, tonnage);
        listTruck.add(truck);
        ReadAndWriteFile.writeListTruckToCSV(TRUCK_FILE, listTruck);
    }

    @Override
    public void display() {
        System.out.println("---DISPLAY TRUCK---");
        for (Vehicle trucks : listTruck) {
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
                    break;
                }
            }
        }
        ReadAndWriteFile.writeListTruckToCSV(TRUCK_FILE, listTruck);
    }

    @Override
    public boolean searchByLicensePlates(String licensePlates) {
        for (Truck truck : listTruck) {
            if (truck.getLicensePlates().equals(licensePlates)) {
                return true;
            }
        }
        return false;
    }

    private String getLicensePlates() {
        String licensePlates;
        do {
            System.out.println("Enter License Plates (XXC-XXX.XX (X : 0÷9))");
            licensePlates = scanner.nextLine();
            if (searchByLicensePlates(licensePlates)) {
                System.err.println("License Plates already already exists!!! Please Re-Enter");
            } else if (!Validate.checkTruckLicensePlates(licensePlates)) {
                System.err.println("Invalid license plate!!! Please Re-Enter");
            } else break;
        } while (true);
        return licensePlates;
    }
}
