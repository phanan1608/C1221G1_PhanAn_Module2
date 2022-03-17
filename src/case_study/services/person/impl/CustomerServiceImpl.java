package case_study.services.person.impl;

import case_study.models.person.Employee;
import case_study.models.person.Person;
import case_study.services.person.ICustomerService;
import case_study.utils.ReadAndWriteFile;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    static List<Person> listCustomer = new LinkedList<>();
    public static final String CUSTOMER_FILE = "src\\case_study\\data\\customer_list.csv";
    static Scanner scanner = new Scanner(System.in);

    static {
        listCustomer = ReadAndWriteFile.readCustomerListFromCSV(CUSTOMER_FILE);
//        listCustomer.add(new Customer("Uyên", "03/07/1997", "Nữ", "819281719", "0827129108",
//                "eeqoq@gmail.com", "C3123", CustomerType.DIAMOND, "Quảng Nam"));
//        listCustomer.add(new Customer("Long", "02/01/1999", "Nam", "718261718", "0909018191",
//                "nois@gmail.com", "C1232", CustomerType.GOLD, "Đà Nẵng"));
//        listCustomer.add(new Customer("Mỹ", "29/05/1992", "Nam", "901727129098", "7982719101",
//                "ohhh@gmail.com", "C2333", CustomerType.SILVER, "Đà Nẵng"));
//        ReadAndWriteFile.writeListPersonToCSV(CUSTOMER_FILE, listCustomer);
    }


    @Override
    public void add(Object object) {
        listCustomer.add((Employee) object);
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


    @Override
    public List<Person> getList() {
        return listCustomer;
    }
}
