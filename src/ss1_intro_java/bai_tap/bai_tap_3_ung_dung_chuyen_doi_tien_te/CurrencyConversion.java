package ss1_intro_java.bai_tap.bai_tap_3_ung_dung_chuyen_doi_tien_te;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rate = 23000;
        System.out.println("Nhập vào tiền USD");
        double usd = Double.parseDouble(scanner.nextLine());
        double vnd = usd * rate;

        System.out.println(usd + "USD tương đướng với " + vnd + " VNĐ");
    }
}

