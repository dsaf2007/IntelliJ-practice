package codeup.advanced;

import java.util.Scanner;

public class Codeup1166 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year % 400 == 0)
        {
            System.out.println("Leap");
        }
        else if(year % 4 == 0) //4의 배수이며
        {
            if(year % 100 == 0)
            {
                System.out.println("Normal");
            }
            else
            {
                System.out.println("Leap");
            }
        }
        else
        {
            System.out.println("Normal");
        }
    }
}
