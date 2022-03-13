package read_and_write_file_review.utils;

import read_and_write_file_review.models.Car;
import read_and_write_file_review.models.Motorbike;
import read_and_write_file_review.models.Truck;
import read_and_write_file_review.models.VehicleBrand;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    private static List<String> readListStringFromCSV(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<Car> readCarListFromCSV(String filePath) {
        List<Car> carList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            Car car = new Car(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3], Integer.parseInt(arr[4]), arr[5]);
            carList.add(car);
        }
        return carList;
    }

    public static List<Truck> readTruckListFromCSV(String filePath) {
        List<Truck> truckList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            Truck truck = new Truck(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3], Double.parseDouble(arr[4]));
            truckList.add(truck);
        }
        return truckList;
    }

    public static List<Motorbike> readMotorbikeListFromCSV(String filePath) {
        List<Motorbike> motorbikeList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            Motorbike motorbike = new Motorbike(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3], Double.parseDouble(arr[4]));
            motorbikeList.add(motorbike);
        }
        return motorbikeList;
    }

    public static List<VehicleBrand> readVehicleBrandListFromCSV(String filePath) {
        List<VehicleBrand> vehicleBrands = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            VehicleBrand vehicleBrand = new VehicleBrand(arr[0], arr[1], arr[2]);
            vehicleBrands.add(vehicleBrand);
        }
        return vehicleBrands;
    }

    private static void writeListStringToCSV(String filePath, List<String> stringList) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeListCarToCSV(String filePath, List<Car> carList) {
        List<String> stringList = new ArrayList<>();
        for (Car car : carList) {
            stringList.add(car.getInfoToCSV());
        }
        writeListStringToCSV(filePath, stringList);
    }

    public static void writeListTruckToCSV(String filePath, List<Truck> truckList) {
        List<String> stringList = new ArrayList<>();
        for (Truck truck : truckList) {
            stringList.add(truck.getInfoToCSV());
        }
        writeListStringToCSV(filePath, stringList);
    }

    public static void writeListMotorbikeToCSV(String filePath, List<Motorbike> motorbikeList) {
        List<String> stringList = new ArrayList<>();
        for (Motorbike motorbike : motorbikeList) {
            stringList.add(motorbike.getInfoToCSV());
        }
        writeListStringToCSV(filePath, stringList);
    }
}
