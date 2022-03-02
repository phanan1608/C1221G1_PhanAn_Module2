package ss11_dsa_stack_queue.exercise.exercise_1_reverse_element;

import java.util.Arrays;
import java.util.Stack;

public class ReverseElement {
    public static int[] reverseArray(int[] array) {
        int size = array.length;
        Stack<Integer> arrayStack = new Stack<>();
        for (int value : array
        ) {
            arrayStack.push(value);
        }
        for (int i = 0; i < size; i++) {
            array[i] = arrayStack.pop();
        }
        return array;
    }

    public static String reverseString(String string) {
        Stack<Character> wStack = new Stack<>();
        int size = string.length();
        String newString = "";
        for (int i = 0; i < size; i++) {
            wStack.push(string.charAt(i));
        }
        for (int i = 0; i < size; i++) {
            newString += wStack.pop();
        }
        return newString;
    }

    public static void main(String[] args) {
        System.out.println("----Đảo ngược mảng----");
        int[] array = {10, 12, 3, 4, 15};
        System.out.println(Arrays.toString(reverseArray(array)));
        System.out.println("----Đảo ngược chuỗi----");
        Stack<Character> wStack = new Stack<>();
        String mWord = "ABCDE";
        System.out.println(reverseString(mWord));

//        Stack<Integer> arrayStack = new Stack<>();
//
//        for (int value : array) {
//            arrayStack.push(value);
//        }
//        for (int i = 0; i < array.length; i++) {
//            array[i] = arrayStack.pop();
//        }
//        System.out.println(Arrays.toString(array));

//        String newString = "";
//
//        for (int i = 0; i < mWord.length(); i++) {
//            wStack.push(mWord.charAt(i));
//        }
//        System.out.println(wStack);
//        for (int i = 0; i < mWord.length(); i++) {
//            newString += wStack.pop();
//        }
    }
}
