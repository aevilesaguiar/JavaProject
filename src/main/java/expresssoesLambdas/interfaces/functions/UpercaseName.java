package expresssoesLambdas.interfaces.functions;

import java.util.function.Function;

public class UpercaseName implements Function<Product, String> {

    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
