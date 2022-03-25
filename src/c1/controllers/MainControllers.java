package c1.controllers;

import java.util.Scanner;

public class MainControllers {
    public void displayMainMenu() {
        RecordController recordController = new RecordController();
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                int choice;
                System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN–\n" +
                        "Chọn chức năng theo số (để tiếp tục):\n" +
                        "1. Thêm mới\n" +
                        "2. Xóa\n" +
                        "3. Xem danh sách các bệnh án\n" +
                        "4. Thoát\n");
                System.out.print("Chọn chức năng: ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("THÊM MỚI");
                        recordController.add();
                        break;
                    case 2:
                        System.out.println("XOÁ");
                        recordController.delete();
                        break;
                    case 3:
                        System.out.println("XEM DANH SÁCH");
                        recordController.displayList();
                        break;
                    case 4:
                        System.exit(4);
                    default:
                        System.out.println("Không có lựa chọn!");
                }
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập vào số dương!!!");
            }
        } while (true);
    }
}
