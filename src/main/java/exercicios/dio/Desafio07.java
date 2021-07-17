package exercicios.dio;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Desafio07 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        final double PI = 3.14159;

        Double raio = readDouble(scan);

        double area;

        //continue a solucao

        area = PI * (Math.pow(raio,2));

        System.out.printf("A=%.4f%n", area);
    }

    public static Double readDouble(Scanner sc) {
        Double d = null;
        while (d == null) {
            try {
                System.out.print("Type a Double value: ");
                d = sc.nextDouble();
            }
            catch (InputMismatchException ex) {
                System.out.println("Invalid Double value. Type again.");
                sc.next();
            }
        }
        return d;
    }
}
