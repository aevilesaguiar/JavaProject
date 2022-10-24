package funcoesStrings.poo.application.programApplication;

import funcoesStrings.poo.application.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProduto {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Enter Product data:");

        System.out.println("Name: ");
        product.name=scanner.nextLine();

        System.out.println("Quantity: ");
        product.quantity=scanner.nextInt();

        System.out.println("Price: ");
        product.price=scanner.nextDouble();

        System.out.println("Product data:"+product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = scanner.nextInt();
        product.addProducts(quantity);

        System.out.println("Update data: "+ product);

        System.out.println();
        System.out.println("Enter the number of products to be removed in stock: ");
        int quantityremove= scanner.nextInt();
        product.removerProducts(quantityremove);

        System.out.println("Update data: "+product);














        scanner.close();
    }
}
