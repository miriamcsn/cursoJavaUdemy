package teoria.interfaces.solucao02.model.services;

public class BrazilTaxService implements TaxService {

    public double tax(double amount) {
    // ao implementar o método da Interface, está cumprindo com o contrato!

        if (amount <= 100.0) {
            return amount * 0.2;
        }
        else {
            return amount * 0.15;
        }
    }
}
