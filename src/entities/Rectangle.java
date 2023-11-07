package entities;

public class Rectangle {
    public double height;
    public double width;


    public double area() {
        return width * height;
    }

    public double perimeter() {
        return (width + height) * 2;
    }

    public double diagonal() {
        width = Math.pow(width, 2);
        height = Math.pow(height, 2);

        return Math.sqrt(width + height);

    }
}
