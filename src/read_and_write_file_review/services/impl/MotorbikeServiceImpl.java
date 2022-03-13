package read_and_write_file_review.services.impl;

import read_and_write_file_review.models.Motorbike;
import read_and_write_file_review.models.Vehicle;
import read_and_write_file_review.services.IServices;
import read_and_write_file_review.utils.ReadAndWriteFile;
import read_and_write_file_review.utils.Validate;

import java.util.List;
import java.util.Scanner;

public class MotorbikeServiceImpl extends VehicleServiceImpl implements IServices {
    static List<Motorbike> listMotorbike;
    public static final String MOTORBIKE_FILE = "src\\read_and_write_file_review\\data\\MotorbikeList.csv";

    static {
        listMotorbike = ReadAndWriteFile.readMotorbikeListFromCSV(MOTORBIKE_FILE);
    }

    static Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("---ADD MOTORBIKE---");
        String licensePlates = getLicensePlates();
        super.add();
        System.out.println("Enter Capacity");
        double capacity = Double.parseDouble(scanner.nextLine());
        Motorbike motorbike = new Motorbike(licensePlates, brand, yearOfManufacture, owner, capacity);
        listMotorbike.add(motorbike);
        ReadAndWriteFile.writeListMotorbikeToCSV(MOTORBIKE_FILE, listMotorbike);
    }

    @Override
    public void display() {
        System.out.println("---DISPLAY MOTORBIKE---");
        for (Vehicle motorbikes : listMotorbike) {
            System.out.println(motorbikes);
        }
    }

    @Override
    public void delete(String licensePlatesDelete) {
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
                    break;
                }
            }
        }
        ReadAndWriteFile.writeListMotorbikeToCSV(MOTORBIKE_FILE, listMotorbike);
    }

    @Override
    public boolean searchByLicensePlates(String licensePlates) {
        for (Motorbike motorbike : listMotorbike) {
            if (motorbike.getLicensePlates().equals(licensePlates)) {
                return true;
            }
        }
        return false;
    }

    private String getLicensePlates() {
        String licensePlates;
        do {
            System.out.println("Enter License Plates");
            licensePlates = scanner.nextLine();
            if (searchByLicensePlates(licensePlates)) {
                System.err.println("License Plates already already exists!!! Please Re-Enter");
            } else if (!Validate.checkMotorbikeLicensePlates(licensePlates)) {
                System.err.println("Invalid license plate!!! Please Re-Enter");
            } else break;
        } while (true);
        return licensePlates;
    }
}
