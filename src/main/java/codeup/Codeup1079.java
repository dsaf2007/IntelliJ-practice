package codeup;

import java.util.Scanner;

public class Codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        for(int i = 0; i < input.length; i++){
            System.out.println(input[i]);
            if(input[i].equals("q")) break;
        }
    }
}
