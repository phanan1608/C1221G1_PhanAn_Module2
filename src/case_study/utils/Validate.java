package case_study.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    private static final String POSITIVE_INTEGERS_REGEX = "^\\+*\\d+$";
    private static final String POSITION_DOUBLE_REGEX = "^\\+*\\d+(\\.\\d+)*$";
    private static final String FULL_NAME_REGEX = "^\\p{Lu}\\p{Ll}+( \\p{Lu}\\p{Ll}+)*$";
    private static final String BIRTHDAY_REGEX = "^(?:0[1-9]|[12][0-9]|3[01])[-/.](?:0[1-9]|1[012])[-/.](?:19\\d{2}|20[01][0-9]|202[12])$";
    private static final String DATE_REGEX = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
    private static final String EMPLOYEE_ID_REGEX = "^E\\d{5}$";
    private static final String CUSTOMER_ID_REGEX = "^C\\d{5}$";
    private static final String GENDER_REGEX = "^[a-zA-Z]+$";
    private static final String ID_REGEX = "^\\d{9}|\\d{12}$";
    private static final String TELEPHONE_NUMBER_REGEX = "^[01]\\d{9}$";
    private static final String EMAIL_ADDRESS_REGEX = "^\\w+([.-]?\\w+)*@[a-z]+\\.(\\w+){2,}(\\.\\w{2,3})?";
    private static final String ADDRESS_REGEX = "^\\d*(\\s\\w+)+|(\\w+)(\\s\\w+)+$";
    private static final String INPUT_REGEX = "^\\w+(\\s\\w+)*$";
    private static final String AREA_REGEX = "^([3-9]\\d+(.\\d+)?)|[1-9](\\d){2,}(.\\d+)?$";
    private static final String VILLA_ID_REGEX = "^SVVL-\\d{4}$";
    private static final String ROOM_ID_REGEX = "^SVRO-\\d{4}$";
    private static final String HOUSE_ID_REGEX = "^SVHO-\\d{4}$";
    private static final String STANDARD_NAME_REGEX = "^[A-Z]\\w+$";
    private static final String MAXIMUM_PEOPLE_REGEX = "^([1-9]|(1\\d))$";
    private static final String BOOKING_CODE_REGEX = "^B\\d{6}$";


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

    public static String regexDate(String input, String error) {
        return regexString(DATE_REGEX, input, error);
    }

    public static String regexAge18to100(String input) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(BIRTHDAY_REGEX, input)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate birthday = LocalDate.parse(input, formatter);
                    LocalDate now = LocalDate.now();
                    int age = Period.between(birthday, now).getYears();
                    if (age >= 18 && age <= 100) {
                        check = false;
                    } else {
                        throw new UserException("Invalid Age. Age must be more than 18 and less than 100");
                    }
                } else {
                    throw new UserException("Invalid Age. Please Re-enter (dd/mm/yyyy)");
                }
            } catch (UserException e) {
                System.err.println(e.getMessage());
                input = scanner.nextLine();
            }
        }
        return input;
    }

    public static String regexEmployeeId(String input, String error) {
        return regexString(EMPLOYEE_ID_REGEX, input, error);
    }

    public static String regexCustomerId(String input, String error) {
        return regexString(CUSTOMER_ID_REGEX, input, error);
    }

    public static String regexMoney(String input, String error) {
        return regexString(POSITION_DOUBLE_REGEX, input, error);
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

    public static String regexBookingCode(String input, String error) {
        return regexString(BOOKING_CODE_REGEX, input, error);
    }
}
