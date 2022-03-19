package case_study.controllers.person;

import case_study.models.enums.AcademicLevel;
import case_study.models.enums.JobTitle;
import case_study.models.person.Employee;
import case_study.models.person.Person;
import case_study.services.person.IEmployeeService;
import case_study.services.person.impl.EmployeeServiceImpl;
import case_study.utils.InputData;
import case_study.utils.Validate;

import java.util.List;
import java.util.Scanner;

public class EmployeeController extends PersonController {
    IEmployeeService employeeService = new EmployeeServiceImpl();
    Scanner scanner = new Scanner(System.in);

    public Object inputInformation() {
        super.inputPersonInformationBasic();
        String employeeId = getEmployeeIdFromInput();
        AcademicLevel academicLevel = getAcademicLevelFromInput();
        JobTitle jobTitle = getJobTitleFromInput();
        double salary = getSalaryFromInput();
        return new Employee(fullName, dayOfBirth, gender, identityCard, telephoneNumber, emailAddress, employeeId, academicLevel, jobTitle, salary);
    }

    public String getEmployeeIdFromInput() {
        System.out.print("Enter Employee ID: ");
        return Validate.regexEmployeeId(scanner.nextLine(),
                "Invalid Employee ID. Please Re-enter (XYYYYY- X:E Y:number)!!!");
    }

    public AcademicLevel getAcademicLevelFromInput() {
        int choice;
        do {
            int i = 1;
            System.out.println("Enter Academic Level");
            for (AcademicLevel level : AcademicLevel.values()) {
                System.out.printf("%d.%s", i++, level + "\n");
            }
            choice = InputData.inputIntegerChoice(); //
            if (choice < 1 || choice > AcademicLevel.values().length) {
                System.out.println("Please choice from 1 to " + AcademicLevel.values().length);
            } else break;
        } while (true);
        return AcademicLevel.values()[choice - 1];
    }

    public JobTitle getJobTitleFromInput() {
        int choice;
        do {
            int i = 1;
            System.out.println("Enter Job Title");
            for (JobTitle jobTitle : JobTitle.values()) {
                System.out.printf("%d.%s", i++, jobTitle + "\n");
            }
            choice = InputData.inputIntegerChoice();
            if (choice < 1 || choice > JobTitle.values().length) {
                System.out.println("Please choice from 1 to " + JobTitle.values().length);
            } else break;
        } while (true);
        return JobTitle.values()[choice - 1];
    }

    private Double getSalaryFromInput() {
        System.out.print("Enter Salary: ");
        return Double.parseDouble(Validate.regexSalary(scanner.nextLine(),
                "Invalid Employee ID. Please Re-enter (please input a number with 7 or more digits)!!!"));
    }

    public int getIndexById() {
        int index;
        List<Person> personList = EmployeeServiceImpl.listEmployee;
        String identityCard;
        do {
            identityCard = super.getIdentityCardFromInput();
            for (int i = 0; i < personList.size(); i++) {
                if (personList.get(i).getIdentityCard().equals(identityCard)) {
                    index = i;
                    return index;
                }
            }
            System.out.println("ID of Employee does not exist. Please Re-enter");
        } while (true);
    }

    public void edit() {
        int index = getIndexById();
        Person employee = EmployeeServiceImpl.listEmployee.get(index);
        chooseEditInfo(employee);
        employeeService.edit(index, employee);
    }

    private void chooseEditInfo(Person employee) {
        do {
            System.out.println("Enter information you want to Edit");
            System.out.println("1. Full Name\n" +
                    "2. Birthday\n" +
                    "3. Gender\n" +
                    "4. Identity Card\n" +
                    "5. Telephone Number\n" +
                    "6. Email Address\n" +
                    "7. Employee ID\n" +
                    "8. Academic Level\n" +
                    "9. Job Title\n" +
                    "10. Salary\n");
            int choiceInformation = InputData.inputIntegerChoice();
            switch (choiceInformation) {
                case 1:
                    String fullNameEdit = super.getFullNameFromInput();
                    employee.setFullName(fullNameEdit);
                    break;
                case 2:
                    String dayOfBirthEdit = super.getDayOfBirthFromInput();
                    employee.setDayOfBirth(dayOfBirthEdit);
                    break;
                case 3:
                    String genderEdit = super.getGenderFromInput();
                    employee.setGender(genderEdit);
                    break;
                case 4:
                    String identityCardEdit = super.getIdentityCardFromInput();
                    employee.setIdentityCard(identityCardEdit);
                    break;
                case 5:
                    String telephoneNumberEdit = super.getTelephoneNumberFromInput();
                    employee.setTelephoneNumber(telephoneNumberEdit);
                    break;
                case 6:
                    String emailAddressEdit = super.getEmailAddressFromInput();
                    employee.setEmailAddress(emailAddressEdit);
                    break;
                case 7:
                    String employeeIdEdit = getEmployeeIdFromInput();
                    ((Employee) employee).setEmployeeId(employeeIdEdit);
                    break;
                case 8:
                    AcademicLevel academicLevelEdit = getAcademicLevelFromInput();
                    ((Employee) employee).setAcademicLevel(academicLevelEdit);
                    break;
                case 9:
                    JobTitle jobTitleEdit = getJobTitleFromInput();
                    ((Employee) employee).setJobTitle(jobTitleEdit);
                    break;
                case 10:
                    double salaryEdit = getSalaryFromInput();
                    ((Employee) employee).setSalary(salaryEdit);
                    break;
                default:
                    System.out.println("No choice");
            }
            System.out.print("Do you want to continue editing?(Y/N) ");
            String s = scanner.nextLine();
            if ("n".equals(s.toLowerCase())) {
                break;
            }
        } while (true);
    }
}
