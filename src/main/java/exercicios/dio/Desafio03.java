package exercicios.dio;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Desafio03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int positivos = 0;

        for (int i=1; i<=6; i++) {

            double value = readDouble(leitor);

            if (value > 0) {
                positivos++;
            }
            System.out.println(i);
        }
        System.out.printf("%d valores positivos", positivos);
        leitor.close();
    }

    public static Double readDouble(Scanner sc) {
        Double d = null;
        while (d == null) {
            try {
                System.out.print("Type a numeric value: ");
                d = sc.nextDouble();
             }
            catch (InputMismatchException ex) {
                System.out.println("Invalid numeric value. Type again.");
                sc.next();
            }
        }
        return d;
    }
}
