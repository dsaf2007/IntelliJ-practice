package org.example;

import java.util.Scanner;

public class ScannerEx {

    private String val1;
    private String val2;

    public void readTwoStrings() {
        Scanner sc = new Scanner(System.in);
        this.val1 = sc.next();
        this.val2 = sc.next();
    }

    public String addTwoStrings() {
        return this.val1 + this.val2;
    }
}
