package exercicios.s14e02;

import exercicios.s14e02.entities.ImportedProduct;
import exercicios.s14e02.entities.Product;
import exercicios.s14e02.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Secao14Exercicio02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int number = scanner.nextInt();

        for (int i=1; i<=number; i++) {

            scanner.nextLine();
            System.out.printf("Product #%d data:%n", i);
            System.out.print("Common, used or imported (c/u/i)? ");
            char option = scanner.next().charAt(0);

            if (option == 'c') {
                scanner.nextLine();

                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Price: ");
                Double price = scanner.nextDouble();

                Product product = new Product(name, price);
                list.add(product);
            }
            else if (option == 'u') {
                scanner.nextLine();

                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Price: ");
                Double price = scanner.nextDouble();
                System.out.print("Manufacture date: ");
                LocalDate manufactureDate = LocalDate.parse(scanner.next(), formatter);

                Product usedProduct = new UsedProduct(name, price, manufactureDate);
                list.add(usedProduct);
            }
            else if (option == 'i') {
                scanner.nextLine();

                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Price: ");
                Double price = scanner.nextDouble();
                System.out.print("Customs fee: ");
                Double customsFee = scanner.nextDouble();

                Product importedProduct = new ImportedProduct(name, price, customsFee);
                list.add(importedProduct);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product p : list) {
            System.out.print(p.priceTag());
        }

        scanner.close();
    }
}
