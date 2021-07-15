package teoria;

import teoria.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class AprendendoVetores02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Type the number of products to be read: ");
        int n = scanner.nextInt();  // nesse nextint a quebra de linha ficou pendente

        Product[] vector = new Product[n];  // um vetor do tipo Product
        /*
        * Pelo fato do meu vector ser do tipo Product (que é uma classe q instancia objetos),
        * meu vector terá n posições inicialmente contendo valor null na memória. Essas posições
        * APONTARÃO para os objetos que eu instanciar. Porém, eu tenho que APONTAR esses objetos
        * para as posições do vector para que eles sejam corretamente armazenados.
        * */

        double sum = 0.0;
        for (int i = 0; i < vector.length; i++) {
            scanner.nextLine(); // consumindo a quebra de linha que ficou pendende do nextint anterior

            System.out.printf("Product nº %d: ", i);
            System.out.print("Type the product's name: ");
            String name = scanner.nextLine();

            System.out.print("Type the product's price: ");
            double price = scanner.nextDouble();

            vector[i] = new Product(name, price);

            //System.out.printf("Vector in position %d is %.2f.%n", i, vector[i]);
            sum += vector[i].getPrice();
        }
        double avg = sum / vector.length;
        System.out.printf("The sum of all product's prices typed is %.2f and the average is %.2f.%n", sum, avg);
        scanner.close();
    }
}
