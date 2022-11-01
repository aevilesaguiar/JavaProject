package javacollections.sets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class TreeSet {
    public static void main(String[] args) {


        Set<String> set3 = new java.util.TreeSet<>();
        set3.add("Hello!");
        set3.add("Hi!");
        set3.add("Good bye!");
        set3.add("Good bye!");
        set3.add("1");
        set3.add("2");
        set3.add("3");

        Iterator<String> iterator1=set3.iterator();
        while (iterator1.hasNext()){
            String next = iterator1.next();
            System.out.println(next);
        }

        System.out.println("-------------------------");

        for (String list: set3
             ) {
            System.out.println(list);
        }


        System.out.println("-------------------------");
        Stream <String> stream = set3.stream();
        stream.forEach((element)-> System.out.println(element));

        System.out.println("-------------------------");

        Boolean removed1 = set3.remove("1");
        Boolean removed2= set3.remove("Yes");

        System.out.println(removed1);

        System.out.println(removed2);

        System.out.println("-------------------------");

        System.out.println(set3);
        System.out.println("-------------------------");
        //esvaziar os elementos, quando executo o método clear todos os elementos serão removidos
        set3.clear();
        System.out.println(set3);
        System.out.println("-------------------------");
        set3.addAll(Set.of("1","9","abc"));

        System.out.println(set3);
        System.out.println("-------------------------");
        set3.removeAll(Set.of("1","15","20"));

        System.out.println(set3);


        System.out.println("-------------------------");
        //Retém apenas os elementos neste conjunto que estão contidos na coleção especificada (operação opcional).
        set3.retainAll((Set.of("1","9","abc")));

        System.out.println(set3);


        System.out.println("-------------------------");
       int size = set3.size();

        System.out.println(size);
        System.out.println("-------------------------");
        Boolean isEmpty = set3.isEmpty();
        System.out.println(isEmpty);
        System.out.println("-------------------------");

        boolean contains1 = set3.contains("11");
        boolean contains2 = set3.contains("abc");

        System.out.println(contains1);
        System.out.println(contains2);


        System.out.println("-------------------------");

        List<String> list = new ArrayList<>();
        list.addAll(set3);
        System.out.println(list);
    }
}
