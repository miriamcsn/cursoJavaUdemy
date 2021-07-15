package teoria;

public class AprendendoForeach {

    public static void main(String[] args) {

        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        int x = 10;
        // double[] vect2 = new double[x];

        // for normal
        for (int i=0; i< vect.length; ++i) {
            System.out.println(vect[i]);
        }

        // foreach ou Enhanced For como diz o IntelliJ
        for (String obj : vect) {
            // Leia-se: "para cada elemento obj do tipo String contido no vetor vect, faça:"
            System.out.println(obj);
        }
    }
}
