package codeup;

import java.util.Scanner;

public class Codeup1086 {
    public static void main(String[] args) {
        double w,h,b;
        Scanner sc = new Scanner(System.in);
        w = sc.nextDouble();
        h = sc.nextDouble();
        b = sc.nextDouble();


        double result = ((double)(h*b*w)/(8388608));

        System.out.printf("%.2f MB\n",result);
    }
}
