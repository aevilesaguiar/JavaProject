package expresssoesLambdas.interfaces.Predicates.application;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {
    @Override
    public void accept(Product product) {
        //pego o product.serPrice e altero o preço que eu já tinha e multico por 1,10
        product.setPrice(product.getPrice()*1.1);
    }
}
