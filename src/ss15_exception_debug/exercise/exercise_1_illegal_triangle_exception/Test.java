package ss15_exception_debug.exercise.exercise_1_illegal_triangle_exception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 1 of triangle");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter side 2 of triangle");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter side 3 of triangle");
        double side3 = Double.parseDouble(scanner.nextLine());
        try {
            checkSides(side1, side2, side3);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        } finally {
            System.out.println("End end of program");
        }
    }

    public static void checkSides(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 < 0 || side2 < 0 || side3 < 0) {
            throw new IllegalTriangleException("Cạnh tam giác không được là số âm");
        }
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Hai cạnh tam giác phải lớn hơn cạnh còn lại");
        }
    }
}
