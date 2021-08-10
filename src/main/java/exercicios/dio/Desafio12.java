package exercicios.dio;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Desafio12 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

//        System.out.println("Digite o número de repetições: ");
        int vezes = leitor.nextInt();
        leitor.nextLine();

        for (int contador = 1; contador <= vezes; contador++) {

//            System.out.println("Digite as duas strings separadas por espaço: ");

            StringTokenizer st = new StringTokenizer(leitor.nextLine());
            String leitura1 = st.nextToken();
//            System.out.println(leitura1);
            String leitura2 = st.nextToken();
//            System.out.println(leitura2);

            char[] vetor1 = new char[leitura1.length()];
            for (int i = 0; i < leitura1.length(); i++) {
                vetor1[i] = leitura1.charAt(i);
            }

            char[] vetor2 = new char[leitura2.length()];
            for (int i = 0; i < leitura2.length(); i++) {
                vetor2[i] = leitura2.charAt(i);
            }

            String resultado = "";

            for (int i = ((vetor1.length - vetor2.length) + 1); i <= vetor1.length; i++ ) {
//                System.out.println(i);
                resultado += String.valueOf(i);
            }


            if (resultado.equals(leitura2)) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }

//            System.out.println(leitura2);
//            System.out.println(resultado);

        }
    }
}