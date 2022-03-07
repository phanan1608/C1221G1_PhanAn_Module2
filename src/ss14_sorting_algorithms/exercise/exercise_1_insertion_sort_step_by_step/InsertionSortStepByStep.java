package ss14_sorting_algorithms.exercise.exercise_1_insertion_sort_step_by_step;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortStepByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("Trước khi sort");
        insertionSort(list);
    }

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
                System.out.println("Lần thứ " + i + "-pos tại vị trí " + pos + Arrays.toString(array));
            }
            array[pos] = x;
            System.out.println("Mảng sau lần sort thứ " + i + " : " + Arrays.toString(array));
        }
    }
}
