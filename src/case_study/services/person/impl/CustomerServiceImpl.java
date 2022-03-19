package case_study.services.person.impl;

import case_study.models.person.Customer;
import case_study.models.person.Person;
import case_study.services.person.ICustomerService;
import case_study.utils.ReadAndWriteFile;

import java.util.LinkedList;
import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    public static List<Person> listCustomer;
    public static final String CUSTOMER_FILE = "src\\case_study\\data\\customer_list.csv";

    static {
        listCustomer = new LinkedList<>();
        listCustomer = ReadAndWriteFile.readCustomerListFromCSV(CUSTOMER_FILE);
    }

    @Override
    public void add(Object object) {
        listCustomer.add((Customer) object);
        System.out.println("Successfully Added");
        ReadAndWriteFile.writeListPersonToCSV(CUSTOMER_FILE, listCustomer);
        displayList();
    }

    @Override
    public void displayList() {
        if (listCustomer.size() != 0) {
            for (Person customer : listCustomer) {
                System.out.println(customer);
            }
        } else {
            System.err.println("Empty List!!!");
        }
    }

    @Override
    public void edit(int index, Person person) {
        listCustomer.set(index, person);
        System.out.println("Successfully edited");
        ReadAndWriteFile.writeListPersonToCSV(CUSTOMER_FILE, listCustomer);
        System.out.println(listCustomer.get(index));
    }
}
