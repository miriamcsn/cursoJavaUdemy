package teoria;

import java.util.Scanner;

public class AprendendoSwitchDoWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor de 1 a 7 ou Digite 0 para sair: ");

        int x = sc.nextInt();

        String dia = "";

        do {
            switch (x) {
                case 1: dia = "domingo"; break;

                case 2:	dia = "segunda"; break;

                case 3:	dia = "terca"; break;

                case 4:	dia = "quarta"; break;

                case 5:	dia = "quinta";	break;

                case 6:	dia = "sexta"; break;

                case 7:	dia = "sabado"; break;

                default: dia = "valor invalido"; break;
            }

            System.out.println("Dia da semana: " + dia);
            x = sc.nextInt();

        } while (x != 0);

        sc.close();
    }
}
