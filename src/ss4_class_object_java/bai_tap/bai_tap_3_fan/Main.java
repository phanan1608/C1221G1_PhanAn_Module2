package ss4_class_object_java.bai_tap.bai_tap_3_fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.turnOn();
        System.out.println("Fan1: " + fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.turnOff();
        System.out.println("Fan2: " + fan2.toString());
    }
}
