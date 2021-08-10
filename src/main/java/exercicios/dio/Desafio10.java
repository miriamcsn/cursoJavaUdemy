package exercicios.dio;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Desafio10 {

    /*
     * Crie um algoritmo que receba dois inputs que sejam strings e combine-as alternando as letras de cada string.
     * Deve começar pela primeira letra da primeira string, seguido pela primeira
     * letra da segunda string, em seguida pela segunda letra da primeira string e continuar
     * dessa forma sucessivamente.
     * As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string resultante e retornada.

     * Entrada
     * A entrada contém vários casos de teste.
     * A primeira linha contém um inteiro N que indica a quantidade de casos de teste que vem a seguir.
     * Cada caso de teste é composto por uma linha que contém duas cadeias de caracteres,
     * cada cadeia de caracteres contém entre 1 e 50 caracteres inclusive.

     * Saída
     * Combine as duas cadeias de caracteres da entrada como mostrado no exemplo abaixo e exiba a cadeia resultante.
     * */

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

//        System.out.println("Digite o número de repetições: ");
        int vezes = leitor.nextInt();
        leitor.nextLine();

        for (int contador = 1; contador <= vezes; contador++) {

//            System.out.println("Digite as duas strings separadas por espaço: ");

            StringTokenizer st = new StringTokenizer(leitor.nextLine());
            String leitura1 = st.nextToken();
            String leitura2 = st.nextToken();

            char[] vetor1 = new char[leitura1.length()];
            for (int i = 0; i < leitura1.length(); i++) {
                vetor1[i] = leitura1.charAt(i);
            }

            char[] vetor2 = new char[leitura2.length()];
            for (int i = 0; i < leitura2.length(); i++) {
                vetor2[i] = leitura2.charAt(i);
            }

            String resultado = "";

            if (vetor1.length > vetor2.length) {
                for (int i = 0; i < vetor2.length; i++) {
                    resultado += String.valueOf(vetor1[i]);
                    resultado += String.valueOf(vetor2[i]);
                }
                for (int i = vetor2.length; i < vetor1.length; i++) {
                    resultado += String.valueOf(vetor1[i]);
                }
            } else {
                for (int i = 0; i < vetor1.length; i++) {
                    resultado += String.valueOf(vetor1[i]);
                    resultado += String.valueOf(vetor2[i]);
                }
                for (int i = vetor1.length; i < vetor2.length; i++) {
                    resultado += String.valueOf(vetor2[i]);
                }
            }
            System.out.println(resultado);
        }
    }
}