package exam2.models;

public class Teacher extends Person {
    private int teacherCode;

    public Teacher(String fullName, String birthday, String gender, String phoneNumber, int teacherCode) {
        super(fullName, birthday, gender, phoneNumber);
        this.teacherCode = teacherCode;
    }

    public int getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(int teacherCode) {
        this.teacherCode = teacherCode;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                super.toString() +
                "teacherCode=" + teacherCode +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.teacherCode;
    }
}
