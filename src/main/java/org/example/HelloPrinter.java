package org.example;

public class HelloPrinter {
    Print2 printer;

    HelloPrinter(Print2 printer) {
        this.printer = printer;
    }

    public void repeatMessage(int n, String message) {
        for(int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        HelloPrinter hp = new HelloPrinter(new ConsolePrinter());
        hp.repeatMessage(5,"Hello");
    }
}
