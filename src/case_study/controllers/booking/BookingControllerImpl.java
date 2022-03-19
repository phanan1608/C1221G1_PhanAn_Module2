package case_study.controllers.booking;

import case_study.models.booking.Booking;
import case_study.models.facility.Facility;
import case_study.models.person.Customer;
import case_study.services.booking.impl.BookingServiceImpl;
import case_study.services.facility.IHouseService;
import case_study.services.facility.IRoomService;
import case_study.services.facility.IVillaService;
import case_study.services.facility.impl.HouseServiceImpl;
import case_study.services.facility.impl.RoomServiceImpl;
import case_study.services.facility.impl.VillaServiceImpl;
import case_study.services.person.ICustomerService;
import case_study.services.person.impl.CustomerServiceImpl;
import case_study.utils.InputData;
import case_study.utils.Validate;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BookingControllerImpl {
    ICustomerService customerService = new CustomerServiceImpl();
    IRoomService roomService = new RoomServiceImpl();
    IHouseService houseService = new HouseServiceImpl();
    IVillaService villaService = new VillaServiceImpl();
    Scanner scanner = new Scanner(System.in);

    public Object inputInformation() {
        String bookingCode = getBookingCodeFromInput();
        String startDate = getStartDateFromInput();
        String endDate;
        endDate = getEndDateFromInput(startDate);
        Customer customer = getCustomerFromInput();
        Facility facility = getFacilityFromInput();
        return new Booking(bookingCode, startDate, endDate, customer, facility);
    }

    public String getBookingCodeFromInput() {
        int id = 1;
        if (BookingServiceImpl.bookingSet.size() != 0) {
            id = BookingServiceImpl.bookingSet.size() + 1;
        }
        return Integer.toString(id);
//        System.out.print("Enter Booking Code: ");
//        return Validate.regexBookingCode(scanner.nextLine(),
//                "Invalid Booking Code. Please Re-enter (XYYYYYY- X:B Y:number)!!!");
    }

    public String getStartDateFromInput() {
        String startDate;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        do {
            System.out.print("Enter Start Date: ");
            startDate = Validate.regexDate(scanner.nextLine(), "Invalid Date. Please Re-enter(dd/mm/yyyy)");
            LocalDate startDateFormat = LocalDate.parse(startDate, formatter);
            LocalDate now = LocalDate.now();
            int day = Period.between(now, startDateFormat).getDays();
            if (day < 0) {
                System.out.print("Date in the past!!! Please re-enter");
            } else {
                return startDate;
            }
        } while (true);
    }

    private String getEndDateFromInput(String startDate) {
        String endDate;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        do {
            System.out.print("Enter End Date: ");
            endDate = Validate.regexDate(scanner.nextLine(), "Invalid Date. Please Re-enter(dd/mm/yyyy)");
            LocalDate endDateFormat = LocalDate.parse(endDate, formatter);
            LocalDate startDateFormat = LocalDate.parse(startDate, formatter);
            int day = Period.between(startDateFormat, endDateFormat).getDays();
            if (day <= 0) {
                System.out.print("The End Date must be after the Start Date!!! Please re-enter");
            } else {
                break;
            }
        } while (true);
        return endDate;
    }

    public Customer getCustomerFromInput() {
        do {
            int index;
            customerService.displayList();
            System.out.print("Enter index of customer you want to choose");
            index = InputData.inputIntegerChoice();
            if (index < 0 || index >= CustomerServiceImpl.listCustomer.size()) {
                System.out.println("You entered wrong. Please re-enter index of Customer");
            } else {
                return (Customer) CustomerServiceImpl.listCustomer.get(index);
            }
        } while (true);
    }

    public Facility getFacilityFromInput() {
        System.out.println("Facility Type");
        System.out.println("1.House");
        System.out.println("2.Room");
        System.out.println("3.Villa");
        System.out.print("Enter facility type you want to choose: ");
        do {
            int choice = InputData.inputIntegerChoice();
            switch (choice) {
                case 1:
                    do {
                        int index;
                        houseService.displayList();
                        System.out.print("Enter index of House you want to choose");
                        index = InputData.inputIntegerChoice();
                        if (index < 0 || index >= HouseServiceImpl.houseList.size()) {
                            System.out.println("You entered wrong. Please re-enter index of House");
                        } else {
                            return HouseServiceImpl.houseList.get(index);
                        }
                    } while (true);
                case 2:
                    do {
                        int index;
                        roomService.displayList();
                        System.out.print("Enter index of Room you want to choose");
                        index = InputData.inputIntegerChoice();
                        if (index < 0 || index >= RoomServiceImpl.roomList.size()) {
                            System.out.println("You entered wrong. Please re-enter index of Room");
                        } else {
                            return RoomServiceImpl.roomList.get(index);
                        }
                    } while (true);
                case 3:
                    do {
                        int index;
                        villaService.displayList();
                        System.out.print("Enter index of Villa you want to choose");
                        index = InputData.inputIntegerChoice();
                        if (index < 0 || index >= VillaServiceImpl.villaList.size()) {
                            System.out.println("You entered wrong. Please re-enter index of Villa");
                        } else {
                            return VillaServiceImpl.villaList.get(index);
                        }
                    } while (true);
                default:
                    System.out.println("Only choice 1,2 or 3");
            }
        } while (true);
    }
}
