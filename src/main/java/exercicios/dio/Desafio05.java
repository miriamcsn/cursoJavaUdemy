package exercicios.dio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Desafio05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int valor1 = readInteger(leitor);
        int valor2 = readInteger(leitor);
        double valor3 = readDouble(leitor);

        double salary = valor2 * valor3; // Altere o valor da variável com o cálculo esperado

        System.out.println("NUMBER = " + valor1);
        System.out.printf("SALARY = U$ %.2f", salary);
    }

    public static Integer readInteger(Scanner sc) {
        Integer d = null;
        while (d == null) {
            try {
                System.out.print("Type an Integer value: ");
                d = sc.nextInt();
            }
            catch (InputMismatchException ex) {
                System.out.println("Invalid Integer value. Type again.");
                sc.next();
            }
        }
        return d;
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
