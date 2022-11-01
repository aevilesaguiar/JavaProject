package javacollections;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {

        Empresa e1 = new Empresa("Ana ltda", "12345689000105");
        Empresa e2 = new Empresa("Joao Eirelle", "99945689000105");
        Empresa e3 = new Empresa("Pedro Eirelle", "99945689220105");

        Map<String, Empresa> map = new HashMap<>();
        map.put(e1.getCnpj(), e1);
        map.put(e2.getCnpj(), e2);
        map.put(e3.getCnpj(), e3);

        System.out.println(map);

        System.out.println(map.containsKey("12345689000105"));
        if (map.containsKey("12345689000105")) {
            System.out.println(map.get("12345689000105"));
        } else {
            System.out.println("Chave não existe!");
        }
    }
}
