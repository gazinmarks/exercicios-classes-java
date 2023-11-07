package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

//        System.out.print("Quantity in stock: ");
//        int quantity = sc.nextInt();

        Product product = new Product(name, price);

//        System.out.println(product.name);
//        System.out.println(product.price); // CONFERINDO OS VALORES DO CONSTRUTOR PARA VER SE NAO ESTA MAIS VAZIO
//        System.out.println(product.quantity);

        System.out.println();
        System.out.println(product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.printf("Updated data: %s", product.toString());

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.printf("Updated data: %s", product.toString());


    }
}