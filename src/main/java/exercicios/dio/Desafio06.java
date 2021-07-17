package exercicios.dio;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio06 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        int notas100 = 0;
        int notas50 = 0;
        int notas20 = 0;
        int notas10 = 0;
        int notas5 = 0;
        int notas2 = 0;
        int notas1 = 0;

        //continue a solucao de acordo com as notas do enunciado

        Integer value, originalValue = 0;

        do {
            System.out.println("Type an integer number between 1 and 999.999: ");
            value = readInteger(leitor);
        } while ((value <= 0) || (value > 999999));

        System.out.printf("Value that will be considered for the calculus: %d", value);

        originalValue = value;

        while (value != 0) {

            if (value >= 100) {
                notas100++;
                value -= 100;
            } else if (value >= 50) {
                notas50++;
                value -= 50;
            } else if (value >= 20) {
                notas20++;
                value -= 20;
            } else if (value >= 10) {
                notas10++;
                value -= 10;
            } else if (value >= 5) {
                notas5++;
                value -= 5;
            } else if (value >= 2) {
                notas2++;
                value -= 2;
            } else if (value >= 1) {
                notas1++;
                value -= 1;
            }
        }

        //continue a solucao de acordo com os exemplos de saída
        System.out.println(originalValue);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 +" nota(s) de R$ 50,00");
        System.out.println(notas20 +" nota(s) de R$ 20,00");
        System.out.println(notas10 +" nota(s) de R$ 10,00");
        System.out.println(notas5 +" nota(s) de R$ 5,00");
        System.out.println(notas2 +" nota(s) de R$ 2,00");
        System.out.println(notas1 +" nota(s) de R$ 1,00");
    }

    public static Integer readInteger(Scanner sc) {
        Integer d = null;
        while (d == null) {
            try {
                System.out.print("Type a valid Integer value: ");
                d = sc.nextInt();
            }
            catch (InputMismatchException ex) {
                System.out.println("Invalid Integer value. Type again.");
                sc.next();
            }
        }
        return d;
    }
}
