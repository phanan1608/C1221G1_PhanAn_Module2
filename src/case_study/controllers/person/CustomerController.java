package case_study.controllers.person;

import case_study.models.enums.CustomerType;
import case_study.models.person.Customer;
import case_study.models.person.Person;
import case_study.services.person.ICustomerService;
import case_study.services.person.impl.CustomerServiceImpl;
import case_study.utils.InputData;
import case_study.utils.Validate;

import java.util.List;
import java.util.Scanner;

public class CustomerController extends PersonController {
    ICustomerService customerService = new CustomerServiceImpl();
    Scanner scanner = new Scanner(System.in);

    public void displayCustomerList() {
        customerService.displayList();
    }

    public void addCustomer() {
        super.inputPersonInformationBasic();
        String customerId = getCustomerIdFromInput();
        CustomerType customerType = getCustomerTypeFromInput();
        String address = getAddressFromInput();
        Customer customer = new Customer(fullName, dayOfBirth, gender, identityCard, telephoneNumber, emailAddress, customerId, customerType, address);
        customerService.add(customer);
        System.out.println(customer);
        System.out.println("Customer created successfully!!!");
    }

    public String getCustomerIdFromInput() {
        System.out.print("Enter Customer Id: ");
        return Validate.regexCustomerId(scanner.nextLine(),
                "Invalid Customer ID. Please Re-enter (XYYYYY- X:C Y:number)!!!");
    }

    public CustomerType getCustomerTypeFromInput() {
        int choice;
        do {
            int i = 1;
            System.out.println("Enter Customer Type");
            for (CustomerType type : CustomerType.values()) {
                System.out.printf("%d.%s", i++, type + "\n");
            }
            choice = InputData.inputIntegerChoice();
            if (choice < 1 || choice > CustomerType.values().length) {
                System.out.println("Please choice from 1 to " + CustomerType.values().length);
            } else break;
        } while (true);
        return CustomerType.values()[choice - 1];
    }

    public String getAddressFromInput() {
        System.out.print("Enter Address: ");
        return Validate.regexAddress(scanner.nextLine(), "Invalid Employee Address. " +
                "Please Re-enter (Example:Nguyen Tat Thanh or 1234 Nguyen Tat Thanh)!!!");
    }

    public int getIndexById() {
        int index;
        List<Person> personList = CustomerServiceImpl.listCustomer;
        do {
            identityCard = super.getIdentityCardFromInput();
            for (int i = 0; i < personList.size(); i++) {
                if (personList.get(i).getIdentityCard().equals(identityCard)) {
                    index = i;
                    return index;
                }
            }
            System.out.println("ID of Customer does not exist. Please Re-enter");
        } while (true);
    }

    public void edit() {
        int index = getIndexById();
        Person customer = CustomerServiceImpl.listCustomer.get(index);
        chooseEditInfo(customer);
        customerService.edit(index, customer);
    }

    private void chooseEditInfo(Person customer) {
        do {
            System.out.println("Enter information you want to Edit");
            System.out.println("1. Full Name\n" +
                    "2. Birthday\n" +
                    "3. Gender\n" +
                    "4. Identity Card\n" +
                    "5. Telephone Number\n" +
                    "6. Email Address\n" +
                    "7. Customer ID\n" +
                    "8. Customer Type\n" +
                    "9. Address\n");
            int choiceInformation = InputData.inputIntegerChoice();
            switch (choiceInformation) {
                case 1:
                    String fullNameEdit = super.getFullNameFromInput();
                    customer.setFullName(fullNameEdit);
                    break;
                case 2:
                    String dayOfBirthEdit = super.getDayOfBirthFromInput();
                    customer.setDayOfBirth(dayOfBirthEdit);
                    break;
                case 3:
                    String genderEdit = super.getGenderFromInput();
                    customer.setGender(genderEdit);
                    break;
                case 4:
                    String identityCardEdit = super.getIdentityCardFromInput();
                    customer.setIdentityCard(identityCardEdit);
                    break;
                case 5:
                    String telephoneNumberEdit = super.getTelephoneNumberFromInput();
                    customer.setTelephoneNumber(telephoneNumberEdit);
                    break;
                case 6:
                    String emailAddressEdit = super.getEmailAddressFromInput();
                    customer.setEmailAddress(emailAddressEdit);
                    break;
                case 7:
                    String customerIdEdit = getCustomerIdFromInput();
                    ((Customer) customer).setCustomerId(customerIdEdit);
                    break;
                case 8:
                    CustomerType academicLevelEdit = getCustomerTypeFromInput();
                    ((Customer) customer).setCustomerType(academicLevelEdit);
                    break;
                case 9:
                    String addressEdit = getAddressFromInput();
                    ((Customer) customer).setAddress(addressEdit);
                    break;
                default:
                    System.out.println("No choice");
            }
            System.out.print("Do you want to continue editing?(Y/N) ");
            String confirm = scanner.nextLine();
            if ("n".equals(confirm.toLowerCase())) {
                break;
            }
        } while (true);
    }
}
