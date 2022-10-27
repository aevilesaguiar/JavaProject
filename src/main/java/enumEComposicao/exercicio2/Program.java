package enumEComposicao.exercicio2;

import enumEComposicao.exercicio2.entities.Client;
import enumEComposicao.exercicio2.entities.Order;
import enumEComposicao.exercicio2.entities.OrderItem;
import enumEComposicao.exercicio2.entities.Product;
import enumEComposicao.exercicio2.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        //instaciado o cliente com os dados que o usuario digitar
        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());//valueOf converte o string para o valor correspondente aos valores de OrderStatus

        //instaciado o Order com os dados que o usuario digitar, o new date é o horario atual o Order associado ao cliente
        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int N = sc.nextInt();
        for (int i=1; i<=N; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            //para consumir a quebra de linha eu digitei o sc.nextLine()
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            //instanciao o Produto com os dados digitados
            Product product = new Product(productName, productPrice);

            //instanciao o OrderItem com os dados digitados
            OrderItem it = new OrderItem(quantity, productPrice, product);

            //eu adiciono o item dentro do pedido order
            order.addItem(it);
        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
