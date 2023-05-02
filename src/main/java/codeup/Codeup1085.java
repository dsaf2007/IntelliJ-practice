package codeup;

import java.util.Scanner;

public class Codeup1085 {
    public static void main(String[] args) {
        double h,b,c,s;
        Scanner sc = new Scanner(System.in);
        h = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        s = sc.nextDouble();

        double hbc = h*b*c;

        double result = ((double)(hbc)/(8388608))*s;

        System.out.printf("%f MB\n",result);
    }
}
