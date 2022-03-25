package exam2.controllers;

import java.util.Scanner;

public class MainControllers {
    public void displayMainMenu() {
        ClassController classController = new ClassController();
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                int choice;
                System.out.println("-----CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN-----");
                System.out.println("Chọn chức năng theo số: \n" +
                        "1.\tThêm mới sinh viên\n" +
                        "2.\tXoá sinh viên \n" +
                        "3.\tXem danh sách sinh viên\n" +
                        "4.\tXem thông tin giáo viên\n" +
                        "5.\tTìm kiếm sinh viên\n" +
                        "6.\tThoát\n");
                System.out.print("Nhập lựa chọn của bạn: ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("THÊM SINH VIÊN MỚI");
                        classController.add();
                        break;
                    case 2:
                        System.out.println("XOÁ SINH VIÊN");
                        classController.delete();
                        break;
                    case 3:
                        System.out.println("XEM DANH SÁCH SINH VIÊN");
                        classController.displayStudentList();
                        break;
                    case 4:
                        System.out.println("XEM THÔNG TIN GIÁO VIÊN");
                        classController.displayTeacherList();
                        break;
                    case 5:
                        System.out.println("TÌM KIẾM SINH VIÊN");
                        classController.search();
                        break;
                    case 6:
                        System.exit(6);
                    default:
                        System.out.println("Không có lựa chọn nào ");
                }
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập vào số nguyên dương");
            }
        } while (true);
    }
}
