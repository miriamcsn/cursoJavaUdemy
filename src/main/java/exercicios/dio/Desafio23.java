package exercicios.dio;

public class Desafio23 {

    /*
     * Um festival de rock numa cidade com pessoas metódicas,
     * teve a seguinte disposição de pessoas nos guichês para compra de ingressos:

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
        System.out.println(retornaGuicheIngresso(9));
    }

    public static Integer retornaGuicheIngresso(Integer ingressoNumero) {

        if (ingressoNumero == 0) {
            System.out.println("Guichê 0: 0");
            return 0;
        }

        if (ingressoNumero == 1) {
            System.out.println("Guichê 1: 1");
            return 1;
        }

        int guiche = 1;
        int numeroPessoasPorGuiche = 1;
        int numeroPrevisto = 1;
        System.out.print("Guichê 1: 1");

        for (int i = 1; i <= ingressoNumero; i++) {
            while (numeroPessoasPorGuiche != numeroPrevisto) {
                if (ingressoNumero == i) { return guiche; }
                numeroPessoasPorGuiche++;
                i++;
                System.out.print(i + " ");
            }
            if (ingressoNumero == i) { return guiche; }
            i--;
            guiche++;
            numeroPrevisto = numeroPrevisto + 2;
            numeroPessoasPorGuiche = 0;
            System.out.println();
            System.out.print("Guichê " + guiche + ": ");
        }
        System.out.println();
        return guiche;
    }
}
