package c1.utils;

import java.util.Scanner;

public class Validate {
    private static final String POSITIVE_INTEGERS_REGEX = "^\\+*\\d+$";
    private static final String POSITION_DOUBLE_REGEX = "^\\+*\\d+(\\.\\d+)*$";
    private static final String REQUIRED_INPUT_REGEX = "^\\w+(\\s\\w+)*$";
    private static final String RECORD_CODE_REGEX = "^BA-\\d{3}$";
    private static final String PATIENT_CODE_REGEX = "^BN-\\d{3}$";
    private static final String DATE_LEAP_YEAR_REGEX = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)" +
            "(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?" +
            "(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)" +
            "(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";


    static Scanner scanner = new Scanner(System.in);

    public static String regexString(String regexFormat, String input, String error) {
        boolean check = true;
        do {
            if (input.matches(regexFormat)) {
                check = false;
            } else {
                System.out.println(error);
                input = scanner.nextLine();
            }
        } while (check);
        return input;
    }

    public static String regexPositiveInteger(String input, String error) {
        return regexString(POSITIVE_INTEGERS_REGEX, input, error);
    }

    public static String regexPositiveDouble(String input, String error) {
        return regexString(POSITION_DOUBLE_REGEX, input, error);
    }

    public static String regexRequiredInput(String input, String error) {
        return regexString(REQUIRED_INPUT_REGEX, input, error);
    }

    public static String regexRecordCodeInput(String input, String error) {
        return regexString(RECORD_CODE_REGEX, input, error);
    }

    public static String regexPatientCodeInput(String input, String error) {
        return regexString(PATIENT_CODE_REGEX, input, error);
    }

    public static String regexDate(String input, String error) {
        return regexString(DATE_LEAP_YEAR_REGEX, input, error);
    }
}
