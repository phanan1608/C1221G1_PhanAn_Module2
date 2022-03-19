package case_study.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        String endDate;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate now = LocalDate.now();
        System.out.println(now);

//        do {
//            try {
//                System.out.print("Enter Start Date: ");
//                Scanner scanner =new Scanner(System.in);
//                endDate = scanner.nextLine();
//                LocalDate endDateFormat = LocalDate.parse(endDate, formatter);
////                return endDate;
//            } catch (DateTimeParseException e) {
//                System.err.println("Invalid Date!!! Please re-enter");
//            }
//        } while (true);
    }
}
