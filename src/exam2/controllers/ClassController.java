package exam2.controllers;

import exam2.models.Classroom;
import exam2.models.Student;
import exam2.models.Teacher;
import exam2.services.IStudentService;
import exam2.services.impl.StudentServiceImpl;
import exam2.utils.InputData;
import exam2.utils.NotFoundStudentException;
import exam2.utils.ReadAndWriteFile;
import exam2.utils.Validate;

import java.util.List;
import java.util.Scanner;

public class ClassController {
    IStudentService studentService = new StudentServiceImpl();
    Scanner scanner = new Scanner(System.in);
    static List<Classroom> classroomList;
    static List<Teacher> teacherList;
    public static final String BATCH_FILE = "src\\exam2\\data\\batchs.csv";
    public static final String TEACHER_FILE = "src\\exam2\\data\\teacher.csv";


    static {
        teacherList = ReadAndWriteFile.readTeacherListFromCSV(TEACHER_FILE);
        classroomList = ReadAndWriteFile.readClassRoomListFromCSV(BATCH_FILE);
    }

    public void add() {
        System.out.println("Nhập tên sinh viên");
        String fullName = Validate.regexStudentNameInput(scanner.nextLine(),
                "Tên sinh viên phải từ 4-50 kí tự");
        System.out.println("Nhập ngày sinh");
        String birthday = Validate.regexBirthDayNumber(scanner.nextLine(),
                "Ngày sinh phải đúng định dạng dd/MM/yyyy");
        System.out.println("Nhập giới tính");
        String gender = Validate.regexRequiredInput(scanner.nextLine(), "Không được để trống");
        String phoneNumber = getPhoneNumberFromInput();
        int studentCode = setAutoStudentCode();
        System.out.println("Nhập số lớp học");
        int classCode = getClassroomCode();
        Student student = new Student(studentCode, fullName, birthday, gender, phoneNumber, classCode);
        studentService.add(student);
    }

    public void displayStudentList() {
        studentService.displayList();
    }

    public void displayTeacherList() {
        for (Teacher element : teacherList) {
            System.out.println(element);
        }
    }

    private int setAutoStudentCode() {
        int id = 1;
        List<Student> list = studentService.getList();
        if (list.size() != 0) {
            int index = list.size() - 1;
            id = list.get(index).getStudentCode() + 1;
        }
        return id;
    }

    public void search() {
        do {
            System.out.println("Nhập vào Tên Sinh viên cần tìm");
            String searchInformation = scanner.nextLine();
            studentService.search(searchInformation);
            System.out.print("Bạn có muốn tiếp tục (Y/N) ");
            String confirm = scanner.nextLine();
            if ("n".equals(confirm.toLowerCase())) {
                break;
            }
        } while (true);
    }

    public void delete() {
        displayStudentList();
        System.out.println("Nhập vào Mã sinh viên cần xoá");
        int studentCode = InputData.inputIntegerChoice();
        try {
            Student student = studentService.findObjectByStudentCode(studentCode);
            System.out.println("Đã tìm thấy. Bạn có muốn xoá (Y/N)");
            if ("y".equals(scanner.nextLine())) {
                studentService.remove(student);
                displayStudentList();
            }
        } catch (NotFoundStudentException e) {
            System.out.println(e.getMessage());
        }
    }

    private String getPhoneNumberFromInput() {
        String phoneNumber;
        do {
            System.out.println("Nhập vào số điện thoại");
            phoneNumber = Validate.regexTelephoneNumber(scanner.nextLine(),
                    "số điện thoại phải là 10 số và bắt đầu từ số 0");
            if (phoneNumberExist(phoneNumber)) {
                System.out.println("Số điện thoại này đã tồn tại. Vui lòng nhập lại");
            } else break;
        } while (true);
        return phoneNumber;
    }

    private boolean phoneNumberExist(String phoneNumber) {
        List<Student> studentList = studentService.getList();
        boolean flag = false;
        for (Student student : studentList) {
            if (student.getPhoneNumber().equals(phoneNumber)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    private int getClassroomCode() {
        int index;
        System.out.println("Danh sách lớp học ");
        for (int i = 0; i < classroomList.size(); i++) {
            System.out.printf("[%d] %s %n", i, classroomList.get(i));
        }
        do {
            System.out.println("Chọn thứ tự lớp học muốn thêm");
            index = Integer.parseInt(Validate.regexPositiveInteger(scanner.nextLine(),
                    "Phải nhập vào số dương"));
            if (index < 0 || index >= classroomList.size()) {
                System.out.println("Chỉ được chọn từ 0 đến " + (classroomList.size() - 1));
            } else break;
        } while (true);
        return classroomList.get(index).getClassCode();
    }

}
