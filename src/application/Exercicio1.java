package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter rectangle width and height: ");
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(height, width);

        double area = rectangle.area();
        System.out.printf("Area: %.2f%n", area);

        double perimeter = rectangle.perimeter();
        System.out.printf("Perimeter: %.2f%n", perimeter);

        double diagonal = rectangle.diagonal();
        System.out.printf("Diagonal: %.2f%n", diagonal);
    }
}