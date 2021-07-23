package exercicios.s18e01.services;

import exercicios.s18e01.entities.Contract;
import exercicios.s18e01.entities.Installment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContractService {

    // gera as parcelas, que sao objetos do tipo installment

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }


    public OnlinePaymentService getOnlinePaymentService() {
        return onlinePaymentService;
    }

    public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }


    public void processContract(Contract contract, Integer months) {

        Double basicQuota = contract.getAmount() / months; // valor-base de cada parcela

        for (int i=1; i<=months; i++) {
            double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
            double finalQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
            LocalDate dueDate = addMonths(contract.getDate(), i);
            contract.getInstallments().add(new Installment(dueDate, finalQuota));
        }
    }

    public LocalDate addMonths(LocalDate date, Integer number) {
        LocalDate newDate;
        return newDate = date.plusMonths(number);
    }

}
