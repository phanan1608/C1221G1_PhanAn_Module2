package case_study.controllers;

import case_study.controllers.impl.CustomerControllersImpl;
import case_study.controllers.impl.EmployeeControllersImpl;
import case_study.services.ICustomerService;
import case_study.services.IEmployeeService;
import case_study.services.impl.CustomerServiceImpl;
import case_study.services.impl.EmployeeServiceImpl;
import case_study.utils.InputData;

import java.util.Scanner;

public class MainFuramaController {
    IEmployeeService employeeService = new EmployeeServiceImpl();
    IEmployeeControllers employeeControllers = new EmployeeControllersImpl();
    ICustomerService customerService = new CustomerServiceImpl();
    ICustomerControllers customerControllers = new CustomerControllersImpl();

    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("-----DISPLAY-----");
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            choice = InputData.inputChoice();
            switch (choice) {
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    System.out.println("FACILITY MANAGEMENT");
                    System.out.println("1\tDisplay list facility\n" +
                            "2\tAdd new facility\n" +
                            "3\tDisplay list facility maintenance\n" +
                            "4\tReturn main menu\n");
                    break;
                case 4:
                    System.out.println("BOOKING MANAGEMENT");
                    System.out.println("1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tCreate new constracts\n" +
                            "4.\tDisplay list contracts\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
                    break;
                case 5:
                    System.out.println("PROMOTION MANAGEMENT");
                    System.out.println("1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
                    break;
                case 6:
                    System.exit(6);
                default:
                    System.out.println("No choice!");
            }
        } while (true);
    }

    private void displayCustomerMenu() {
        int choiceCustomer;
        System.out.println("CUSTOMER MANAGEMENT");
        System.out.println("1.\tDisplay list customers\n" +
                "2.\tAdd new customer\n" +
                "3.\tEdit customer\n" +
                "4.\tReturn main menu\n");
        choiceCustomer = InputData.inputChoice();
        switch (choiceCustomer) {
            case 1:
                System.out.println("DISPLAY LIST CUSTOMER");
                customerService.displayList();
                break;
            case 2:
                customerService.add(customerControllers.inputInformation());
                break;
            case 3:
                System.out.println("EDIT CUSTOMER");
                customerControllers.edit();
                break;
            case 4:
                break;
            default:
                System.out.println("Only choice 1, 2 or 3!!!");
        }
    }

    private void displayEmployeeMenu() {
        int choiceEmployee;
        System.out.println("EMPLOYEE MANAGEMENT");
        System.out.println("1\tDisplay list employees\n" +
                "2\tAdd new employee\n" +
                "3\tEdit employee\n" +
                "4\tReturn main menu\n");
        choiceEmployee = InputData.inputChoice();
        switch (choiceEmployee) {
            case 1:
                System.out.println("DISPLAY LIST EMPLOYEES");
                employeeService.displayList();
                break;
            case 2:
                employeeService.add(employeeControllers.inputInformation());
                break;
            case 3:
                System.out.println("EDIT EMPLOYEE");
                employeeControllers.edit();
                break;
            case 4:
                break;
            default:
                System.out.println("Only choice 1, 2 or 3!!!");
        }
    }

    private void displayMenu() {
        int choiceEmployee;
        System.out.println("EMPLOYEE MANAGEMENT");
        System.out.println("1\tDisplay list employees\n" +
                "2\tAdd new employee\n" +
                "3\tEdit employee\n" +
                "4\tReturn main menu\n");
        choiceEmployee = InputData.inputChoice();
        switch (choiceEmployee) {
            case 1:
                System.out.println("DISPLAY LIST EMPLOYEES");
                employeeService.displayList();
                break;
            case 2:
                employeeService.add(employeeControllers.inputInformation());
                break;
            case 3:
                System.out.println("EDIT EMPLOYEE");
                employeeControllers.edit();
                break;
            case 4:
                break;
            default:
                System.out.println("Only choice 1, 2 or 3!!!");
        }
    }
}
