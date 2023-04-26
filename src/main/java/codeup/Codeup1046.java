package codeup;

import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, num3;
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();
        System.out.printf("%d\n",(int)(num1 + num2 + num3));
        System.out.printf("%.1f",(num1 + num2 + num3) / 3);


    }
}
