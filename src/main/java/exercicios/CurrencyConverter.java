package exercicios;

public class CurrencyConverter {

    // classe criada como parte do Exercício04 da seção 08

    public static final double IOF = 0.06;

    public static double calculateAmount(double dollar, double quantity) {
        return dollar * quantity + ((dollar * quantity) * IOF);
    }

}
