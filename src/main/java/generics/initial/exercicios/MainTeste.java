package generics.initial.exercicios;

import java.util.ArrayList;
import java.util.List;

public class MainTeste {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        String name = list.get(0);
        System.out.println(name);

    }
}
