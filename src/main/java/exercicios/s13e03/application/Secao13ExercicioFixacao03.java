package exercicios.s13e03.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Secao13ExercicioFixacao03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data:");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        System.out.print("Birth date: ");
        LocalDate birthday = LocalDate.parse(scanner.next(), formatter);

        // instanciar o cliente aqui



        System.out.println("Enter order data:");

        System.out.print("Status: ");
        String status = scanner.nextLine();

        System.out.print("Product name: ");
        String prodName = scanner.nextLine();

        System.out.print("Product price: ");
        Double prodPrice = scanner.nextDouble();

        System.out.print("Quantity: ");
        Integer prodQuantity = scanner.nextInt();



//        System.out.println("ORDER SUMMARY:");






    }

}
