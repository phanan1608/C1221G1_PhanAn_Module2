package ss11_dsa_stack_queue.exercise.exercise_4_convert_decimal_to_binary_system;

import java.util.Stack;

public class ConvertDecimalToBinarySystem {
    public static String convertDecimalToBinarySystem(int number) {
        String result = "";
        Stack<Integer> stack = new Stack<>();
        while (number != 0) {
            stack.push(number % 2);
            number /= 2;
        }
        System.out.println(stack);
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(convertDecimalToBinarySystem(111));
    }
}
