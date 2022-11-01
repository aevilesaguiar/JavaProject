package javacollections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExemploList {
    public static void main(String[] args) {
        //não se usa geralmente array no dia a dia
        String [] listaNomes = new String[3];
        listaNomes[0]="José";
        listaNomes[1]="Maria";
        System.out.println(listaNomes.toString());

        //criar lista
        List<Object> nomes = new ArrayList<>();
        nomes.add("Aeviles");
        nomes.add("Ana");
        nomes.add("Flavio");
        nomes.add("Bruna");

        System.out.println(nomes);
        nomes.remove(3);

        System.out.println(nomes);
        nomes.remove("Ana");
        System.out.println(nomes.size());

        System.out.println(nomes.isEmpty());
        System.out.println(nomes.size()>0); // não é indicado usar e pedirá para usar isEmpty

        System.out.println(nomes.contains("Aeviles"));

       // Transformae uma lista num array

        //System.out.println(Arrays.stream(listaNomes).toArray());

        Empresa e1 = new Empresa("Ana ltda", "12345689000105");
        Empresa e2 = new Empresa("Joao Eirelle", "99945689000105");
        Empresa e3 = new Empresa("Pedro Eirelle", "99945689220105");

        List<Empresa> list= new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);

        Map<String, Empresa> map = new HashMap<>();
        map.put(e1.getCnpj(), e1);
        map.put(e2.getCnpj(), e2);
        map.put(e3.getCnpj(), e3);


        for(Empresa e:list){
            System.out.println(map.put(e.getCnpj(),e));

        }

        System.out.println("-------------------------------------");

        map=list.stream()
                .collect(Collectors.toMap(Empresa::getCnpj, Function.identity()));//identity retorna o próprio item


        System.out.println(map);

    }
}
