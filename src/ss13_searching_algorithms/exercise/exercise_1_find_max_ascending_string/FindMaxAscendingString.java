package ss13_searching_algorithms.exercise.exercise_1_find_max_ascending_string;

import java.util.LinkedList;
import java.util.Scanner;

public class FindMaxAscendingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string");
        String string = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> temp = new LinkedList<>();
            temp.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > temp.getLast()) {
                    temp.add(string.charAt(j));
                }
            }
            if (temp.size() > max.size()) {
                max.clear();
                max.addAll(temp);
            }
            temp.clear();
        }
        System.out.println("Max string is:");
        for (Character word : max) {
            System.out.print(word);
        }
    }
}


