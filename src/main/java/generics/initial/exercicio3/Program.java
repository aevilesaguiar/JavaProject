package generics.initial.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Object> myObjs = new ArrayList<>();
        List<Integer> myNumbers = new ArrayList<Integer>();
       // myObjs = myNumbers; // erro de compilação

        //list integer não é igual a List object
        //list Integer não é subtipo de listObject
        //ou seja não é possivel fazer upcast

        //Upcasting é fazer um objeto se passar por um objeto que seja um supertipo dele.
        //Downcasting é quando o objeto se passa como se fosse um subtipo dele.


        Object obj;
        Integer x =10;
        obj=x;
        System.out.println(x);

        //Integer é um Object, só que lista de Integer  não é lista de Object

    }
}
