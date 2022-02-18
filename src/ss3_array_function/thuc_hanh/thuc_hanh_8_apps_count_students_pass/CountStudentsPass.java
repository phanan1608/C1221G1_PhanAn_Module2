package ss3_array_function.thuc_hanh.thuc_hanh_8_apps_count_students_pass;

import java.util.Scanner;

public class CountStudentsPass {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
            else break;
        } while (true);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a mark for student " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            if (array[i] >= 5 && array[i] <= 10) {
                count++;
            }
        }
        System.out.println("The number of students passing the exam is " + count);
    }
}
