package oop_review.exercise2_bank_account_management;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account1 = new Account(12345, "Phan An", 5000);
        Account account2 = new Account(11111, "Phan An", 10000);
        System.out.println(account2.toString());
        System.out.println(account1.toString());
        account2.tranfer(account1);
        System.out.println(account2.toString());
        System.out.println(account1.toString());
        account2.rechargeMoney();
        System.out.println(account2.toString());
        account1.withdrawMoney();
        System.out.println(account1.toString());
    }
}
