package expresssoesLambdas.interfaces.Predicates.application;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {

        /*
        Fazer um programa que, a partir de uma lista de produtos, aumente o
        preço dos produtos em 10%.
         */
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Mouse", 80.90));

        //atualiza os preços de cada produto da lista, por que foreach vai percorrer a lista, aplicando o Consumer a cada elemento da lista
       // list.forEach(new PriceUpdate());  //Implementação da interface

        //list.forEach(Product::staticPriceUpdate); // Reference method com método estático
       // list.forEach(Product::nonstaticPriceUpdate);//Reference method com método não estático

       // Double factor= 1.10;
     //   Consumer <Product> cons = p->{
     //       p.setPrice(p.getPrice()*factor);
      //  }; //• Expressão lambda declarada

       // list.forEach(cons);

        Double factor= 1.10;
        list.forEach(  p->p.setPrice(p.getPrice()*factor)); //• Expressão lambda inline


        list.forEach(System.out::println);

    }
}
