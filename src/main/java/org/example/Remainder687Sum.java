package org.example;

public class Remainder687Sum {
    public static void main(String[] args) {
        int num = 687;
        int a = num % 10;
        num /= 10;
        int b = num % 10;
        num /= 10;
        int c = num %10;
        System.out.println(a+b+c);
    }
}
