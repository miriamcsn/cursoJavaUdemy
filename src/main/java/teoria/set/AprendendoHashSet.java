package teoria.set;

import java.util.HashSet;
import java.util.Set;

public class AprendendoHashSet {

    public static void main(String[] args) {

        Set<String> set = new java.util.HashSet<>();
        // hashsets nao garantem a ordem.
        // sao rapidos, mas nao garantem a ordem dos elementos adicionados
        // se no seu problema a ordem dos elementos nao importar, o hashset é o mais indicado.

        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }
        //Tv
        //Notebook
        //Tablet
        // NÃO ORDENA OS ELEMENTOS!


    }
}
