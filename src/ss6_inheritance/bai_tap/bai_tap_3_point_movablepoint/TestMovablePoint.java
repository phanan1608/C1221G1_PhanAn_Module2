package ss6_inheritance.bai_tap.bai_tap_3_point_movablepoint;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2, 3, 1, 1);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
        movablePoint.setXSpeed(3);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
