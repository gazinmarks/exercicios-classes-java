package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Name: ");
        student.name = sc.nextLine();
        System.out.println();

        System.out.print("First note: ");
        student.firstNote = sc.nextDouble();

        System.out.print("Second note: ");
        student.secondNote = sc.nextDouble();

        System.out.print("Third note: ");
        student.thirdNote = sc.nextDouble();
        System.out.println();

        System.out.printf("Final grade = %.2f%n", student.sumNote());

        if (student.sumNote() < 60) {
            System.out.println("Failed");
            student.finalNote();
        } else
            System.out.println("Pass");

    }
}
