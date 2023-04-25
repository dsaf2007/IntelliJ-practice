package codeup;

import java.util.Scanner;

public class Codeup1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] time = sc.nextLine().split(":");
        int min = Integer.parseInt(time[1]);
        System.out.printf("%d",min);
    }
}
