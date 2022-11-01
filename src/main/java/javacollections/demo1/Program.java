package javacollections.demo1;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        //hashset é a implementação mais rápida da interface set, mas ela não garante a ordem
        //desvantagem mantém a ordem, e se não for problema HashSet é o mais indicado
        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println("Existe o elemento notebook no conjunto?");
        System.out.println(set.contains("Notebook"));
        System.out.println("----------------------------------------");

        for (String p:set
             ) {
            System.out.println(p);
        }

        System.out.println("----------------------------------------");
        //O treeSet ordena a lista
        set = new TreeSet<>();
        set.add("Zebra");
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");
        set.add("Urso de Pelucia");
        System.out.println("Existe o elemento notebook no conjunto?");
        System.out.println(set.contains("Notebook"));
        System.out.println("----------------------------------------");

        for (String p:set
        ) {
            System.out.println(p);
        }
        //mantém a ordem em que foi digitado os elementos
        set = new LinkedHashSet<>();
        set.add("Zebra");
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");
        set.add("Urso de Pelucia");
        set.add("Urso de Pelucia");

        set.remove("Zebra");
        //remove através de uma condição
        set.removeIf(x-> x.length()<3);

        System.out.println("----------------------------------------");
        for (String p:set
        ) {
            System.out.println(p);
        }



    }
}
