package ss3_array_function.bai_tap.bai_tap_1_delete_element;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Enter size again(size<=20)");
            } else {
                break;
            }
        } while (true);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();
        System.out.println("Enter the element need to delete: ");
        int X = scanner.nextInt();
        int indexDelete = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == X) {
                indexDelete = j;
            }
        }
        for (int j = indexDelete; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }
        array[array.length - 1] = 0;
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
