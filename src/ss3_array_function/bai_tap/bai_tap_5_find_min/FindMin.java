package ss3_array_function.bai_tap.bai_tap_5_find_min;

public class FindMin {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 2, 3, 12, 5, 7, 5};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
