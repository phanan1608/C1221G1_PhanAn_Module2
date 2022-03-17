package case_study.utils;

public class Validate {
    public static boolean isPositiveInteger(String input) {
        String POSITIVE_INTEGERS = "^\\+*\\d+$";
        return input.matches(POSITIVE_INTEGERS);
    }

    public static boolean isPositiveDouble(String input) {
        String DOUBLE_INTEGERS = "^\\+*\\d+(\\.\\d+)*$";
        return input.matches(DOUBLE_INTEGERS);
    }

    public static boolean isFullName(String input) {
        String FULL_NAME_REGEX = "^\\p{Lu}\\p{Ll}+( \\p{Lu}\\p{Ll}+)*$";
        return input.matches(FULL_NAME_REGEX);
    }

    public static boolean isDayOfBirth(String input) {
        String BIRTH_DAY_REGEX = "^(?:0[1-9]|[12][0-9]|3[01])[-/.](?:0[1-9]|1[012])[-/.](?:19\\d{2}|20[01][0-9]|2022)$";
        return input.matches(BIRTH_DAY_REGEX);
    }


    public static boolean isEmployeeId(String input) {
        String EMPLOYEE_ID_REGEX = "^E\\d{4}$";
        return input.matches(EMPLOYEE_ID_REGEX);
    }

    public static boolean isCustomerId(String input) {
        String CUSTOMER_ID_REGEX = "^C\\d{4}$";
        return input.matches(CUSTOMER_ID_REGEX);
    }

    public static boolean isSalary(String input) {
        String SALARY_REGEX = "\\d{7,}(\\.\\d+)*$";
        return input.matches(SALARY_REGEX);
    }

    public static boolean isGender(String input) {
        String GENDER_REGEX = "^[a-z]+$";
        return input.matches(GENDER_REGEX);
    }

    public static boolean isIdentityCard(String input) {
        String ID_REGEX = "^\\d{9}|\\d{12}$";
        return input.matches(ID_REGEX);
    }

    public static boolean isTelephoneNumber(String input) {
        String TELEPHONE_NUMBER_REGEX = "^\\d{10}$";
        return input.matches(TELEPHONE_NUMBER_REGEX);
    }

    public static boolean isEmailAddress(String input) {
        String EMAIL_ADDRESS_REGEX = "^\\w+([.-]?\\w+)*@[a-z]+\\.(\\w+)(\\.\\w{2,3})?";
        return input.matches(EMAIL_ADDRESS_REGEX);
    }

    public static boolean isAddress(String input) {
        String ADDRESS_REGEX = "^\\d*(\\s\\w+)+|(\\w+)(\\s\\w+)+$";
        return input.matches(ADDRESS_REGEX);
    }

    public static boolean isInput(String input) {
        String INPUT_REGEX = "^\\w+(\\s\\w+)*$";
        return input.matches(INPUT_REGEX);
    }

    public static boolean isArea(String input) {
        String POOL_AREA = "^([3-9]\\d+)|(\\d){3,}(.\\d+)*$";
        return input.matches(POOL_AREA);
    }

    public static boolean isVillaId(String input) {
        String VILLA_ID = "^SVVL-\\d{4}$";
        return input.matches(VILLA_ID);
    }

    public static boolean isRoomId(String input) {
        String ROOM_ID = "^SVRO-\\d{4}$";
        return input.matches(ROOM_ID);
    }

    public static boolean isHouseId(String input) {
        String HOUSE_ID = "^SVHO-\\d{4}$";
        return input.matches(HOUSE_ID);
    }

    public static boolean isStandardName(String input) {
        String SERVICE_NAME_REGEX = "^[A-Z]\\w+$";
        return input.matches(SERVICE_NAME_REGEX);
    }

    public static boolean isMaximumPeople(String input) {
        String SERVICE_NAME_REGEX = "^([1-9]|(1\\d))$";
        return input.matches(SERVICE_NAME_REGEX);
    }

}
