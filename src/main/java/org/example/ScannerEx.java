package org.example;

import java.util.Scanner;

public class ScannerEx {

    private String val1;
    private String val2;

    Scanner sc = new Scanner(System.in);

    public void readTwoStrings() {

        this.val1 = sc.next();
        this.val2 = sc.next();
    }

    public String addTwoStrings() {
        return this.val1 + this.val2;
    }

    public double getAverage()
    {
        double num1; double num2; double num3;

        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();
        return (double)((num1 + num2 + num3)/(3.0));
    }
}
