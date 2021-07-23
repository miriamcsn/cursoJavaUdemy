package exercicios.s18e01.entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate dueDate;
    private Double finalAmount;

    public Installment(LocalDate dueDate, Double finalAmount) {
        this.dueDate = dueDate;
        this.finalAmount = finalAmount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(Double finalAmount) {
        this.finalAmount = finalAmount;
    }

    @Override
    public String toString() {
        return dueDate.format(formatter) + " - " + finalAmount;
    }
}
