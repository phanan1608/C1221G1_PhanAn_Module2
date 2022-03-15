package case_study.models;

import case_study.models.enums.AcademicLevel;
import case_study.models.enums.JobTitle;

public class Employee extends Person {
    private String employeeId;
    private AcademicLevel academicLevel;
    private JobTitle jobTitle;
    private double salary;

    public Employee(String fullName, String dayOfBirth, String gender, String identityCard, String telephoneNumber, String emailAddress, String employeeId, AcademicLevel academicLevel, JobTitle jobTitle, double salary) {
        super(fullName, dayOfBirth, gender, identityCard, telephoneNumber, emailAddress);
        this.employeeId = employeeId;
        this.academicLevel = academicLevel;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public AcademicLevel getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(AcademicLevel academicLevel) {
        this.academicLevel = academicLevel;
    }

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                "employeeId='" + employeeId + '\'' +
                ", academicLevel='" + academicLevel + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

}
