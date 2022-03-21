package case_study.services.booking.impl;

import case_study.models.booking.Booking;
import case_study.services.booking.IBookingService;
import case_study.utils.BookingComparator;
import case_study.utils.ParseObjectException;
import case_study.utils.ReadAndWriteFile;

import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImpl implements IBookingService {
    public static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    public static final String BOOKING_FILE = "src\\case_study\\data\\booking_list.csv";

    static {
//        bookingSet.add(new Booking("B11311", "29/04/2022", "08/05/2022", new Customer("Phan Lê Duy Uyên",
//                "03/07/1997", "Female", "111222111", "0779493844", "pldu@gmail.com",
//                "C1002", CustomerType.DIAMOND, "SG"), new Room("SVRO-8899", "Room223", 60,
//                2000000, 4, RentType.MONTH, "Buffet")));
//        bookingSet.add(new Booking("B12312", "29/04/2022", "08/05/2022", new Customer("Trần Thanh Vy",
//                "20/04/1997", "Female", "123122342", "01231312341", "vie@gmail.com",
//                "C1021", CustomerType.DIAMOND, "SG"), new House("SVRO-8826", "Room233", 60,
//                17777777, 5, RentType.DAY, "Normal", 2)));
//        bookingSet.add(new Booking("B32123", "22/04/2022", "23/04/2022", new Customer("Nguyễn Văn A",
//                "02/02/2022", "Female", "123436764", "01324532123", "aa@gmail.com",
//                "C31232", CustomerType.SILVER, "ĐN"), new Villa("SVVL-1222", "Villa1122", 100,
//                123123, 5, RentType.DAY, "Vip", 20, 2)));
        try {
            bookingSet = ReadAndWriteFile.readBookingListFromCSV(BOOKING_FILE);
        } catch (ParseObjectException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(Object object) {
        bookingSet.add((Booking) object);
        System.out.println("Successfully Added");
        ReadAndWriteFile.writeListBookingToCSV(BOOKING_FILE, bookingSet);
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
