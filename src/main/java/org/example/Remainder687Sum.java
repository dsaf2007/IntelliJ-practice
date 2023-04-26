package org.example;

public class Remainder687Sum {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;
        answer += num % 10;
        num /= 10;
        answer += num % 10;
        num /= 10;
        answer += num % 10;
        System.out.println(answer);
    }
}
