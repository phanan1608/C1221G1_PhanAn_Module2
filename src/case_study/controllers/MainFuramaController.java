package case_study.controllers;

import case_study.controllers.booking.BookingController;
import case_study.controllers.booking.ContractController;
import case_study.controllers.facility.HouseController;
import case_study.controllers.facility.RoomController;
import case_study.controllers.facility.VillaController;
import case_study.controllers.person.CustomerController;
import case_study.controllers.person.EmployeeController;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.services.facility.IFacilityService;
import case_study.services.facility.IHouseService;
import case_study.services.facility.IRoomService;
import case_study.services.facility.IVillaService;
import case_study.services.facility.impl.FacilityServiceImpl;
import case_study.services.facility.impl.HouseServiceImpl;
import case_study.services.facility.impl.RoomServiceImpl;
import case_study.services.facility.impl.VillaServiceImpl;
import case_study.utils.InputData;

import java.util.Scanner;


public class MainFuramaController {
    EmployeeController employeeControllers = new EmployeeController();
    CustomerController customerControllers = new CustomerController();
    IFacilityService facilityService = new FacilityServiceImpl();
    RoomController roomController = new RoomController();
    VillaController villaController = new VillaController();
    HouseController houseController = new HouseController();
    BookingController bookingController = new BookingController();
    ContractController contractController = new ContractController();


    IRoomService roomService = new RoomServiceImpl();
    IVillaService villaService = new VillaServiceImpl();
    IHouseService houseService = new HouseServiceImpl();

    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                int choice;
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
                bookingController.addBooking();
                break;
            case 2:
                System.out.println("DISPLAY LIST BOOKING");
                bookingController.displayBookingList();
                break;
            case 3:
                System.out.println("CREATE NEW CONSTRACTS");
                contractController.addContract();
                break;
            case 4:
                System.out.println("DISPLAY LIST CONTRACTS");
                contractController.displayContractList();
                break;
            case 5:
                System.out.println("EDIT CONTRACTS");
                contractController.displayContractList();
                contractController.edit();
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
                customerControllers.displayCustomerList();
                break;
            case 2:
                System.out.println("CREATE CUSTOMER");
                customerControllers.addCustomer();
                break;
            case 3:
                System.out.println("EDIT CUSTOMER");
                customerControllers.displayCustomerList();
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
                employeeControllers.displayEmpoyeeList();
                break;
            case 2:
                System.out.println("CREATE EMPLOYEE");
                employeeControllers.addEmployee();
                break;
            case 3:
                System.out.println("EDIT EMPLOYEE");
                employeeControllers.displayEmpoyeeList();
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
                roomController.displayRoomList();
                villaController.displayVillaList();
                houseController.displayHouseList();
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
                House house = houseController.inputInformation();
                houseService.add(house);
                facilityService.add(house);
                break;
            case 2:
                System.out.println("ADD NEW VILLA");
                Villa villa = villaController.inputInformation();
                villaService.add(villa);
                facilityService.add(villa);
                break;
            case 3:
                System.out.println("ADD NEW ROOM");
                Room room = roomController.inputInformation();
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
