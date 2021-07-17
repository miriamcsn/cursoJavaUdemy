package exercicios.dio;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio04 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

//declare suas variaveis corretamente

        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

//continue a solução

        for (int i=1; i<=5; i++) {

            //System.out.print("Digite o próximo valor: ");
            int number = readInteger(leitor);
            //System.out.printf("Valor digitado: %d", number);


            if (Math.abs(number) % 2 == 0) {
                pares++;
            } else if (Math.abs(number) % 2 == 1) {
                impares++;
            }

            if (number > 0) {
                positivos++;
            } else if (number < 0) {
                negativos++;
            }

            System.out.println();
            System.out.println(i);
        }
//insira suas variaveis corretamente

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");

        leitor.close();
    }

    public static Integer readInteger(Scanner sc) {
        Integer d = null;
        while (d == null) {
            try {
                System.out.print("Type a numeric value: ");
                d = sc.nextInt();
            }
            catch (InputMismatchException ex) {
                System.out.println("Invalid numeric value. Type again.");
                sc.next();
            }
        }
        return d;
    }

}
