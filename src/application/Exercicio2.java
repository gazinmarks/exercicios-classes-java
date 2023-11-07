package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Gross salary: ");
        double grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        double tax = sc.nextDouble();
        System.out.println();

        Employee employee = new Employee(name, grossSalary, tax);

//        System.out.println(employee.name);        |
//        System.out.println(employee.grossSalary); | TESTANDO PARA VER SE O CONSTRUTOR NAO ESTA VAZIO
//        System.out.println(employee.tax);         |

        System.out.printf("Employee: %s, $ %.2f", employee.name, employee.netSalary());
        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        System.out.println();

        employee.increaseSalary(percentage);

        System.out.printf("Updated data: %s, $ %.2f", employee.name, employee.grossSalary);

    }
}
