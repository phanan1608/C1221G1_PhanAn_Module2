package ss3_array_function.bai_tap.bai_tap_7_calculate_sum_cross_matrix;

import java.util.Scanner;

public class SumCrossMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter" + matrix.length + " rows and " +
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
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    total += matrix[i][j];
                }
            }
        }
        System.out.println(total);
    }
}
