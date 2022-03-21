package case_study.controllers.booking;

import case_study.models.booking.Booking;
import case_study.models.booking.Contract;
import case_study.models.facility.House;
import case_study.models.facility.Villa;
import case_study.models.person.Customer;
import case_study.services.booking.IContactService;
import case_study.services.booking.impl.BookingServiceImpl;
import case_study.services.booking.impl.ContactServiceImpl;
import case_study.utils.InputData;
import case_study.utils.Validate;

import java.util.*;

public class ContractController {
    Scanner scanner = new Scanner(System.in);
    IContactService contactService = new ContactServiceImpl();


    public void displayContractList() {
        contactService.displayList();
    }

    public void addContract() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().getList();
        List<Contract> contractList = ContactServiceImpl.contractList;
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            if (booking.getFacility() instanceof Villa || booking.getFacility() instanceof House) {
                for (Contract contract : contractList) {
                    if (booking.getBookingCode().equals(contract.getBookingCode())) {
                        System.out.println("Booking Code existed");
                    }
                }
                Customer customer = booking.getCustomer();
                System.out.println("Creating a contract for" + booking);
                System.out.println("Creating a contract for" + customer);
                System.out.println("Enter Contract Number");
                int contractNumber = Integer.parseInt(Validate.regexPositiveInteger(scanner.nextLine(), "Invalid Number." +
                        "Please Re-enter (Positive Integer)"));
                String bookingCode = booking.getBookingCode();
                System.out.println("Enter Deposit Money");
                double depositMoney = Double.parseDouble(Validate.regexMoney(scanner.nextLine(),
                        "Invalid Money. Please Re-enter(Positive Real Number)"));
                System.out.println("Enter Total Money");
                double totalMoney = Double.parseDouble(Validate.regexMoney(scanner.nextLine(),
                        "Invalid Money. Please Re-enter(Positive Real Number)"));
                String customerId = customer.getCustomerId();
                Contract contractNew = new Contract(contractNumber, bookingCode, depositMoney, totalMoney, customerId);
                contactService.add(contractNew);
                System.out.println(contractNew);
                System.out.println("Contract created successfully!!!");
            }
        }
    }

    public int getIndexByContractNumber() {
        int index;
        int contractNumber;
        List<Contract> contractList = ContactServiceImpl.contractList;
        do {
            System.out.print("Enter Contract Number: ");
            contractNumber = Integer.parseInt(Validate.regexPositiveInteger(scanner.nextLine(), "Invalid Number." +
                    "Please Re-enter (Positive Integer)"));
            for (int i = 0; i < contractList.size(); i++) {
                if (contractList.get(i).getContractNumber() == (contractNumber)) {
                    index = i;
                    return index;
                }
            }
            System.out.println("Number of Contract does not exist. Please Re-enter");
        } while (true);
    }

    public void edit() {
        int index = getIndexByContractNumber();
        Contract contract = ContactServiceImpl.contractList.get(index);
        chooseEditInfo(contract);
        contactService.edit(index, contract);
    }

    private void chooseEditInfo(Contract contract) {
        do {
            System.out.println("Enter information you want to Edit");
            System.out.println("1. Deposit Money\n" +
                    "2. Total Money");
            System.out.print("Enter your choice: ");
            int choiceInformation = InputData.inputIntegerChoice();
            switch (choiceInformation) {
                case 1:
                    System.out.println("Enter Deposit Money you want to Edit");
                    double depositMoney = Double.parseDouble(Validate.regexMoney(scanner.nextLine(),
                            "Invalid Money. Please Re-enter(Positive Real Number)"));
                    contract.setDepositMoney(depositMoney);
                    break;
                case 2:
                    System.out.println("Enter Total Money");
                    double totalMoney = Double.parseDouble(Validate.regexMoney(scanner.nextLine(),
                            "Invalid Money. Please Re-enter(Positive Real Number)"));
                    contract.setTotalMoney(totalMoney);
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
