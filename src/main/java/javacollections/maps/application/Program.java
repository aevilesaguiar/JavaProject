package javacollections.maps.application;


import javacollections.maps.entities.Customer;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        Map<String, Customer> map = new HashMap<>();

        Customer c1 = new Customer("123","Diana Anderson");
        Customer c2 = new Customer("546","John Anderson");

        //coloca dentro do map
        map.put(c1.getCustomerId(),c1);
        map.put(c2.getCustomerId(),c2);

        System.out.println(map);





    }
}
