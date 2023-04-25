package codeup;

import java.util.Scanner;

public class Codeup1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char inputCh = sc.nextLine().charAt(0);
        int ascii = (int)inputCh;
        ascii++;
        System.out.println((char)ascii);
    }
}
