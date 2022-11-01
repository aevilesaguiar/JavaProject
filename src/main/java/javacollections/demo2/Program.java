package javacollections.demo2;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //union (conjunto c com o b)
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //intersection(elementos em comum entre a e b)
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //diference (os elementos que não existem no b)
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
