package ss2_loop_java.bai_tap.bai_tap_1_display_shape;

import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle " +
                    "(The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter Width");
                    int rectangleWidth = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter Height");
                    int rectangleHeight = Integer.parseInt(scanner.nextLine());
                    for (int i = 1; i <= rectangleHeight; i++) {
                        for (int j = 1; j <= rectangleWidth; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Choose the angle of the corner is square:");
                    System.out.println("1.top-left");
                    System.out.println("2.top-right");
                    System.out.println("3.bottom-left");
                    System.out.println("4.bottom-right");
                    int chooseAngles = Integer.parseInt(scanner.nextLine());
                    switch (chooseAngles) {
                        case 1:
                            System.out.println("square triangle: top-left");
                            for (int i = 7; i >= 1; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            System.out.println("square triangle: top-right");
                            for (int i = 1; i <= 5; i++) {
                                for (int j = 1; j <= 5; j++) {
                                    if (j < i) {
                                        System.out.print(" ");
                                    } else {
                                        System.out.print("*");
                                    }
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            System.out.println("square triangle: bottom-left");
                            for (int i = 1; i <= 5; i++) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            System.out.println("square triangle: bottom-right");
                            for (int i = 1; i <= 5; i++) {
                                for (int j = 1; j <= 5; j++) {
                                    if (j <= 5 - i) {
                                        System.out.print(" ");
                                    } else {
                                        System.out.print("*");
                                    }
                                }
                                System.out.println();
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 0; j < 10; j++) {
                            if (j <= 5 - i || j >= 5 + i) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}

