package org.example;

public class PointTest {
    public static void main(String[] args) {
        Point Point1 = new Point();
        Point point2 = new Point();

        Point1.x = 1;
        Point1.y = 1;

        if(Point1.isSame())
        {
            System.out.println("Same");
        }
        else {
            System.out.println("Not Same");
        }
    }
}
