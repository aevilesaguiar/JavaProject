package generics.initial.exercicio3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program1 {
    public static void main(String[] args) {

        //list ? é o supertipo de qualquer tipo de lista
        List<?> myObjs = new ArrayList<>();
        List<Integer> myNumbers = new ArrayList<Integer>();
        myObjs = myNumbers;

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List <String> myStrs = Arrays.asList("Ana", "Maria", "Bob");
        printList(myStrs);

    }

    //impimi qualquer tipo de lista
    public static void printList(List<?> list) {

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
