package case_study.models;

public class Employee extends Person {
    private String employeeId;
    private String academicLevel;
    private String jobTitle;
    private double salary;

    public Employee(String fullName, String gender, int identityCard, int telephoneNumber, String emailAddress,
                    String employeeCode, String academicLevel, String jobTitle, double salary) {
        super(fullName, gender, identityCard, telephoneNumber, emailAddress);
        this.employeeId = employeeCode;
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

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
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
        return "Employee{" + super.toString() +
                "employeeCode='" + employeeId + '\'' +
                ", academicLevel='" + academicLevel + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
