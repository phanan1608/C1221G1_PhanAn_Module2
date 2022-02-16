package ss1_intro_java.bai_tap.bai_tap_2_doc_so_thanh_chu;

import java.util.Scanner;

public class ConvertNumberToLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = Integer.parseInt(scanner.nextLine());

        String str = "";
        int hundreds, tens, ones;
        hundreds = number / 100;
        tens = (number - (hundreds * 100)) / 10;
        ones = number % 10;

        if (hundreds == 0 && tens == 0 && ones == 0) {
            str += "zero";
        } else {
            if (hundreds >= 1 && hundreds <= 9) {
                switch (hundreds) {
                    case 1:
                        str += "one hundred ";
                        break;
                    case 2:
                        str += "two hundred ";
                        break;
                    case 3:
                        str += "three hundred ";
                        break;
                    case 4:
                        str += "four hundred ";
                        break;
                    case 5:
                        str += "five hundred ";
                        break;
                    case 6:
                        str += "six hundred ";
                        break;
                    case 7:
                        str += "seven hundred ";
                        break;
                    case 8:
                        str += "eight hundred ";
                        break;
                    case 9:
                        str += "nine hundred ";
                        break;
                }
                if (tens > 0 || ones > 0) {
                    str += "and ";
                }
            }
            if (tens == 1) {
                switch (ones) {
                    case 0:
                        str += "ten";
                        break;
                    case 1:
                        str += "eleven";
                        break;
                    case 2:
                        str += "Twelve";
                        break;
                    case 3:
                        str += "Thirteen";
                        break;
                    case 4:
                        str += "Fourteen";
                        break;
                    case 5:
                        str += "Fifteen";
                        break;
                    case 6:
                        str += "Sixteen";
                        break;
                    case 7:
                        str += "Seventeen";
                        break;
                    case 8:
                        str += "Eighteen";
                        break;
                    case 9:
                        str += "Nineteen";
                        break;
                }
            } else {
                switch (tens) {
                    case 2:
                        str += "Twenty ";
                        break;
                    case 3:
                        str += "Thirty ";
                        break;
                    case 4:
                        str += "Forty ";
                        break;
                    case 5:
                        str += "Fifty ";
                        break;
                    case 6:
                        str += "Sixty ";
                        break;
                    case 7:
                        str += "Seventy ";
                        break;
                    case 8:
                        str += "Eighty ";
                        break;
                    case 9:
                        str += "Ninety ";
                        break;
                }
                switch (ones) {

                    case 1:
                        str += "one";
                        break;
                    case 2:
                        str += "two";
                        break;
                    case 3:
                        str += "three";
                        break;
                    case 4:
                        str += "four";
                        break;
                    case 5:
                        str += "five";
                        break;
                    case 6:
                        str += "six";
                        break;
                    case 7:
                        str += "seven";
                        break;
                    case 8:
                        str += "eight";
                        break;
                    case 9:
                        str += "nine";
                        break;
                }
            }
        }
        System.out.println(str);
        System.out.println(tens);
        System.out.println(ones);
    }
}



