package teoria.interfaces.solucao01.model.services;

public class BrazilTaxService {

    public double tax(double amount) {
        // aqui, ele usou o tipo primitivo porque está assumindo que toda
        // vez terá um retorno de um valor.
        // nas outras classes, usou a wrapper class p declarar variáveis
        // porque está fazendo uma equivalência já com o banco de dados,
        // onde em alguns momentos podem ter valores nulos para alguns campos.

        if (amount <= 100.0) {
            return amount * 0.2;
        }
        else {
            return amount * 0.15;
        }
    }
}
