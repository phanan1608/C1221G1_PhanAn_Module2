package ss2_loop_java.thuc_hanh.thuc_hanh_1_is_prime;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        boolean isPrime = true;
        if (number < 2) {
            isPrime = false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        }
        if (isPrime)
            System.out.println(number + " is a prime");
        else
            System.out.println(number + " is NOT a prime");
    }
}
