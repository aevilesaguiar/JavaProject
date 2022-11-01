package generics.initial.exercicios.entities;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceGenerics<T> {

    //armazenar uma lista
    private List<T> list = new ArrayList<>();

    public void addValue(T value){
        list.add(value);
    }

    public T first(){
        //se a lista estiver vazia
        if(list.isEmpty()){
            throw new IllegalArgumentException("List is Empty");
        }
        return list.get(0); //senão retorno o primeiro elemento da lista
    }

    public void print(){
        System.out.println("[");
        //se a lista não for vazia
        if(!list.isEmpty()){
            System.out.println(list.get(0));
        }
//a apartir do elemento1 imprimo com uma virgula
        for (int i = 1; i <list.size() ; i++) {
            System.out.println(", "+list.get(i));
        }
        System.out.println("]");

    }

}
