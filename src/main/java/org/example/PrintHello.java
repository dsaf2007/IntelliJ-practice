package org.example;

import java.io.IOException;
import java.io.InputStreamReader;

public class PrintHello {

    public static void printHello() {
        System.out.println(1 + 1);
    }

    public static void printBye() {
        System.out.println("Bye!");
    }

    public static void main(String[] args) throws IOException {

        InputStreamReader inputStreamReader1 = new InputStreamReader(System.in);
        InputStreamReader inputStreamReader2 = new InputStreamReader(System.in);

        int asciiCode1 = inputStreamReader1.read();
        int asciiCode2 = inputStreamReader2.read();

        System.out.println("asciiCode1 = " + asciiCode1);
        System.out.println("asciiCode2 = " + asciiCode2);
    }
}