package ss4_class_object_java.bai_tap.bai_tap_1_quadratic_equation;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    private QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            return (-b + Math.pow(this.getDiscriminant(), 0.5)) / 2 * a;
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (getDiscriminant() >= 0) {
            return (-b - Math.pow(this.getDiscriminant(), 0.5)) / 2 * a;
        } else {
            return 0;
        }
    }

    public String display() {
        if (getRoot1() == 0 && getRoot2() == 0) {
            return "The equation has no real roots";
        } else if (getRoot1() == getRoot2()) {
            return "The equation has one root " + this.getRoot1();
        } else {
            return "The equation has two roots " + this.getRoot1() + " and " + this.getRoot2();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        double a = scanner.nextDouble();
        System.out.println("Enter b");
        double b = scanner.nextDouble();
        System.out.println("Enter c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println(quadraticEquation.display());
    }
}
