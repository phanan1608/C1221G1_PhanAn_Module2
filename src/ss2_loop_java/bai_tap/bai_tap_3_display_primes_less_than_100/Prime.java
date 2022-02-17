package ss2_loop_java.bai_tap.bai_tap_3_display_primes_less_than_100;

public class Prime {
    public static void main(String[] args) {
        int n = 2;
        while (n < 100) {
            boolean isPrime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n);
            }
            n++;
        }
    }
}
