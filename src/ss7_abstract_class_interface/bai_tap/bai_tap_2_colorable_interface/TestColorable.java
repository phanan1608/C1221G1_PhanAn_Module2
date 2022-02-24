package ss7_abstract_class_interface.bai_tap.bai_tap_2_colorable_interface;

public class TestColorable {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Shape[] shapes = {circle, square, rectangle};

        for (Shape element : shapes) {
            if (element instanceof IColorable) {
                ((IColorable) element).howToColor();
            }
        }
    }
}
