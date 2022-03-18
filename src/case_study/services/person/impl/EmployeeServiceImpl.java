package case_study.services.person.impl;

import case_study.models.person.Employee;
import case_study.models.person.Person;
import case_study.services.person.IEmployeeService;
import case_study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    static List<Person> listEmployee = new ArrayList<>();
    public static final String EMPLOYEE_FILE = "src\\case_study\\data\\employee_list.csv";
    static Scanner scanner = new Scanner(System.in);

    static {
        listEmployee = ReadAndWriteFile.readEmployeeListFromCSV(EMPLOYEE_FILE);
    }

    @Override
    public void add(Object object) {
        listEmployee.add((Employee) object);
        System.out.println("Successfully Added");
        displayList();
    }

    @Override
    public void displayList() {
        if (listEmployee.size() != 0) {
            for (Person employee : listEmployee) {
                System.out.println(employee);
            }
        } else {
            System.err.println("Empty List!!!");
        }
    }

    @Override
    public void edit(int index, Person person) {
        listEmployee.set(index, person);
        System.out.println("Successfully edited");
        ReadAndWriteFile.writeListPersonToCSV(EMPLOYEE_FILE, listEmployee);
        System.out.println(listEmployee.get(index));
    }

    @Override
    public List<Person> getList() {
        return listEmployee;
    }
}

