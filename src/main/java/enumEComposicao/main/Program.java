package enumEComposicao.main;

import enumEComposicao.entities.Order;
import enumEComposicao.entities.enums.OrderStatus;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        Order order = new Order(1080,new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        //Conversão de String para Enum
        //Instancia o objeo
        OrderStatus os1 = OrderStatus.DELIVERED;
        //Basta passar o valueOf
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

    }
}

