package ss19_regex_and_string.exercise.exercise_2_validate_phone_number;

import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static final String PHONE_NAME = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public static void main(String[] args) {
        String phone1 = "(84)-(0978489648)";
        String phone2 = "(a8)-(22222222)";
        boolean check1 = Pattern.matches(PHONE_NAME, phone1);
        boolean check2 = Pattern.matches(PHONE_NAME, phone2);
        System.out.println(phone1 + " is valid: " + check1);
        System.out.println(phone2 + " is valid: " + check2);
    }
}
