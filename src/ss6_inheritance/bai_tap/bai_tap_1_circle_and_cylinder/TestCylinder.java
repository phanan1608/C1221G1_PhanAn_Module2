package ss6_inheritance.bai_tap.bai_tap_1_circle_and_cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);
        System.out.println(cylinder1.getArea());
        System.out.println(cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(2);
        System.out.println(cylinder2);
        System.out.println(cylinder2.getArea());
        System.out.println(cylinder2.getVolume());

        Cylinder cylinder3 = new Cylinder(2, "yellow", 4);
        System.out.println(cylinder3);
        System.out.println(cylinder3.getArea());
        System.out.println(cylinder3.getVolume());
    }
}
