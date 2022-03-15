package case_study.utils;

public class Validate {
    public static boolean isPositiveInteger(String input) {
        String POSITIVE_INTEGERS = "^\\+*\\d+$";
        return input.matches(POSITIVE_INTEGERS);
    }

    public static boolean isFullName(String input) {
        String FULL_NAME_REGEX = "^\\p{Lu}\\p{Ll}+( \\p{Lu}\\p{Ll}+)*$";
        return input.matches(FULL_NAME_REGEX);
    }

    public static boolean isDayOfBirth(String input) {
        String BIRTH_DAY_REGEX = "^(?:0[1-9]|[12][0-9]|3[01])[-/.](?:0[1-9]|1[012])[-/.](?:19\\d{2}|20[01][0-9]|2022)$";
        return input.matches(BIRTH_DAY_REGEX);
    }

    public static void main(String[] args) {
        String a = "16/08/1997";
        System.out.println(isDayOfBirth(a));
    }

    public static boolean checkEmployeeId(String input) {
        String EMPLOYEE_ID_REGEX = "^E\\d{4}$";
        return input.matches(EMPLOYEE_ID_REGEX);
    }

    public static boolean checkSalary(String input) {
        String SALARY_REGEX = "^\\d{7,}$";
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
        String EMAIL_ADDRESS_REGEX = "^[a-z]\\w+@[a-z]{2,}\\.[a-z]{2,}$";
        return input.matches(EMAIL_ADDRESS_REGEX);
    }


}
