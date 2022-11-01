package javacollections.maps.application;

import javacollections.maps.entities.Customer;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Program3 {
    public static void main(String[] args) {


    Map<String,Integer> map = new HashMap<>();
    map.put("abc", Integer.valueOf(123));
    map.put("abc",789);

    map.put("abc",null);
        System.out.println(map.get("abc"));
        System.out.println(map);

    }

}
