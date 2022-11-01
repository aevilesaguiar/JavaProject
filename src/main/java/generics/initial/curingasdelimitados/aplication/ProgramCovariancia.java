package generics.initial.curingasdelimitados.aplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramCovariancia {
    public static void main(String[] args) {

        //Vamos fazer um método que copia os elementos de uma lista para uma
        //outra lista que pode ser mais genérica que a primeira.
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myobjs = new ArrayList<>();

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);
        List<? extends Number> list = intList;
        Number x = list.get(0);
       // list.add(20); // erro de compilacao

        //covariancia a operação de get é permitida , mas a operação de put da error.

    }
}
