package exercicios.dio;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Desafio16 {

    public static void main(String[] args) {

        int velocidade = 340;
        String distancia = "0.35";
        System.out.println(retornaTempoArenaEmMilisegundos(distancia, velocidade));

    }

    public static Integer retornaTempoArenaEmMilisegundos(String distancia,Integer velocidade) {
        double d = Double.parseDouble(distancia);
        d *= 1000.0; // transformando km em metros
        return (int) Math.round((1000.0 * d) / velocidade);
    }
}
