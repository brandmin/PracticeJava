package oop1.ex;

public class RectangleProcedure {
    int width = 5;
    int height = 8;

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return this.width == this.height;
    }
}
