package exercicios.s09e02.application;

import exercicios.s09e02.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class AdicionarRemoverProdutos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data:");

        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println();

        System.out.println("Product data: " + product);
/*
        OBS: quando a gente coloca o objeto sozinho (product),
        o compilador já saca que vc está num contexto de println e chama
        automaticamente o método toString(), que fica implícito.
        então a linha acima é igual a fazer product.toString()   =)
*/

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();

        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();

        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
