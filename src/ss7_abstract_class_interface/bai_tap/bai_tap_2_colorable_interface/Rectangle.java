package ss7_abstract_class_interface.bai_tap.bai_tap_2_colorable_interface;

import ss7_abstract_class_interface.bai_tap.bai_tap_1_resizeable_interface.IResizeable;

public class Rectangle extends Shape implements IResizeable {
    private double width = 1.0;
    private double length = 1.0;


    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        setLength(percent * getLength() + getLength());
        setWidth(percent * getWidth() + getWidth());
    }
}
