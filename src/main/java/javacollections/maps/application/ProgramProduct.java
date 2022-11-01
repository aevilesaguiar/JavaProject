package javacollections.maps.application;


import javacollections.maps.entities.Customer;
import javacollections.maps.entities.Product;

import java.util.HashMap;
import java.util.Map;

public class ProgramProduct {
    public static void main(String[] args) {

        //Para que um Map possa comparar um elemento de chave ele usa equals e hash code

        //produto e quanto tem o valor de estoque
        //por isso criei Produto como chave e Double =Valor
        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        stock.put(p1,1000.00);
        stock.put(p2,1200.00);
        stock.put(p3,15000.00);

        Product ps = new Product("Tv",900.00);
        System.out.println("Contais 'ps' key: "+stock.containsKey(ps));

        Product ps2 = new Product("TV",900.00);

        System.out.println("Contais 'ps2' key: "+stock.containsKey(ps2));









    }
}
