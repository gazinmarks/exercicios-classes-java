package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What's the dollar price? ");
        CurrencyConverter.dollarPrice = sc.nextDouble();
        System.out.println();

        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.dollarQuantity = sc.nextDouble();
        System.out.println();

        System.out.printf("Amount to be paid in reais: %.2f", CurrencyConverter.dollarConversion(CurrencyConverter.dollarQuantity));
    }
}
