package codeup;

import java.util.Scanner;

public class Codeup1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int I = sc.nextInt();
        int J = sc.nextInt();

        for(int i = 1; i <=I; i++)
        {
            for(int j = 1; j <= J; j++)
            {
                System.out.printf("%d %d\n",i, j);
            }
        }
    }

}

