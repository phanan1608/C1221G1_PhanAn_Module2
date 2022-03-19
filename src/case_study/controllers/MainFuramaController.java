package case_study.controllers;

import case_study.controllers.booking.BookingControllerImpl;
import case_study.controllers.facility.HouseControllersImpl;
import case_study.controllers.facility.RoomControllersImpl;
import case_study.controllers.facility.VillaControllersImpl;
import case_study.controllers.person.CustomerControllersImpl;
import case_study.controllers.person.EmployeeControllersImpl;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.services.booking.IBookingService;
import case_study.services.booking.impl.BookingServiceImpl;
import case_study.services.facility.IFacilityService;
import case_study.services.facility.IHouseService;
import case_study.services.facility.IRoomService;
import case_study.services.facility.IVillaService;
import case_study.services.facility.impl.FacilityServiceImpl;
import case_study.services.facility.impl.HouseServiceImpl;
import case_study.services.facility.impl.RoomServiceImpl;
import case_study.services.facility.impl.VillaServiceImpl;
import case_study.services.person.ICustomerService;
import case_study.services.person.IEmployeeService;
import case_study.services.person.impl.CustomerServiceImpl;
import case_study.services.person.impl.EmployeeServiceImpl;
import case_study.utils.InputData;

import java.util.Scanner;


