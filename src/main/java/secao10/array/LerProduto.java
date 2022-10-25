package secao10.array;


import secao10.array.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class LerProduto {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qtde produtos cadastrar: ");
        Integer qtde = sc.nextInt();

        Product[] vect = new Product[qtde];

        for (int i = 0; i < vect.length ; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();

            vect[i]= new Product(name, price);

        }

        double sum = 0.0;

        for (int i = 0; i < vect.length ; i++) {
            sum+=vect[i].getPrice();

        }

            double avg = sum/ vect.length;

        System.out.printf("Average price = %.2f%n",avg);






        sc.close();

    }
}
