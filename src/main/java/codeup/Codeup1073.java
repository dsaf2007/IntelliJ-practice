package codeup;

import java.util.Scanner;

public class Codeup1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = -1;
        while(true)
        {
            num = sc.nextInt();
            if(num == 0) break;
            System.out.println(num);
        }
    }
}
