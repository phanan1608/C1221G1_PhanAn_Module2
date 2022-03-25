package c1.utils;

import java.util.Scanner;

public class InputData {
    static Scanner scanner = new Scanner(System.in);

    public static Integer inputIntegerChoice() {
        System.out.print("Nhập lựa chọn của bạn: ");
        return Integer.parseInt(Validate.regexPositiveInteger(scanner.nextLine(),
                "Không hợp lệ. Bạn cần nhập vào số nguyên dương!!!"));
    }
}
