package ss6_inheritance.bai_tap.bai_tap_4_triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào màu của tam giác: ");
        String color = scanner.nextLine();
        System.out.println("Nhập vào độ dài cạnh 1: ");
        double side1 = scanner.nextDouble();
        System.out.println("Nhập vào độ dài cạnh 2: ");
        double side2 = scanner.nextDouble();
        System.out.println("Nhập vào độ dài cạnh 3: ");
        double side3 = scanner.nextDouble();
        Triangle triangle = new Triangle(color, true, side1, side2, side3);
        System.out.println(triangle);
    }
}
