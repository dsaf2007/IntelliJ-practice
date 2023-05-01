package codeup;

import java.util.HexFormat;
import java.util.Scanner;

public class Codeup1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine(),16);

        for(int i = 1; i < 16; i++)
        {
            System.out.printf("%X*%X=%X\n",num,i,num*i);
        }
    }
}
