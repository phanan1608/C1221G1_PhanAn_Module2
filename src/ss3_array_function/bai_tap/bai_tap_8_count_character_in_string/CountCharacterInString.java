package ss3_array_function.bai_tap.bai_tap_8_count_character_in_string;

import java.util.Scanner;

public class CountCharacterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "Hello World";
        System.out.println("Enter character: ");
        char character = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
            if (string.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("count= " + count);
    }
}
