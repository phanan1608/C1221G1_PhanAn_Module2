package ss4_class_object_java.bai_tap.bai_tap_3_fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.on) {
            return "Fan is on. " + "speed: " + getSpeed() + ", color: " + getColor() + ", radius: " + getRadius();
        } else {
            return "Fan is off. " + "color: " + getColor() + ", radius: " + getRadius();
        }
    }
}
