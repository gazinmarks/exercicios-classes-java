package exercicio_poo;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        BankAccount bankAccount;

        System.out.print("Enter account number: ");
        int numberAccount = Integer.parseInt(sc.nextLine());
        System.out.print("Enter account holder: ");
        String nameHolder = sc.nextLine();

        System.out.print("Is there a initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bankAccount = new BankAccount(numberAccount, nameHolder, initialDeposit);
        } else {
            bankAccount = new BankAccount(numberAccount, nameHolder);
        }
        System.out.println();

        System.out.print("Account data: \n");
        System.out.printf("%s\n", bankAccount);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        bankAccount.addDeposit(sc.nextDouble());

        System.out.print("Updated account data: \n");
        System.out.printf("%s\n", bankAccount);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        bankAccount.withdrawDeposit(sc.nextDouble());
        System.out.print("Updated account data: \n");
        System.out.printf("%s", bankAccount);

        sc.close();
    }
}
