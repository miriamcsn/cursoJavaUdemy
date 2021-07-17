package exercicios.s13e03.application;

import exercicios.s13e03.entities.Client;
import exercicios.s13e03.entities.Order;
import exercicios.s13e03.entities.OrderItem;
import exercicios.s13e03.entities.Product;
import exercicios.s13e03.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Secao13ExercicioFixacao03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter client data:");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        System.out.print("Birth date: ");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine(), formatter);

        Client client = new Client(name, email, birthDate);


        System.out.println("Enter order data:");

        System.out.print("Status: ");
        String status = scanner.nextLine();
        OrderStatus os = OrderStatus.valueOf(status);

        LocalDateTime moment = LocalDateTime.now();
        moment.format(formatter2);

        Order order = new Order(moment, os, client);


        System.out.print("How many items to this order: ");

        Integer items = scanner.nextInt();

        for (int i=1; i <= items; i++) {
            scanner.nextLine();

            System.out.printf("Enter #%d item data:%n", i);

            System.out.print("Product name: ");
            String prodName = scanner.nextLine();

            System.out.print("Product price: ");
            Double prodPrice = scanner.nextDouble();

            Product product = new Product(prodName, prodPrice);

            System.out.print("Quantity: ");
            Integer prodQuantity = scanner.nextInt();

            OrderItem orderItem = new OrderItem(product, prodQuantity, prodPrice);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println(order);

        scanner.close();
    }

}
