package case_study.services.booking.impl;

import case_study.models.booking.Booking;
import case_study.models.enums.CustomerType;
import case_study.models.enums.RentType;
import case_study.models.facility.Facility;
import case_study.models.facility.Room;
import case_study.models.person.Customer;
import case_study.models.person.Person;
import case_study.services.booking.IBookingService;
import case_study.utils.BookingComparator;
import case_study.utils.ReadAndWriteFile;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImpl implements IBookingService {
    public static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Person> customerList;
    static List<Facility> roomList;
    static List<Facility> houseList;
    static List<Facility> villaList;
    public static final String CUSTOMER_FILE = "src\\case_study\\data\\customer_list.csv";
    public static final String VILLA_FILE = "src\\case_study\\data\\villa_list.csv";
    public static final String ROOM_FILE = "src\\case_study\\data\\room_list.csv";
    public static final String HOUSE_FILE = "src\\case_study\\data\\house_list.csv";


    static {
        customerList = ReadAndWriteFile.readCustomerListFromCSV(CUSTOMER_FILE);
        villaList = ReadAndWriteFile.readVillaListFromCSV(VILLA_FILE);
        roomList = ReadAndWriteFile.readRoomListFromCSV(ROOM_FILE);
        houseList = ReadAndWriteFile.readHouseListFromCSV(HOUSE_FILE);
        bookingSet.add(new Booking("B1111", "29/04/2022", "08/05/2022", new Customer("Phan Lê Duy Uyên",
                "03/07/1997", "Female", "111222111", "0779493844", "pldu@gmail.com",
                "C1002", CustomerType.DIAMOND, "SG"), new Room("SVRO-8899", "Room223", 60,
                2000000, 4, RentType.MONTH, "Buffet")));
    }

    @Override
    public void add(Object object) {
        bookingSet.add((Booking) object);
        System.out.println("Successfully Added");
        displayList();
    }

    @Override
    public void displayList() {
        for (Booking booking : bookingSet) {
            System.out.println(booking);
        }
    }


    @Override
    public Set<Booking> getList() {
        return bookingSet;
    }
}
