package teoria.interfaces.solucao02.model.entities;

public class Invoice {

    private Double basicPayment;
    private Double tax;

    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }


    public Double getTotalPayment() {
        return getBasicPayment() + getTax();
    }

    @Override
    public String toString() {
        return "INVOICE:" + "\n" +
                "Basic payment: " + basicPayment + "\n" +
                "Tax: " + tax + "\n" +
                "Total payment: " + String.format("%.2f", getTotalPayment()) + "\n"
                ;
    }

}
