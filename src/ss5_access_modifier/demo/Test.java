package ss5_access_modifier.demo;

import java.util.Scanner;

public class Test {
    static StudentManage studentManage = new StudentManage();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chooseMenu = -1;
        do {
            System.out.println("Main Menu");
            System.out.println("1.Add");
            System.out.println("2.Display");
            System.out.println("3.Edit");
            System.out.println("4.Delete");
            System.out.println("5.Search");
            System.out.println("6.Exit");
            System.out.println("Chọn chức năng");
            chooseMenu = Integer.parseInt(scanner.nextLine());

            switch (chooseMenu) {
                case 1:
                    //chức năng thêm mới
                    break;
                case 2:
                    System.out.println("Danh sách sinh viên: ");
                    studentManage.displayListStudent();
                    break;
                case 3:
                    //chức năng edit
                    break;
                case 4:
                    //chức năng delete
                    break;
                case 5:
                    //chức năng search
                    break;
                case 6:
                    System.exit(6);
            }
        } while (chooseMenu > 6 || chooseMenu < 0);
    }

}
