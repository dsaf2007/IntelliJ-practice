package codeup;

import java.util.Scanner;

public class Codeup1035 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String input = sc.nextLine();

            int num = Integer.parseInt(input, 16);
            String hex = Integer.toOctalString(num);
            System.out.println(hex);
        }
}
