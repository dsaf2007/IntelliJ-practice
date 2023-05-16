package week4;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList strings = new ArrayList<>();

        strings.add("hello");
        strings.add("world");

        System.out.println("strings.get(0) = " + strings.get(0));
        strings.remove(0);
        System.out.println("strings = " + strings.get(0));
    }
}
