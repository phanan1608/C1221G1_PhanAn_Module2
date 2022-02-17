package ss3_array_function.bai_tap.bai_tap_2_add_element;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Enter size (size<=20)");
            } else {
                break;
            }
        } while (true);
        int i = 0;
        array = new int[size];
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();
        System.out.println("Enter number need to add");
        int X = scanner.nextInt();
        int indexAdd;
        do {
            System.out.println("Enter index need to add");
            indexAdd = scanner.nextInt();
            if (indexAdd < 0 || indexAdd >= array.length - 1) {
                System.out.println("Enter index again");
            } else break;
        } while (true);
        for (int j = indexAdd; j < array.length; j++) {
            array[indexAdd + 1] = array[indexAdd];
        }
        array[indexAdd] = X;
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
