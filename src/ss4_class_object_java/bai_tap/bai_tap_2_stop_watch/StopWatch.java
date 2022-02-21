package ss4_class_object_java.bai_tap.bai_tap_2_stop_watch;

public class StopWatch {
    private long startTime;
    private long endTime;

    StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public String display() {
        return "ElapsedTime: " + this.getElapsedTime();
    }

}
