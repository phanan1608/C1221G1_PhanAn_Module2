package ss6_inheritance.bai_tap.bai_tap_2_point_2d_point_3d;

import java.util.Arrays;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(10, 20);
        System.out.println(point2D);
        float[] floats = point2D.getXY();
        System.out.println(Arrays.toString(floats));
    }
}