public class MainFuramaController {
    IEmployeeService employeeService = new EmployeeServiceImpl();
    EmployeeControllersImpl employeeControllers = new EmployeeControllersImpl();
    ICustomerService customerService = new CustomerServiceImpl();
    CustomerControllersImpl customerControllers = new CustomerControllersImpl();
    IRoomService roomService = new RoomServiceImpl();
    RoomControllersImpl roomControllers = new RoomControllersImpl();
    IVillaService villaService = new VillaServiceImpl();
    VillaControllersImpl villaControllers = new VillaControllersImpl();
    IHouseService houseService = new HouseServiceImpl();
    HouseControllersImpl houseControllers = new HouseControllersImpl();
    IFacilityService facilityService = new FacilityServiceImpl();
    IBookingService bookingService = new BookingServiceImpl();
    BookingControllerImpl bookingController = new BookingControllerImpl();

    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                int choice = -1;
                System.out.println("-----DISPLAY-----");
                System.out.println("1.\tEmployee Management\n" +
                        "2.\tCustomer Management\n" +
                        "3.\tFacility Management \n" +
                        "4.\tBooking Management\n" +
                        "5.\tPromotion Management\n" +
                        "6.\tExit\n");
                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        employeeManagement();
                        break;
                    case 2:
                        customerManagement();
                        break;
                    case 3:
                        facilityManagement();
                        break;
                    case 4:
                        bookingManagement();
                        break;
                    case 5:
                        promotionManagement();
                        break;
                    case 6:
                        System.exit(6);
                    default:
                        System.out.println("No choice!");
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid Number. Please don't enter text");
            }
        } while (true);
    }

    private void promotionManagement() {
        System.out.println("PROMOTION MANAGEMENT");
        System.out.println("1.\tDisplay list customers use service\n" +
                "2.\tDisplay list customers get voucher\n" +
                "3.\tReturn main menu\n");
    }

    private void bookingManagement() {
        int choiceBooking;
        System.out.println("BOOKING MANAGEMENT");
        System.out.println("1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
                "3.\tCreate new contracts\n" +
                "4.\tDisplay list contracts\n" +
                "5.\tEdit contracts\n" +
                "6.\tReturn main menu\n");
        choiceBooking = InputData.inputIntegerChoice();
        switch (choiceBooking) {
            case 1:
                System.out.println("ADD NEW BOOKING");
                bookingService.add(bookingController.inputInformation());
                break;
            case 2:
                System.out.println("DISPLAY LIST BOOKING");
                bookingService.displayList();
                break;
            case 3:
                System.out.println("CREATE NEW CONSTRACTS");
                break;
            case 4:
                System.out.println("DISPLAY LIST CONTRACTS");
                break;
            case 5:
                System.out.println("EDIT CONTRACTS");
                break;
            case 6:
                break;
            default:
                System.out.println("Only choice 1, 2, 3 or 4!!!");
        }
    }

    private void customerManagement() {
        int choiceCustomer;
        System.out.println("CUSTOMER MANAGEMENT");
        System.out.println("1.\tDisplay list customers\n" +
                "2.\tAdd new customer\n" +
                "3.\tEdit customer\n" +
                "4.\tReturn main menu\n");
        choiceCustomer = InputData.inputIntegerChoice();
        switch (choiceCustomer) {
            case 1:
                System.out.println("DISPLAY LIST CUSTOMER");
                customerService.displayList();
                break;
            case 2:
                System.out.println("CREATE CUSTOMER");
                customerService.add(customerControllers.inputInformation());
                break;
            case 3:
                System.out.println("EDIT CUSTOMER");
                customerService.displayList();
                customerControllers.edit();
                break;
            case 4:
                break;
            default:
                System.out.println("Only choice 1, 2, 3 or 4!!!");
        }
    }

    private void employeeManagement() {
        int choiceEmployee;
        System.out.println("EMPLOYEE MANAGEMENT");
        System.out.println("1\tDisplay list employees\n" +
                "2\tAdd new employee\n" +
                "3\tEdit employee\n" +
                "4\tReturn main menu\n");
        choiceEmployee = InputData.inputIntegerChoice();
        switch (choiceEmployee) {
            case 1:
                System.out.println("DISPLAY LIST EMPLOYEES");
                employeeService.displayList();
                break;
            case 2:
                System.out.println("CREATE EMPLOYEE");
                employeeService.add(employeeControllers.inputInformation());
                break;
            case 3:
                System.out.println("EDIT EMPLOYEE");
                employeeService.displayList();
                employeeControllers.edit();
                break;
            case 4:
                break;
            default:
                System.out.println("Only choice 1, 2, 3 or 4!!!");
        }
    }

    private void facilityManagement() {
        int choiceFacility;
        System.out.println("FACILITY MANAGEMENT");
        System.out.println("1\tDisplay list facility\n" +
                "2\tAdd new facility\n" +
                "3\tDisplay list facility maintenance\n" +
                "4\tReturn main menu\n");
        choiceFacility = InputData.inputIntegerChoice();
        switch (choiceFacility) {
            case 1:
                System.out.println("DISPLAY LIST FACILITY");
                roomService.displayList();
                villaService.displayList();
                houseService.displayList();
//                facilityService.displayList();
                break;
            case 2:
                System.out.println("ADD FACILITY");
                addFacilityManagement();
                break;
            case 3:
                System.out.println("DISPLAY LIST FACILITY MAINTAIN");
                facilityService.displayMaintain();
                break;
            case 4:
                break;
            default:
                System.out.println("Only choice 1, 2, 3 or 4!!!");
        }
    }

    private void addFacilityManagement() {
        int choiceAddFacility;
        System.out.println("ADD FACILITY");
        System.out.println("1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n");
        choiceAddFacility = InputData.inputIntegerChoice();
        switch (choiceAddFacility) {
            case 1:
                System.out.println("ADD NEW HOUSE");
                House house = (House) houseControllers.inputInformation();
                houseService.add(house);
                facilityService.add(house);
                break;
            case 2:
                System.out.println("ADD NEW VILLA");
                Villa villa = (Villa) villaControllers.inputInformation();
                villaService.add(villa);
                facilityService.add(villa);
                break;
            case 3:
                System.out.println("ADD NEW ROOM");
                Room room = (Room) roomControllers.inputInformation();
                roomService.add(room);
                facilityService.add(room);
                break;
            case 4:
                break;
            default:
                System.out.println("Only choice 1, 2, 3 or 4!!!");
        }
    }
}
