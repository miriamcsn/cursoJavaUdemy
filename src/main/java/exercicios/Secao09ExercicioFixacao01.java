package exercicios;

import exercicios.util.BankAccount;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Secao09ExercicioFixacao01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        BankAccount bankAccount;

        System.out.print("Enter account number: ");
        int number = scanner.nextInt();

        System.out.print("Enter account holder: ");
        scanner.nextLine();
        String holder = scanner.nextLine();

        System.out.print("Is there an initial deposit? (y/n): ");
        char option = scanner.next().charAt(0);

        double initialDeposit = 0.0;
        if (option == 'y') {

            do {
                System.out.print("Enter initial deposit value: ");
                initialDeposit = readDouble(scanner);
            } while (initialDeposit < 0);

            bankAccount = new BankAccount(number, holder, initialDeposit);
        }
        else {
            bankAccount = new BankAccount(number, holder);
        }

        System.out.printf("Account Data:%n%s%n", bankAccount);

        System.out.print("Enter a deposit value: ");
        double newDeposit = readDouble(scanner);

        bankAccount.deposit(newDeposit);

        System.out.printf("Updated Account Data:%n%s%n", bankAccount);

        System.out.print("Enter a withdraw value: ");
        double newWithdraw = readDouble(scanner);

        bankAccount.withdraw(newWithdraw);

        System.out.printf("Updated Account Data:%n%s%n", bankAccount);

        scanner.close();
    }

    public static double readDouble(Scanner sc) {

        double d = 0d;

        while (d == 0d) {

            try {
                d = sc.nextDouble();
            }
            catch (InputMismatchException ex) {
                System.out.println("Invalid numeric value. Type again...");
                System.out.print("Enter initial deposit value: ");
                sc.nextLine();
            }
        }
        return d;
    }
}
