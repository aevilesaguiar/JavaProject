package generics.initial.setIgualdade;

import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSetTestIgualdade {
    public static void main(String[] args) {

        Set<Product2> set = new TreeSet<>();

        set.add(new Product2("TV", 900.0));
        set.add(new Product2("Notebook", 1200.0));
        set.add(new Product2("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0);

        for (Product2 p: set
             ) {
            System.out.println(p);
        }

    }
}
