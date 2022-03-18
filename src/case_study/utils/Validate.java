package case_study.utils;

import java.util.Scanner;

public class Validate {
    public static final String POSITIVE_INTEGERS_REGEX = "^\\+*\\d+$";
    public static final String POSITION_DOUBLE_REGEX = "^\\+*\\d+(\\.\\d+)*$";
    public static final String FULL_NAME_REGEX = "^\\p{Lu}\\p{Ll}+( \\p{Lu}\\p{Ll}+)*$";
    public static final String BIRTH_DAY_REGEX = "^(?:0[1-9]|[12][0-9]|3[01])[-/.](?:0[1-9]|1[012])[-/.](?:19\\d{2}|20[01][0-9]|2022)$";
    public static final String EMPLOYEE_ID_REGEX = "^E\\d{5}$";
    public static final String CUSTOMER_ID_REGEX = "^C\\d{5}$";
    public static final String SALARY_REGEX = "\\d{7,}(\\.\\d+)*$";
    public static final String GENDER_REGEX = "^[a-zA-Z]+$";
    public static final String ID_REGEX = "^\\d{9}|\\d{12}$";
    public static final String TELEPHONE_NUMBER_REGEX = "^0\\d{9}$";
    public static final String EMAIL_ADDRESS_REGEX = "^\\w+([.-]?\\w+)*@[a-z]+\\.(\\w+){2,}(\\.\\w{2,3})?";
    public static final String ADDRESS_REGEX = "^\\d*(\\s\\w+)+|(\\w+)(\\s\\w+)+$";
    public static final String INPUT_REGEX = "^\\w+(\\s\\w+)*$";
    public static final String AREA_REGEX = "^([3-9]\\d+(.\\d+)*)|(\\d){3,}(.\\d+)*$";
    public static final String VILLA_ID_REGEX = "^SVVL-\\d{4}$";
    public static final String ROOM_ID_REGEX = "^SVRO-\\d{4}$";
    public static final String HOUSE_ID_REGEX = "^SVHO-\\d{4}$";
    public static final String STANDARD_NAME_REGEX = "^[A-Z]\\w+$";
    public static final String MAXIMUM_PEOPLE_REGEX = "^([1-9]|(1\\d))$";

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

    public static String regexFullName(String input, String error) {
        return regexString(FULL_NAME_REGEX, input, error);
    }

    public static String regexDayOfBirth(String input, String error) {
        return regexString(BIRTH_DAY_REGEX, input, error);
    }

    public static String regexEmployeeId(String input, String error) {
        return regexString(EMPLOYEE_ID_REGEX, input, error);
    }

    public static String regexCustomerId(String input, String error) {
        return regexString(CUSTOMER_ID_REGEX, input, error);
    }

    public static String regexSalary(String input, String error) {
        return regexString(SALARY_REGEX, input, error);
    }

    public static String regexGender(String input, String error) {
        return regexString(GENDER_REGEX, input, error);
    }

    public static String regexIdentityCard(String input, String error) {
        return regexString(ID_REGEX, input, error);
    }

    public static String regexTelephoneNumber(String input, String error) {
        return regexString(TELEPHONE_NUMBER_REGEX, input, error);
    }

    public static String regexEmailAddress(String input, String error) {
        return regexString(EMAIL_ADDRESS_REGEX, input, error);
    }

    public static String regexAddress(String input, String error) {
        return regexString(ADDRESS_REGEX, input, error);
    }

    public static String regexInput(String input, String error) {
        return regexString(INPUT_REGEX, input, error);
    }

    public static String regexArea(String input, String error) {
        return regexString(AREA_REGEX, input, error);
    }

    public static String regexVillaId(String input, String error) {
        return regexString(VILLA_ID_REGEX, input, error);
    }

    public static String regexRoomId(String input, String error) {
        return regexString(ROOM_ID_REGEX, input, error);
    }

    public static String regexHouseId(String input, String error) {
        return regexString(HOUSE_ID_REGEX, input, error);
    }

    public static String regexStandardName(String input, String error) {
        return regexString(STANDARD_NAME_REGEX, input, error);
    }

    public static String regexMaximumPeople(String input, String error) {
        return regexString(MAXIMUM_PEOPLE_REGEX, input, error);
    }
}
