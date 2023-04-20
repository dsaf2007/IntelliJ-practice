package org.example;

import java.util.Scanner;

public class ScannerEx {

    private int val1;
    private int val2;


    public void readTwoNumbers() {
        Scanner sc = new Scanner(System.in);
        this.val1 = sc.nextInt();
        this.val2 = sc.nextInt();
    }

    public int addTwoNumbers() {
        return this.val1 + this.val2;
    }
}
