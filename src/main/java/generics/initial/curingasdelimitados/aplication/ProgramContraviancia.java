package generics.initial.curingasdelimitados.aplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramContraviancia {
    public static void main(String[] args) {
        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        //declaro uma lista de qualquer tipo super Number, a lista myNums pode ser tanto number quanto Object
        List<? super Number> myNums = myObjs;
        myNums.add(10);
        myNums.add(3.14);
        //Number x = myNums.get(0); // erro de compilacao

        //contraviancia quando vc define um tipo ou qualquer tipo dele
        //get da error - > não posso acessar os elementos da lista
        //put ok

    }
}
