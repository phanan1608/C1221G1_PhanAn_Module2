package exam2.services.impl;

import exam2.models.Student;
import exam2.services.IStudentService;
import exam2.utils.NotFoundStudentException;
import exam2.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements IStudentService {
    static List<Student> studentList = new ArrayList<>();
    public static final String STUDENTS_FILE = "src\\exam2\\data\\students.csv";

    static {
        studentList = ReadAndWriteFile.readStudentListFromCSV(STUDENTS_FILE);
    }

    @Override
    public void add(Student object) {
        studentList.add(object);
        System.out.println("Đã thêm thành công");
        ReadAndWriteFile.writeListStudentToCSV(STUDENTS_FILE, studentList);
    }

    @Override
    public void displayList() {
        if (studentList.size() != 0) {
            for (Student student : studentList) {
                System.out.println(student);
            }
        } else {
            System.out.println("Danh sách rỗng!!!");
        }
    }

    @Override
    public void remove(Student object) {
        studentList.remove(object);
        System.out.println("Đã xoá thành công");
        ReadAndWriteFile.writeListStudentToCSV(STUDENTS_FILE, studentList);
    }

    @Override
    public List<Student> getList() {
        return studentList;
    }

    @Override
    public void search(String searchInformation) {
        List<Student> searchList = new ArrayList<>();

        for (Student student : studentList) {
            if (student.getFullName().toLowerCase().contains(searchInformation.toLowerCase())) {
                searchList.add(student);
            }
        }
        if (!searchList.isEmpty()) {
            for (Student element : searchList) {
                System.out.println(element);
            }
        } else {
            System.out.println("NOT FOUND PRODUCT!!!");
        }

    }

    @Override
    public Student findObjectByStudentCode(int studentCode) throws NotFoundStudentException {
        for (Student student : studentList) {
            if (student.getStudentCode() == studentCode) {
                return student;
            }
        }
        throw new NotFoundStudentException("Sinh viên không tồn tại");
    }
}
