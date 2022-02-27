package oop_review.exercise2_bank_account_management;

import java.util.Scanner;

public class Account {
    private long accountNumber;
    private String accountName;
    private double money;
    public static final double INTEREST_RATE = 0.035;

    public Account() {
    }

    public Account(long accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.money = 50;
    }

    public Account(long accountNumber, String accountName, double money) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.money = money;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    Scanner scanner = new Scanner(System.in);

    public void rechargeMoney() {
        double rechargeMoney;
        do {
            System.out.println("Enter recharge money: ");
            rechargeMoney = Double.parseDouble(scanner.nextLine());
            if (rechargeMoney <= 0) {
                System.out.println("!!!Illegal,enter please!!!");
            } else {
                break;
            }
        } while (true);
        this.setMoney(this.getMoney() + rechargeMoney);
    }


    public void withdrawMoney() {
        double withdrawMoney;
        do {
            System.out.println("Enter withdraw money:");
            withdrawMoney = Double.parseDouble(scanner.nextLine());
            if (withdrawMoney <= 0 || withdrawMoney > this.getMoney()) {
                System.out.println("!!!Illegal,enter please!!!");
            } else {
                break;
            }
        } while (true);
        this.setMoney(this.getMoney() - withdrawMoney);

    }

    public void matureDeposite() {
        this.setMoney(this.getMoney() + this.getMoney() * INTEREST_RATE);
    }

    public void tranfer(Account receiveAccount) {
        double moneyTranfer;
        do {
            System.out.println("Enter tranfer money:");
            moneyTranfer = Double.parseDouble(scanner.nextLine());
            if (moneyTranfer <= 0 || moneyTranfer > this.getMoney()) {
                System.out.println("!!!Illegal,enter please!!!");
            } else {
                break;
            }
        } while (true);
        this.setMoney(this.getMoney() - moneyTranfer);
        receiveAccount.setMoney(receiveAccount.getMoney() + moneyTranfer);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountName=" + accountName +
                ", money=" + money +
                '}';
    }
}
