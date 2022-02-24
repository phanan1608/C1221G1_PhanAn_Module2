package ss7_abstract_class_interface.bai_tap.bai_tap_1_resizeable_interface;

public class TestResizeable {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Square square = new Square();
        Shape[] arrShape = {rectangle, circle, square};
//        System.out.println(Arrays.toString(arrShape));
        int random = (int) (Math.random()) * 100 + 1;
        for (Shape element : arrShape
        ) {
            System.out.println("before");
            System.out.println(element.getArea());

            if (element instanceof IResizeable) {
                ((IResizeable) element).resize(random);
            }
            System.out.println("after");
            System.out.println(element.getArea());
        }

//        System.out.println(rectangle.getArea());
//        System.out.println(circle.getArea());
//        System.out.println(square.getArea());


    }

}
