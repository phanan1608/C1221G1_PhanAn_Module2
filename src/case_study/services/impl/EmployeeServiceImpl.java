package case_study.services.impl;

import case_study.models.Employee;
import case_study.services.IEmployeeService;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    static ArrayList<Employee> listEmployee = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        listEmployee.add(new Employee("Trần Ngọc Luật", "Nam", 12345, 1900123123,
                "abc@gmail.com", "E1011", "University", "Marketing Manager", 100000000));
        listEmployee.add(new Employee("Nguyễn Trần Thanh Ngĩa", "Nam", 26197, 1900262626,
                "nguyens@gmail.com", "E1231", "University", "IT Manager", 150000000));
        listEmployee.add(new Employee("Trần Hữu Nhật Hoàng", "Nam", 551997, 1900555555,
                "hoangtran@gmail.com", "E3123", "University", "HR Manager", 120000000));
    }

    @Override
    public void edit() {
        System.out.println("-----DISPLAY LIST EMPLOYEES-----");

    }

    @Override
    public void add() {

    }

    @Override
    public void display() {

    }
}
