package ss6_inheritance.thuc_hanh.thuc_hanh_1_shape_object_system;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange", true, 2.5, 3.8);
        System.out.println(rectangle);
    }
}
