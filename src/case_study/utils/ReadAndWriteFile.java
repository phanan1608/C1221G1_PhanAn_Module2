package case_study.utils;

import case_study.models.booking.Booking;
import case_study.models.booking.Contract;
import case_study.models.enums.AcademicLevel;
import case_study.models.enums.CustomerType;
import case_study.models.enums.JobTitle;
import case_study.models.enums.RentType;
import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.models.person.Customer;
import case_study.models.person.Employee;
import case_study.models.person.Person;
import case_study.services.facility.impl.HouseServiceImpl;
import case_study.services.facility.impl.RoomServiceImpl;
import case_study.services.facility.impl.VillaServiceImpl;
import case_study.services.person.impl.CustomerServiceImpl;

import java.io.*;
import java.util.*;

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

    public static List<Person> readEmployeeListFromCSV(String filePath) {
        List<Person> employeeList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            String fullName = arr[0];
            String dayOfBirth = arr[1];
            String gender = arr[2];
            String identityCard = arr[3];
            String telephoneNumber = arr[4];
            String emailAddress = arr[5];
            String employeeId = arr[6];
            AcademicLevel academicLevel = AcademicLevel.valueOf(arr[7]);
            JobTitle jobTitle = JobTitle.valueOf(arr[8]);
            double salary = Double.parseDouble(arr[9]);
            Employee employee = new Employee(fullName, dayOfBirth, gender, identityCard, telephoneNumber,
                    emailAddress, employeeId, academicLevel, jobTitle, salary);
            employeeList.add(employee);
        }
        return employeeList;
    }

    public static List<Person> readCustomerListFromCSV(String filePath) {
        List<Person> customerList = new LinkedList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            String fullName = arr[0];
            String dayOfBirth = arr[1];
            String gender = arr[2];
            String identityCard = arr[3];
            String telephoneNumber = arr[4];
            String emailAddress = arr[5];
            String customerId = arr[6];
            CustomerType customerType = CustomerType.valueOf(arr[7]);
            String address = arr[8];
            Customer customer = new Customer(fullName, dayOfBirth, gender, identityCard, telephoneNumber,
                    emailAddress, customerId, customerType, address);
            customerList.add(customer);
        }
        return customerList;
    }

    public static List<Contract> readContractListFromCSV(String filePath) {
        List<Contract> contractList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            int contractNumber = Integer.parseInt(arr[0]);
            String bookingCode = arr[1];
            double depositMoney = Double.parseDouble(arr[2]);
            double totalMoney = Double.parseDouble(arr[3]);
            String customerId = arr[4];
            Contract contract = new Contract(contractNumber, bookingCode, depositMoney, totalMoney, customerId);
            contractList.add(contract);
        }
        return contractList;
    }

    public static Set<Booking> readBookingListFromCSV(String filePath) throws ParseObjectException {
        Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
        List<String> stringList = readListStringFromCSV(filePath);
        RoomServiceImpl roomService = new RoomServiceImpl();
        HouseServiceImpl houseService = new HouseServiceImpl();
        VillaServiceImpl villaService = new VillaServiceImpl();
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            String bookingCode = arr[0];
            String startDate = arr[1];
            String endDate = arr[2];
            Customer customer;
            String customerID = arr[3];
            customer = CustomerServiceImpl.findCustomerById(customerID);
            if (customer == null) {
                throw new ParseObjectException("Customer Id Invalid");
            }
            Facility facility;
            String facilityID = arr[4];
            if (facilityID.startsWith("SVVL")) {
                facility = villaService.findVillaById(facilityID);
            } else if (facilityID.startsWith("SVRO")) {
                facility = roomService.findRoomById(facilityID);
            } else if (facilityID.startsWith("SVHO")) {
                facility = houseService.findHouseById(facilityID);
            } else {
                facility = null;
            }
            if (facility == null) {
                throw new ParseObjectException("Facility Id Invalid");
            }
            Booking booking = new Booking(bookingCode, startDate, endDate, customer, facility);
            bookingSet.add(booking);
        }
        return bookingSet;
    }

    public static List<Facility> readVillaListFromCSV(String filePath) {
        List<Facility> villaList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            String serviceId = arr[0];
            String nameService = arr[1];
            double usableArea = Double.parseDouble(arr[2]);
            double rentCost = Double.parseDouble(arr[3]);
            int maximumPeopleNumber = Integer.parseInt(arr[4]);
            RentType rentType = RentType.valueOf(arr[5]);
            String roomStandard = arr[6];
            double poolArea = Double.parseDouble(arr[7]);
            int numberOfFloors = Integer.parseInt(arr[8]);
            Villa villa = new Villa(serviceId, nameService, usableArea, rentCost, maximumPeopleNumber,
                    rentType, roomStandard, poolArea, numberOfFloors);
            villaList.add(villa);
        }
        return villaList;
    }

    public static List<Facility> readHouseListFromCSV(String filePath) {
        List<Facility> houseList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            String serviceId = arr[0];
            String nameService = arr[1];
            double usableArea = Double.parseDouble(arr[2]);
            double rentCost = Double.parseDouble(arr[3]);
            int maximumPeopleNumber = Integer.parseInt(arr[4]);
            RentType rentType = RentType.valueOf(arr[5]);
            String roomStandard = arr[6];
            int numberOfFloors = Integer.parseInt(arr[7]);
            House house = new House(serviceId, nameService, usableArea, rentCost, maximumPeopleNumber,
                    rentType, roomStandard, numberOfFloors);
            houseList.add(house);
        }
        return houseList;
    }

    public static List<Facility> readRoomListFromCSV(String filePath) {
        List<Facility> roomList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            String serviceId = arr[0];
            String nameService = arr[1];
            double usableArea = Double.parseDouble(arr[2]);
            double rentCost = Double.parseDouble(arr[3]);
            int maximumPeopleNumber = Integer.parseInt(arr[4]);
            RentType rentType = RentType.valueOf(arr[5]);
            String freeService = arr[6];
            Room room = new Room(serviceId, nameService, usableArea, rentCost, maximumPeopleNumber,
                    rentType, freeService);
            roomList.add(room);
        }
        return roomList;
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

    public static void writeListPersonToCSV(String filePath, List<Person> personList) {
        List<String> stringList = new ArrayList<>();
        for (Person person : personList) {
            stringList.add(person.getInfoToCSV());
        }
        writeListStringToCSV(filePath, stringList);
    }

    public static void writeListFacilityToCSV(String filePath, List<Facility> facilityList) {
        List<String> stringList = new ArrayList<>();
        for (Facility facility : facilityList) {
            stringList.add(facility.getInfoToCSV());
        }
        writeListStringToCSV(filePath, stringList);
    }

    public static void writeListContractToCSV(String filePath, List<Contract> contractList) {
        List<String> stringList = new ArrayList<>();
        for (Contract contract : contractList) {
            stringList.add(contract.getInfoToCSV());
        }
        writeListStringToCSV(filePath, stringList);
    }

    public static void writeListBookingToCSV(String filePath, Set<Booking> bookingList) {
        List<String> stringList = new ArrayList<>();
        for (Booking booking : bookingList) {
            stringList.add(booking.getInfoToCSV());
        }
        writeListStringToCSV(filePath, stringList);
    }

    public static void writeListFacilityMaintainToCSV(String filePath, List<Contract> contractList) {
        List<String> stringList = new ArrayList<>();
        for (Contract contract : contractList) {
            stringList.add(contract.getInfoToCSV());
        }
        writeListStringToCSV(filePath, stringList);
    }

    public static void writeFacilityMapToCSVFile(String filePath, Map<Facility, Integer> map) {
        File file = new File(filePath);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            Set<Facility> facilities = map.keySet();
            for (Facility facility : facilities) {
                bufferedWriter.write(facility.getServiceId() + "," + map.get(facility));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Facility, Integer> readFacilityMapFromCSVFile(String filePath) throws ParseObjectException {
        Map<Facility, Integer> result = new LinkedHashMap<>();
        List<String> stringList = readListStringFromCSV(filePath);
        RoomServiceImpl roomService = new RoomServiceImpl();
        HouseServiceImpl houseService = new HouseServiceImpl();
        VillaServiceImpl villaService = new VillaServiceImpl();
        for (String line : stringList) {
            String[] field = line.split(",");
            Facility facility;
            String facilityID = field[0];
            if (facilityID.startsWith("SVRO")) {
                facility = roomService.findRoomById(facilityID);
            } else if (facilityID.startsWith("SVHO")) {
                facility = houseService.findHouseById(facilityID);
            } else if (facilityID.startsWith("SVVL")) {
                facility = villaService.findVillaById(facilityID);
            } else {
                throw new ParseObjectException("!!!CAN'T FIND FACILITY WITH THIS ID!!!");
            }
            int useTime = Integer.parseInt(field[1]);
            result.put(facility, useTime);
        }
        return result;
    }


}
