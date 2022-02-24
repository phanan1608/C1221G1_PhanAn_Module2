package ss7_abstract_class_interface.thuc_hanh.thuc_hanh_3_circle_comparator;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
//        return (int) (c1.getRadius() - c2.getRadius());
    }
}
