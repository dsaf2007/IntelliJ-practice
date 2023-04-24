package codeup;

import java.util.Scanner;

public class Codeup1015 {
    public static void main(String[] args) {
        float num1;
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextFloat();
        num1 = (float) (Math.round(num1 * 100)/100.0);

        System.out.printf("%.2f",num1);
    }
}
