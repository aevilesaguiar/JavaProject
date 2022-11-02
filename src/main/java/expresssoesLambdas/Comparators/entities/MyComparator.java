package expresssoesLambdas.Comparators.entities;

import java.io.Serializable;
import java.util.Comparator;
public class MyComparator implements Comparator<Product>, Serializable {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}