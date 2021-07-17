package teoria;

import teoria.entities.Order;
import teoria.entities.enums.OrderStatus;

import java.util.Date;

public class AprendendoEnum {

    // esse programa se relaciona com a classe Order e o enum OrderStatus

    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        // dá pra instanciar um enum passando uma string, que deve ser escrita
        // exatamente da forma como foi definida no Enum. Se escrever em minúsculo, não funciona.

        System.out.println(os1);
        System.out.println(os2);

    }
}
