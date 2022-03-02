package ss11_dsa_stack_queue.exercise.exercise_2_count_word_in_string;

import java.util.Map;
import java.util.TreeMap;

public class CountWordInString {
    public static void main(String[] args) {
        String string = "Hello My My, My name is An";

        Map<String, Integer> map = new TreeMap<>();
        String[] words = string.toLowerCase().split(" ");

        for (String word : words) {
            System.out.println(word);
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.replace(word, map.get(word) + 1);
            }
        }
        System.out.println("Count word in string:" + map);
    }
}
