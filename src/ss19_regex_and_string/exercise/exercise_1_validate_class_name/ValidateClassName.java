package ss19_regex_and_string.exercise.exercise_1_validate_class_name;

import java.util.regex.Pattern;

public class ValidateClassName {
    public static final String ClASS_NAME = "^[CPA]\\d{4}[GHIKLM]$";

    public static void main(String[] args) {
        String classname1 = "C0318G";
        String classname2 = "M0318G";
        String classname3 = "P0323A";
        boolean check1 = Pattern.matches(ClASS_NAME, classname1);
        boolean check2 = Pattern.matches(ClASS_NAME, classname2);
        boolean check3 = Pattern.matches(ClASS_NAME, classname3);
        System.out.println(classname1 + " là tên lớp học: " + check1);
        System.out.println(classname2 + " là tên lớp học: " + check2);
        System.out.println(classname3 + " là tên lớp học: " + check3);
    }
}
