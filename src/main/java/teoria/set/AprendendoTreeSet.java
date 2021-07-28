package teoria.set;

import java.util.Set;

public class AprendendoTreeSet {

    public static void main(String[] args) {

        Set<String> set = new java.util.TreeSet<>();

        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }
        //Notebook
        //Tablet
        // Tv
//        O TREESET ORDENOU OS ELEMENTOS!



    }
}
