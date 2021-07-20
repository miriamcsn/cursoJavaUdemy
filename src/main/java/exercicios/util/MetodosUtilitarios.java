package exercicios.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MetodosUtilitarios {

    public String readString(Scanner sc) {

        String d = null;

        while (d == null) {
            try {
                System.out.print("Type a valid string: ");
                d = sc.nextLine();
            }
            catch (InputMismatchException ex) {
                System.out.print("Invalid numeric value. Type again: ");
                sc.nextLine();
            }
        }
        return d;
    }

    public Double readDouble(Scanner sc) {

        Double d = null;

        while (d == null) {
            try {
                System.out.print("Type a valid double value: ");
                d = sc.nextDouble();
            }
            catch (InputMismatchException ex) {
                System.out.print("Invalid double value. Type again: ");
                sc.nextLine();
            }
        }
        return d;
    }

    public Integer readInteger(Scanner sc) {

        Integer d = null;

        while (d == null) {
            try {
                System.out.print("Type a valid integer value: ");
                d = sc.nextInt();
            }
            catch (InputMismatchException ex) {
                System.out.println("Invalid integer value. Type again.");
                sc.next();
            }
        }
        return d;
    }

    public LocalDate readLocalDate(Scanner sc) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d = null;

        while (d == null) {
            try {
                System.out.print("Type a valid date following the format dd/mm/yyyy: ");
                d = LocalDate.parse(sc.nextLine(), formatter);
            }
            catch (InputMismatchException ex) {
                System.out.println("Invalid date. Type again.");
                sc.next();
            }
        }
        return d;
    }

    public LocalDateTime readLocalDateTime(Scanner sc) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime d = null;

        while (d == null) {
            try {
                System.out.print("Type a valid date and time following the format dd/mm/yyyy hh:mm:ss : ");
                d = LocalDateTime.parse(sc.nextLine(), formatter);
            }
            catch (InputMismatchException ex) {
                System.out.println("Invalid date and time. Type again.");
                sc.next();
            }
        }
        return d;
    }

    public Character readChar(Scanner sc) {

        Character d = null;

        while (d == null) {
            try {
                System.out.print("Type one valid character: ");
                d = sc.nextLine().charAt(0);
            }
            catch (InputMismatchException ex) {
                System.out.print("Invalid character. Type again: ");
                sc.nextLine();
            }
        }
        return d;
    }

}
