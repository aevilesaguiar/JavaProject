package lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Flavio");
        list.add("Aninha");
        list.add("Inez");
        list.add("Gabriel");
        list.add("MUMZUM");
        list.add("Orto");

        for (String nomes:list
             ) {
            System.out.println(nomes);
        }

        //adicionar em uma determinada posição
        list.add(2,"Antonio");
        list.add(3,"Maria");

        System.out.println("Quantidade Elementos:"+list.size());

        //remover elemento
        list.remove(2);
        System.out.println("------------------");
        System.out.println("Quantidade Elementos:"+list.size());
        for (String nomes:list
        ) {
            System.out.println(nomes);
        }
        //list.remove("lux");
        System.out.println("------------------");
        //remover a partir de um predicado
        list.removeIf(x->x.charAt(0)=='M');

        for (String nomes:list
        ) {
            System.out.println(nomes);
        }

        System.out.println("------------------");

        //buscar a posição de um elemento
        System.out.println("Index of Orto: "+list.indexOf("Orto"));
        //quando o index of não encontra o elemento e devolve -1
        System.out.println("Index of Bob: "+list.indexOf("Bob"));

        System.out.println("------------------");
        for (String nomes:list
        ) {
            System.out.println(nomes);
        }
        System.out.println("------------------");
        //filtrar minha lista com aqueles que começam com um determinado caracter
        //eu declaro uma nova lista , pego a minha list converto ela para stream(tipo stream é um tipo especial do java 8 que aceita operações
        //com expressões lambdas, a aprtir dessa stream em chamo a função filter() que recebe um predicado, esse filter() vai me devolver um stream
        //filtrado conforme o predicado que inclui no filter(), só que stream () não é compatível com List, eu vou ter que pegar esse stream e convertê-lo
        //para lista eu chamo a função collect() e dentro dele eu coloco Collectors.toList(), essa foi a forma que o java 8 arrumou para
        //manter a compatibilidade com o List que é o tipo antigo e permitir que eu possa fazer operações de lambda com o tipo list
        //primeiro eu converto para stream faça a operação que eu quero e depois eu volto para lista
        List<String> result = list.stream().filter(x->x.charAt(0)=='A').collect(Collectors.toList());


        for (String nomes:result
        ) {
            System.out.println(nomes);
        }
        System.out.println("------------------");
        //findFirst() pega o primeiro elemento dessa stream .filter(x->x.charAt(0)=='A') se esse elemento não existir ele retorna nulo.
        String name = list.stream().filter(x->x.charAt(0)=='A').findFirst().orElse(null);

        System.out.println(name);
        String name1 = list.stream().filter(x->x.charAt(0)=='J').findFirst().orElse(null);
        System.out.println(name1);

/*        System.out.println("-------------------------------");

        List<String> nomes = Arrays.asList("José", "Maria", "Anna", "Joao");

        for (String listando: nomes
             ) {
            System.out.println(listando);
        }
*/

    }
}
