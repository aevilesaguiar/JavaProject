package javacollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {

        Set<String> nomes = new HashSet<>();
        nomes.add("Aeviles");
        nomes.add("Ana");
        nomes.add("Flavio");
        nomes.add("Bruna");
        nomes.add("Bruna");
        nomes.add("Aeviles");
        nomes.add("Ana");
        nomes.add("Flavio");
        nomes.add("Bruna");

        System.out.println(nomes);

        List<Object> nome = new ArrayList<>();
        nome.add("Aeviles");
        nome.add("Ana");
        nome.add("Flavio");
        nome.add("Bruna");
        System.out.println(nome);


        Set<String> nomesUnicos = new HashSet<>(nomes);

        System.out.println(nomesUnicos);

    }
}
