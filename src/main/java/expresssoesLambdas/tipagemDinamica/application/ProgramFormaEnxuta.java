package expresssoesLambdas.tipagemDinamica.application;



import expresssoesLambdas.tipagemDinamica.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProgramFormaEnxuta {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));


        //o proprio compilador inferiu os tipos das variáveis p1 e p2
        list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));

        list.forEach(System.out::println);
    }
}
