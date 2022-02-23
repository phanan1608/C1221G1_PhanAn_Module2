package ss6_inheritance.bai_tap.bai_tap_1_circle_and_cylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);
        System.out.println(circle1.getArea());

        Circle circle2 = new Circle(2, "red");
        System.out.println(circle2);
        System.out.println(circle2.getArea());
    }
}
