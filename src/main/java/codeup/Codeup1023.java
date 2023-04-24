package codeup;

import java.util.Scanner;

public class Codeup1023 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();

        String[] numArr = inputStr.split("\\.");

        for (String s : numArr) {
            System.out.println(s);
        }
    }
}
