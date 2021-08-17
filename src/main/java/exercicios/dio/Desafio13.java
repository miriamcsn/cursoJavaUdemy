package exercicios.dio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Desafio13 {


//    class Result {


    public static void main(String[] args) {

        /*


         * Complete the 'oddNumbers' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts following parameters:
         *  1. INTEGER l
         *  2. INTEGER r
         */


        Scanner sc = new Scanner(System.in);

        int numero1, numero2;

        numero1 = sc.nextInt();
        numero2 = sc.nextInt();

        oddNumbers(numero1, numero2);

        sc.close();

    }

    public static List<Integer> oddNumbers(int l, int r) {

        int[] arr = IntStream.rangeClosed(l, r).toArray();
        List<Integer> result = new ArrayList<>();

        for (int i : arr
        ) {
            if (i % 2 == 1) {
                result.add(i);
            }
        }
        return result;
    }
}

//}