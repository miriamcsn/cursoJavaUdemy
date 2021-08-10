package exercicios.dio;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Desafio11 {

    /*
    Paulinho tem nas suas mãos um novo problema.
    Agora a sua professora pediu-lhe que construísse um programa para verificar,
    a partir de dois valores muito grandes A e B, se B corresponde aos últimos dígitos de A.

    Entrada
    A entrada consiste de vários casos de teste.
    A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste.
    Cada caso de teste consiste de dois valores A e B maiores que zero, cada um deles podendo ter até 1000 dígitos.

    Saída
    Para cada caso de entrada imprima uma mensagem indicando se o segundo valor encaixa no primeiro valor,
    conforme exemplo abaixo.

    Exemplo de Entrada

    4

    56234523485723854755454545478690 78690 — encaixa
    5434554 543 — não encaixa
    1243 1243 — encaixa
    54 64545454545454545454545454545454554 — não encaixa (???????????? esse devia encaixar, DIO!)

    */

    public static void main(String[] args) {

        String leitura1, leitura2;
        double numero1, numero2;
        char[] vetor1, vetor2;

        Scanner leitor = new Scanner(System.in);

//        System.out.println("Digite o número de repetições: ");
        int vezes = leitor.nextInt();
        leitor.nextLine();

        for (int contador = 1; contador <= vezes; contador++) {

            do {
//                System.out.println("Digite as duas strings separadas por espaço: ");
                StringTokenizer st = new StringTokenizer(leitor.nextLine());
                leitura1 = st.nextToken();
                leitura2 = st.nextToken();
                vetor1 = new char[leitura1.length()];
                vetor2 = new char[leitura2.length()];
                numero1 = Double.parseDouble(leitura1);
                numero2 = Double.parseDouble(leitura2);

            } while (numero1 <= 0D || numero2 <= 0D || vetor1.length > 1000 || vetor2.length > 1000);

            for (int i = 0; i < leitura1.length(); i++) {
                vetor1[i] = leitura1.charAt(i);
            }

            for (int i = 0; i < leitura2.length(); i++) {
                vetor2[i] = leitura2.charAt(i);
            }

            String resultado = "";

            if (numero1 == numero2) {
                System.out.println("encaixa");
            } else if (vetor1.length > vetor2.length) {

                for (int i = ((vetor1.length - vetor2.length)); i < vetor1.length; i++) {
                    resultado += String.valueOf(vetor1[i]);
                }

                if (resultado.equals(leitura2)) {
                    System.out.println("encaixa");
                }
                else {
                    System.out.println("nao encaixa");
                }
            } else {
                System.out.println("nao encaixa");
            }
        }
    }
}

// não rodou, deu NoSuchElementException.... porem nao consigo identificar aonde pq
// colocaram na plataforma 1000 testes pra rodar e eu não sei identificar ainda em qual tá estourando a exceção

// solução alternativa que usei pra rodar:

//    Scanner leitor = new Scanner(System.in);
//    int N = leitor.nextInt();
//    for (int i = 0; i < N; i++) {
//        String A = leitor.next();
//        String B = leitor.next();
//
//        if (A.endsWith(B)) {
//        System.out.println("encaixa");
//        }
//        else {
//        System.out.println("nao encaixa");
//        }
//        }