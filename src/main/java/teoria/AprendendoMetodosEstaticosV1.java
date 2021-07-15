package teoria;

import java.util.Locale;
import java.util.Scanner;

public class AprendendoMetodosEstaticosV1 {

    public static final double PI = 3.14159;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);

        /*
        * É importante notar que quando eu chamo um método declarado no meu programa principal
        * e ele NÃO é estático (circumference, volume), o programa não funciona, pois não posso chamar
        * métodos que não sejam estáticos na mesma classe dentro de um outro método que seja estático.
        *
        * Então circumference and volume precisam ser estáticos para essa versão rodar.
        * */

        double v = volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);

        sc.close();
    }

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * Math.pow(radius, 3.0) / 3.0;
    }


}
