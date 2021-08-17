package exercicios.dio;

import java.util.*;
import java.util.stream.IntStream;

public class Desafio23 {

    /*
     * Um festival de rock numa cidade com pessoas metódicas,
     *  teve a seguinte disposição de pessoas nos guichês para compra de ingressos:

     * Guichê 1 -> 1
     * Guichê 2 -> 2 3 4
     * Guichê 3 -> 5 6 7 8 9
     * Guichê 4 -> 10 11 12 13 14 15 16
     * Guichê 5 -> 17 18 19 20 21 22 23 24 25

     * Guichê N -> (...) X (...)

     * Observe que na primeira linha foi escrito o número 1 e nas seguintes
     * há dois números a mais do que na linha anterior.
     * É preciso identificar o guichê (N) onde a pessoa numero X comprou o ingresso.
     * desenvolva uma função que gere este valor.
     *
     * */

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            int[] arr = IntStream.rangeClosed(i, i + 2).toArray();
//
//            for (int a : arr) {
//                System.out.print(a);
//            }
//        }

//        System.out.println(retornaGuicheIngresso(26));
        }

//    public static Integer retornaGuicheIngresso(Integer ingressoNumero) {
//        return 0;
//    }

    }
}