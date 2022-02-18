package ss3_array_function.bai_tap.bai_tap_6_calculate_sum_one_column;

import java.util.Scanner;

public class CalculateSumColumnInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int choiceColumn;
        do {
            System.out.println("Enter column need calculate: ");
            choiceColumn = scanner.nextInt();
            if (choiceColumn > matrix.length) {
                System.out.println("Enter column again: ");
            } else break;
        } while (true);
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == choiceColumn) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("Sum = " + sum);
    }
}
