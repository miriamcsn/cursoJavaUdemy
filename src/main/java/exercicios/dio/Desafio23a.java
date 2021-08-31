package exercicios.dio;

public class Desafio23a {

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
        System.out.println(retornaGuicheIngresso(26));
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

        int guiche = 0;
        int pessoasGuicheAtual = 0;
        int pessoasGuicheAnterior = 0;

        for (int i = 1; i <= ingressoNumero; i++) {

            if (i == 1) {
                System.out.println("Guichê 1: 1");
                System.out.print("Guichê 2: ");
                pessoasGuicheAnterior = 1;
                pessoasGuicheAtual = 0;
                guiche = 2;
                continue;
            }

            if (pessoasGuicheAtual == (pessoasGuicheAnterior + 2)) {
                guiche++;
                System.out.println();
                System.out.print("Guichê " + guiche + ": ");
                pessoasGuicheAnterior = pessoasGuicheAtual;
                pessoasGuicheAtual = 0;
            }
            pessoasGuicheAtual++;
            System.out.print(i + " ");
        }
        System.out.println();
        return guiche;
    }
}
