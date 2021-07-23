package teoria.generics;

import teoria.generics.services.PrintService;
import java.util.Scanner;

public class AprendendoGenerics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();
        // PrintService é generics, mas aqui no programa principal
        // tenho que instanciar a lista informando qual
        // tipo de dado a lista vai conter.
        // Isso porque o Java precisa ser type-safe.

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = ps.first();
        System.out.println("First: " + x);

        sc.close();
    }
}
