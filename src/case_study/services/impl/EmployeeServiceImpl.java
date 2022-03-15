package case_study.services.impl;

import case_study.models.Employee;
import case_study.models.Person;
import case_study.models.enums.AcademicLevel;
import case_study.models.enums.JobTitle;
import case_study.services.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {

    static List<Person> listEmployee = new ArrayList<>();


    static Scanner scanner = new Scanner(System.in);

    static {
        listEmployee.add(new Employee("Trần Ngọc Luật", "12/12/2003", "Nam", "123453214", "1900123123",
                "abc@gmail.com", "E1011", AcademicLevel.UNIVERSITY, JobTitle.DIRECTOR, 100000000));
        listEmployee.add(new Employee("Nguyễn Trần Thanh Nghĩa", "26/01/1997", "Nam", "260018271197", "1900262626",
                "nguyens@gmail.com", "E1231", AcademicLevel.INTERMEDIATE, JobTitle.DIRECTOR, 150000000));
        listEmployee.add(new Employee("Trần Hữu Nhật Hoàng", "05/05/1997", "Nam", "551999872617", "1900555555",
                "hoangtran@gmail.com", "E3123", AcademicLevel.POSTGRADUATE, JobTitle.STAFF, 120000000));
    }


    @Override
    public void add(Object object) {
        listEmployee.add((Employee) object);
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
    }

    @Override
    public List<Person> getListEmployee() {
        return listEmployee;
    }
}

