package ss1_intro_java.bai_tap.bai_tap_1_hien_thi_loi_chao;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name);
    }
}
