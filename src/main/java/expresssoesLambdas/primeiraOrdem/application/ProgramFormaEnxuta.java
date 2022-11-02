package expresssoesLambdas.primeiraOrdem.application;

import expresssoesLambdas.primeiraOrdem.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProgramFormaEnxuta {
        public static int compareProducts(Product p1, Product p2) {
            return p1.getPrice().compareTo(p2.getPrice());
        }
        public static void main(String[] args) {
            List<Product> list = new ArrayList<>();
            list.add(new Product("TV", 900.00));
            list.add(new Product("Notebook", 1200.00));
            list.add(new Product("Tablet", 450.00));

            //method Reference
            list.sort(ProgramFormaEnxuta::compareProducts);
            list.forEach(System.out::println);
        }
}
