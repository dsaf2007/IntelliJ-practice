package codeup;

import java.util.Scanner;

public class Codeup1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;


        do {
            result = 0;
            while (num > 0) {
                result += num % 10;
                num /= 10;
            }
            num = result;
        }while(num / 10 > 0);
        System.out.println(result);
    }
}
