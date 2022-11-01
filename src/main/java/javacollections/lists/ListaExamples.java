package javacollections.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaExamples {
    public static void main(String[] args) {

        List<String> mylist = new ArrayList<>();
        //adicionar elementos a lista
        mylist.add("Object 1");
        mylist.add("Object 2");
        mylist.add("Object 3");
        mylist.add("Object 4");
        mylist.add("Object 5");
        //remove
        mylist.remove(2);

        System.out.println(mylist);

        //acessar o elemento da lista usando o índice deles através do get da interface list
        Object o = mylist.get(0);
        System.out.println(o);

        int tam = mylist.size();
        System.out.println(tam);
        System.out.println("------------------------------------");
        //iteração da lista(iterar acessae o elemento de cada vez , começamdo do primeiro)
        //existem 3 formas
        Iterator<String> iterator = mylist.iterator();
        //ou     Iterator  iterator = mylist.iterator();

       while(iterator.hasNext()){
           String next = iterator.next();
           System.out.println(next);
        }

        System.out.println("------------------------------------");

       for( String list:mylist){

           System.out.println(list);
       }
        System.out.println("------------------------------------");

       for(int i=0; i< mylist.size();i++){
          String next = mylist.get(i);
           System.out.println(next);
       }
        System.out.println("------------------------------------");

        //esvaziar uma lista, quando executo o método clear lotos os elementos da lista serão removidos
         mylist.clear();
        System.out.println(mylist);


    }
}
