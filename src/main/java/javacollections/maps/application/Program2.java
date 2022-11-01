package javacollections.maps.application;

import javacollections.maps.entities.Customer;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Program2 {
    public static void main(String[] args) {


    Map<String,String> hasMap = new HashMap<>();
    hasMap.put("123","abc");
        System.out.println(hasMap);

    Map<String, Customer> customerMap = new HashMap<>();
    customerMap.put("123", new Customer("123","Pamela"));
        System.out.println(customerMap);

    Map map = new HashMap();
    map.put(123,"String");
    map.put("123",789);

        System.out.println(map);

        System.out.println("------------------------------------------------");

    Map<String, String> hasSet = new TreeMap<>();

    Map<String, String> hastable = new Hashtable<>();

    Map<String, String> concurrentmap = new ConcurrentHashMap<>();

    SortedMap sortedMap = new TreeMap();


    }

}
