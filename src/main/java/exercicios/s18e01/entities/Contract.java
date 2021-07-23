package exercicios.s18e01.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Contract {

//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private Integer number;
    private LocalDate date;
    private Double amount;

    private List<Installment> installments = new ArrayList<>();

    public Contract(Integer number, LocalDate date, Double amount) {
        this.number = number;
        this.date = date;
        this.amount = amount;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

/*
    public void setInstallments(List<Installment> installments) {
        this.installments = installments;
    }
NAO PODE DEIXAR ESSE SETTER */

/*
    public void addInstallment(Double amount, LocalDate dueDate) {

    }
*/
}
