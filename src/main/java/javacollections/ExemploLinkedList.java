package javacollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {
    public static void main(String[] args) {
        //criar lista
        List<Object> nomes = new ArrayList<>(10);//capacidade inicial
        nomes.add("Aeviles");
        nomes.add("Ana");
        nomes.add("Flavio");
        nomes.add("Bruna");

        //Instanciando uma outra estrutura
        //arrayList e linked list são classes que implementam List, e List é uma interface e isso é chamado de polimorfismo
        //ou seja a variavel pode ser ser de qualquer tipo

        nomes=new LinkedList<>();
        nomes.add("Ana Maria");

        System.out.println(nomes);



    }
}
