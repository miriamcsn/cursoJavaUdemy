package teoria.set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class OperacoesComSets01 {

    public static void main(String[] args) {

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //union
        Set<Integer> c = new TreeSet<>(a);
        // aqui, estou criando um novo conjunto C que será uma cópia do conjunto A
        c.addAll(b);
        System.out.println(c);

        //intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b); // somente os elementos em comum
        System.out.println(d);

        //difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b); // remove do conjunto E todos os elementos de B
        System.out.println(e);

    }
}
