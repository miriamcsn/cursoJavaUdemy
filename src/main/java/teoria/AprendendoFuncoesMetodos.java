package teoria;

import java.util.Scanner;

public class AprendendoFuncoesMetodos {

    public static void main(String[] args) {

        /*
         * em java, as funções são chamadas de métodos.
         * o método principal de qualquer classe é o main.
         * sim, esse mesmo, onde estou escrevendo agora :)
         *
         * qualquer outro que eu escreva precisa ter outro nome.
         *
         * nesse programa, vou criar dois métodos.
         * um com retorno de um valor inteiro e outro sem retorno.
         *
         *  */


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três valores inteiros: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = maior(a, b, c);

        exibeResultado(maior);

        sc.close();

    }

    public static int maior(int x, int y, int z) {  // retorna um int

        int maiorNumero;

        if (x>y && x>z)	maiorNumero = x;
        else if (y>z) maiorNumero = y;
        else maiorNumero = z;

        return maiorNumero;

    }

    public static void exibeResultado(int valor) {  // void = função sem retorno

        System.out.println("O maior valor é: " + valor);

    }

}
