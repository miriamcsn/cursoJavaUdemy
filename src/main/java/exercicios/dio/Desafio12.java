package exercicios.dio;

import java.util.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Desafio12 {




//    class Result {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n, k;

            n = sc.nextInt();

            List<Integer> lista = new ArrayList<>();

            for (int i=0; i<n; i++) {
                lista.add(sc.nextInt());
            }

            k = sc.nextInt();
            findNumber(lista, k);

            sc.close();

        }

        /*
         * Complete the 'findNumber' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY arr
         *  2. INTEGER k
         */

        public static String findNumber(List<Integer> arr, int k) {

            if (arr.contains(k)) { return "YES"; }
            else { return "NO"; }

        }

    }
//}