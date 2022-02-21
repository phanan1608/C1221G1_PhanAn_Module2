package ss4_class_object_java.bai_tap.bai_tap_2_stop_watch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println(stopWatch.getElapsedTime());
        stopWatch.start();
        long sum = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                sum += j;
            }
            System.out.println(sum);
        }
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());
        System.out.println(stopWatch.display());
    }
}
