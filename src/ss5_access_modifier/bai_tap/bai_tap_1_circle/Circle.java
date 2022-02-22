package ss5_access_modifier.bai_tap.bai_tap_1_circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public static final double PI = 3.14;

    public Circle() {
    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * PI;
    }
}
