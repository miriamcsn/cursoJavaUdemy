package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AdicionarRemoverProdutosV2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ProductV2 product = new ProductV2();
        System.out.println("Enter product data:");

        System.out.print("Name: ");
        product.setName(sc.nextLine());

        System.out.print("Price: ");
        product.setPrice(sc.nextDouble());

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
