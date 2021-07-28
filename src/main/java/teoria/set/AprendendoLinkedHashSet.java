package teoria.set;

import java.util.Set;

public class AprendendoLinkedHashSet {

    public static void main(String[] args) {

        Set<String> set = new java.util.LinkedHashSet<>();

        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
//            System.out.println("1");
            System.out.println(p);
        }
        //Notebook
        //Tablet
        // Tv
//        O LinkedHashSet manteve a ordem que os elementos foram inseridos!

        // outras operaçoes com sets (valem para os outros tb)

        System.out.println();
        System.out.println();

        set.remove("Tablet");

        for (String p : set) {
//            System.out.println("2");
            System.out.println(p);
        }


        System.out.println();
        System.out.println();

        set.removeIf(x -> x.length() >= 3);

        for (String p : set) {
//            System.out.println("3");
            System.out.println(p);
        }

        System.out.println();
        System.out.println();

        set.removeIf(x -> x.charAt(0) == 'T');

        for (String p : set) {
//            System.out.println("4");
            System.out.println(p);
        }
    }

}
