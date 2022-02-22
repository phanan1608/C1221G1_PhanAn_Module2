package ss5_access_modifier.demo;

public class Student {
    private int id;
    private String name, birthday, classname;
    static String school = "Codegym";

    public Student() {
    }

    public Student(int id, String name, String birthday, String classname) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.classname = classname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", classname='" + classname + '\'' +
                '}';
    }
}
