package expresssoesLambdas.interfaces.Predicates.util;

import expresssoesLambdas.interfaces.Predicates.application.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product product) {
        return product.getPrice()>=100.00;
    }
}
