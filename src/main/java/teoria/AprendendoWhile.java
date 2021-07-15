package teoria;

import java.util.Locale;
import java.util.Scanner;

public class AprendendoWhile {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }

        System.out.println(soma);
        sc.close();
    }
}
