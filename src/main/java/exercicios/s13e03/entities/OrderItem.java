package exercicios.s13e03.entities;

public class OrderItem {

    private Product product;
    private Double price;
    private Integer quantity;


    public OrderItem() {
    }

    public OrderItem(Integer quantity, Product product, Double price) {
        this.quantity = quantity;
        this.product = product;
        this.price = price;
    }

    public Double subTotal() {
        return quantity * product.getPrice();
    }
}
