package exercicios.s15e02.application;

import exercicios.s15e01.exceptions.DomainException;
import exercicios.s15e02.entities.Account;
import exercicios.s15e02.exceptions.AmountExceedsLimit;
import exercicios.s15e02.exceptions.NotEnoughBalance;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Secao15Exercicio02 {

    public static void main(String[] args) throws NotEnoughBalance, AmountExceedsLimit {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");

        Integer number = readInteger(sc);

        sc.nextLine();
        String holder = readString(sc);

        System.out.print("Initial balance: ");
        Double balance = readDouble(sc);

        System.out.print("Withdraw limit: ");
        Double withdrawLimit = readDouble(sc);

        Account acc = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        Double withdrawAmount = readDouble(sc);

        try {
            acc.withdraw(withdrawAmount);
            System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
        }
        catch (NotEnoughBalance | AmountExceedsLimit e) {
            System.out.println("Error in method withdraw(): " + e.getMessage());
            System.exit(0);
        }
        sc.close();

    }

    public static String readString(Scanner sc) {

        String d = null;

        while (d == null) {
            try {
                System.out.print("Holder: ");
                d = sc.nextLine();
            }
            catch (InputMismatchException ex) {
                System.out.print("Invalid input. Type again: ");
                sc.nextLine();
            }
            catch (Exception ex) {
                System.out.print("Error in method readString.");
                System.exit(0);
            }
        }
        return d;
    }

    public static Double readDouble(Scanner sc) {

        Double d = null;

        while (d == null) {
            try {
//                System.out.print("Type a valid double value: ");
                d = sc.nextDouble();
            }
            catch (InputMismatchException ex) {
                System.out.print("Invalid double value. Type again: ");
                sc.nextLine();
            }
            catch (Exception ex) {
                System.out.print("Error in method readDouble.");
                System.exit(0);
            }

        }
        return d;
    }

    public static Integer readInteger(Scanner sc) {

        Integer d = null;

        while (d == null) {
            try {
                System.out.print("Number: ");
                d = sc.nextInt();
            }
            catch (InputMismatchException ex) {
                System.out.println("Invalid integer value. Type again.");
                sc.next();
            }
            catch (Exception ex) {
                System.out.print("Error in method readInteger.");
                System.exit(0);
            }

        }
        return d;
    }


}
