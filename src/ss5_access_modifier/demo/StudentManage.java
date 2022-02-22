package ss5_access_modifier.demo;

public class StudentManage {
    private static Student[] students = new Student[100];

    static {
        students[0] = new Student(1, "An", "16-08", "C1221G1");
        students[1] = new Student(2, "Nghĩa", "26-01", "C1221G1");
        students[2] = new Student(3, "Hoàng", "05-05", "C1221G1");
        students[3] = new Student(3, "Hoàng", "05-05", "C1221G1");
    }

    public void displayListStudent() {
        for (Student s : students) {
            if (s != null) {
                System.out.println(s);
            } else {
                break;
            }
        }
    }
}
