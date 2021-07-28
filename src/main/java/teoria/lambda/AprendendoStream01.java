package teoria.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AprendendoStream01 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        // multiplicou cada elemento por 10 e gerou uma nova stream como resultado
        System.out.println(Arrays.toString(st1.toArray())); // toArray é uma expressão TERMINAL

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        // Stream.of pega a lista de elementos passados e converte em uma stream.
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2).limit(10);
        // tem q por o limit(10) pra nao dar loop infinito
        System.out.println(Arrays.toString(st3.toArray()));

        Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
        // fazendo a sequencia de Fibonacci com stream
        // so nao entendi a parte do map...
        System.out.println(Arrays.toString(st4.limit(10).toArray()));


    }
}
