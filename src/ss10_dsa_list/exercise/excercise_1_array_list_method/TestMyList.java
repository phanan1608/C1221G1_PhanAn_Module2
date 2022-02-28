package ss10_dsa_list.exercise.excercise_1_array_list_method;

public class TestMyList {
    public static class Student {
        private int id;
        private String name;

        public Student() {

        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "An");
        Student student2 = new Student(2, "Hoàng");
        Student student3 = new Student(3, "Nghĩa");
        Student student4 = new Student(4, "Luật");
        MyList<Student> listArrayStudent = new MyList<>();
        listArrayStudent.add(student1);
        listArrayStudent.add(student2);
        listArrayStudent.add(student3);
//        listArrayStudent.add(student4, 2);
        System.out.println(listArrayStudent.size());


        for (int i = 0; i < listArrayStudent.size(); i++) {
            Student student = (Student) listArrayStudent.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }

        System.out.println("Index=" + listArrayStudent.indexOf(student4));
        System.out.println(listArrayStudent.contains(student1));
        System.out.println(listArrayStudent.contains(student4));

        MyList<Student> newArrayList = new MyList<>();
        newArrayList = listArrayStudent.clone();
        newArrayList.remove(0);
        for (int i = 0; i < newArrayList.size(); i++) {
            System.out.println(newArrayList.get(i).getName());
        }

    }
}
