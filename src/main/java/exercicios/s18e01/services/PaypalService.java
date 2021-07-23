package exercicios.s18e01.services;

public class PaypalService implements OnlinePaymentService {

    public static final double PAYMENT_FEE = 0.02;
    public static final double MONTHLY_INTEREST = 0.01;

    @Override
    public Double interest(Double amount, Integer months) {

        // Juros simples = Quantia x taxa de juros x tempo
        return amount * months * MONTHLY_INTEREST;
    }

    @Override
    public Double paymentFee(Double amount) {
        return amount * PAYMENT_FEE;
    }
}
