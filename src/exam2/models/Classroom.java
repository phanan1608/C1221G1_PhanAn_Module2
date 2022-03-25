package exam2.models;

public class Classroom {
    private int classCode;
    private String className;
    private String teacherCode;

    public Classroom(int classCode, String className, String teacherCode) {
        this.classCode = classCode;
        this.className = className;
        this.teacherCode = teacherCode;
    }

    public int getClassCode() {
        return classCode;
    }

    public void setClassCode(int classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "classCode='" + classCode + '\'' +
                ", className='" + className + '\'' +
                ", teacherCode='" + teacherCode + '\'' +
                '}';
    }
}
