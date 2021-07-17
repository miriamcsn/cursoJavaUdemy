package exercicios.s13e03.entities;

import exercicios.s13e03.entities.enums.OrderStatus;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> orderItems = new ArrayList<>();


    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem orderItem) {
        orderItems.add(orderItem);
    }

    public void removeItem(OrderItem orderItem) {
        orderItems.remove(orderItem);
    }

    public Double total() {
        Double sum = 0.0;
        for (OrderItem o : orderItems) {
            sum += o.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        sb.append("ORDER SUMMARY: \n")
                .append("Order moment: ")
                .append(moment.format(formatter))
                .append("\nOrder status: ")
                .append(status)
                .append("\nClient: ")
                .append(client)
                .append("\nOrder items:\n");

        for (OrderItem o : orderItems) {
            sb.append(o).append("\n");
        }

        sb.append("Total price: $")
                .append(String.format("%.2f", total()));
        return sb.toString();
    }
}
