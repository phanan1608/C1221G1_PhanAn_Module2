package ss11_dsa_stack_queue.exercise.exercise_5_check_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        String string = "Able was I ere I saw Elba";
        string = string.toLowerCase();
        Stack<Character> stack = new Stack<>();
        Queue queue = new LinkedList();


        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
            queue.add(string.charAt(i));
        }
        System.out.println(stack);
        System.out.println(queue);

        boolean isPalindrome = true;
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);


    }
}

