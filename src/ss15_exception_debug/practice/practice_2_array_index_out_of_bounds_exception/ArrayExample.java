package ss15_exception_debug.practice.practice_2_array_index_out_of_bounds_exception;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random random = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = 0;
        try {
            x = scanner.nextInt();
            System.out.println("Giá trị của phần tử có chỉ số" + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            System.err.println("Lỗi nhập ký tự chuỗi");
        }
        System.out.println("vị trí của index là " + x);
    }
}
