package exercicios.dio;

import java.util.Locale;

public class Desafio19 {

    public static void main(String[] args) {

//        double value = Double.parseDouble(String.format(Locale.US, "%.1f", 0.058823529411765));
//        double value = Double.parseDouble(String.format(Locale.US, "%.1f", 0.023529411764705882));
//        double value = Double.parseDouble(String.format(Locale.US, "%.1f", 0.055882352941176));
//        System.out.println(value);

        System.out.println(retornaSeHaEcoNoEstudio(18));
    }

    public static boolean retornaSeHaEcoNoEstudio(Integer distancia) {
        double tempoDecorrido = Double.parseDouble(String.format(Locale.US, "%.1f", distancia/340.0));
        if (tempoDecorrido >= 0.1) {
            return true;
        } else {
            return false;
        }
    }

//    public static Integer retornaPessoasNaoGostamNenhumPalco(Integer quantidadePessoasEvento) {
//    }
}
