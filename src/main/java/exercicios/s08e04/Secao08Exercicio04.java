package exercicios.s08e04;

import java.util.Locale;
import java.util.Scanner;

public class Secao08Exercicio04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double dollar;
        System.out.print("What is the dollar price? ");
        dollar = scanner.nextDouble();

        double quantity;
        System.out.print("How many dollars will be bought? ");
        quantity = scanner.nextDouble();

        double amount = CurrencyConverter.calculateAmount(dollar, quantity);
        // aqui, vou chamar o método estático calculateAmount da
        // classe CurrencyConverter para retornar o valor lido e calcular a conversão + IOF de 6%

        System.out.printf("Amount to be paid in reais adding 6%% IOF = R$ %.2f%n", amount);

        scanner.close();

    }

}
