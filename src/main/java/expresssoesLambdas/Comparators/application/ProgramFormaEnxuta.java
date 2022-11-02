package expresssoesLambdas.Comparators.application;



import expresssoesLambdas.Comparators.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProgramFormaEnxuta {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        
        //com expressões lambdas: chamada de função anônima ou arrow function
/*
Posso fazer assim:
        Comparator<Product> productComparator= (p1,p2)-> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        Assim:
             Comparator<Product> productComparator= (p1,p2)-> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        list.sort(productComparator);

        ou
*/
        list.sort((p1,p2)-> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));



        for (Product p : list) {
            System.out.println(p);
        }
    }
}
