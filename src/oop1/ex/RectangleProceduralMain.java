package oop1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        RectangleProcedure rp = new RectangleProcedure();
        rp.width = 5;
        rp.height = 8;

        int area = rp.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = rp.calculatePerimeter();
        System.out.println("둘레: " + perimeter);

        boolean square = rp.isSquare();
        System.out.println("정사각형 여부: " + square);
    }

}
