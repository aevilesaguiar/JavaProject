package expresssoesLambdas.criandofuncoes;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
/*
    public Double filteresSum(List<Produto> list){
        Double sum = 0.0;
        for (Produto p:list
             ) {
            if(p.getName().charAt(0)=='T'){
                sum+=p.getPrice();
            }
        }
        return sum;

    }*/

    public Double filteresSum(List<Produto> list, Predicate<Produto> criteria){
        Double sum = 0.0;
        for (Produto p:list
        ) {
            if(criteria.test(p)){
                sum+=p.getPrice();
            }
        }
        return sum;

    }

}
