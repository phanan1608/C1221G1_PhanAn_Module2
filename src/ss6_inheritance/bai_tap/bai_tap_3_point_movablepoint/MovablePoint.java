package ss6_inheritance.bai_tap.bai_tap_3_point_movablepoint;

public class MovablePoint extends Point {
    private float xSpeed, ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.setXSpeed(xSpeed);
        this.setYSpeed(ySpeed);
    }

    public float[] getSpeed() {
        return new float[]{this.getXSpeed(), this.getYSpeed()};
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "),speed=(" + getXSpeed() + "," + getYSpeed() + ")";
    }

    public MovablePoint move() {
        super.setX(super.getX() + getXSpeed());
        super.setY(super.getY() + getYSpeed());
        return this;
    }

}
