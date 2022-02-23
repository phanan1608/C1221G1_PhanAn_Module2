package ss6_inheritance.bai_tap.bai_tap_2_point_2d_point_3d;

import java.util.Arrays;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(2, 3, 4);
        System.out.println(point3D);
        point3D.setXYZ(1, 2, 3);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
