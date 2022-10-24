package funcoesStrings.poo.application.programApplication;

import funcoesStrings.poo.application.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProduto2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Product data:");

        System.out.println("Name: ");

        String name=scanner.nextLine();

        System.out.println("Quantity: ");
        Integer quantity=scanner.nextInt();

        System.out.println("Price: ");
        Double price=scanner.nextDouble();
        Product product = new Product(name,price,quantity);
        product.setName("Computer");

        product.setName("Monitor");
        System.out.println(product.getName());

        product.setPrice(156.00);
        product.setQuantity(2);

        System.out.println(product);









        scanner.close();
    }
}
