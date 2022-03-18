package case_study.utils;

import java.util.Scanner;

public class InputData {
    static Scanner scanner = new Scanner(System.in);

    public static Integer inputIntegerChoice() {
        System.out.print("Enter your choice: ");
        return Integer.parseInt(Validate.regexPositiveInteger(scanner.nextLine(),
                "Invalid Number. Please Re-enter (Positive Integer)!!!"));
    }
}
