package exam2.models;

public class Student extends Person {
    private int studentCode;
    private int classCode;

    public Student(int studentCode, String fullName, String birthday, String gender, String phoneNumber,
                   int classCode) {
        super(fullName, birthday, gender, phoneNumber);
        this.studentCode = studentCode;
        this.classCode = classCode;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public int getClassCode() {
        return classCode;
    }

    public void setClassCode(int classCode) {
        this.classCode = classCode;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentCode=" + studentCode + ", " +
                super.toString() +
                ", classCode=" + classCode +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return this.studentCode + "," + super.getInfoToCSV() + "," + this.classCode;
    }
}
