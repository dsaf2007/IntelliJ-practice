package codeup.advanced;

import java.util.Scanner;

public class Codeup1165 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int score = sc.nextInt();

        for(int i = time; i < 90; i+=5)
        {
            score++;
        }
        System.out.println(score);
    }
}
