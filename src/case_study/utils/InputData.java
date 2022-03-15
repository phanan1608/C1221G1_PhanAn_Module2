package case_study.utils;

import java.util.Scanner;

public class InputData {
    public static Integer inputChoice() {
        String choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter your choice: ");
            choice = scanner.nextLine();
            if (!Validate.isPositiveInteger(choice)) {
                System.err.println("Invalid Number. Please Re-enter (Positive Integer)!!!");
            } else break;
        } while (true);
        return Integer.parseInt(choice);
    }
}
