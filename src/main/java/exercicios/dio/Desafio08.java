package exercicios.dio;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Desafio08 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Float n1 = readFloat(sc);
        Float n2 = readFloat(sc);
        Float n3 = readFloat(sc);
        Float n4 = readFloat(sc);

        double avg = (n1 * 0.2) + (n2 * 0.3) + (n3 * 0.4) + (n4 * 0.1);

        System.out.printf("Media: %.1f\n", avg);

        if (avg >= 7) {
            System.out.printf("Aluno aprovado.%n");
        }
        else if (avg < 5.0) {
            System.out.printf("Aluno reprovado.%n");
        }
        else if (avg >= 5 && avg <= 6.9) {
            System.out.printf("Aluno em exame.%n");

            Float emExame = readFloat(sc);
            System.out.printf("Nota do exame: %.1f%n", emExame);

            double newAvg = (avg + emExame) / 2;

            if (newAvg >= 5) {
                System.out.printf("Aluno aprovado.%n");
            } else {
                System.out.printf("Aluno reprovado%n");
            }
            System.out.printf("Media final: %.1f%n", newAvg);
        }
        sc.close();
    }

    public static Float readFloat(Scanner sc) {
        Float f = null;
        while (f == null || f < 0 || f > 10) {
            try {
                f = sc.nextFloat();
            }
            catch (InputMismatchException ex) {
                sc.next();
            }
        }
        return f;
    }
}
