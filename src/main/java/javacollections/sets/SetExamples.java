package javacollections.sets;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {

        //Hashset implementação de set
        Set<String> set = new HashSet<>();

        System.out.println("-------------------------");
        Boolean added = set.add("Hello");
        Boolean added2 = set.add("Hello");

        //Unique elements
        System.out.println(added);
        System.out.println(added2);

        System.out.println("-------------------------");
        //etorna um conjunto não modificável contendo dois elementos.
        Set <String> set2 = Set.of("Hello","World");

        System.out.println(set2);

        //set2.add("Maria");

        System.out.println(set2);


        System.out.println("-------------------------");

        set.add("HashSet 1");
        set.add("HashSet 2");
        set.add("HashSet 2");
        set.add("HashSet 4");

        System.out.println(set);
        System.out.println("-------------------------");
        Iterator<String> iterator= set.iterator();
        //percorrer Set em java
        while (iterator.hasNext()){
            String iterar = iterator.next();
            System.out.println(iterar);
        }
        System.out.println("-------------------------");

        for(String iterar: set){
            System.out.println(iterar);
        }



    }
}
