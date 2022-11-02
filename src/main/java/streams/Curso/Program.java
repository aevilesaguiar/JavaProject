package streams.Curso;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,4,5,6,7,10);
        //isso é criar uma stream a partir de uma lista/coleção
        Stream<Integer> st1 = list.stream();
        //para imprimir -> vou usar a operação teminal ToArray que converte uma stream num vetor
        System.out.println(Arrays.toString(st1.toArray()));

        System.out.println("------------com map------------------");
        //usando o map-> map aplica uma função a cada elemento da minha stream
        Stream<Integer> st2 = list.stream()
                .map(x->x*10);
        System.out.println(Arrays.toString(st2.toArray()));

        System.out.println("-------------------------------------");
        // criar um stream através do Stream.of() permite colocar os elementos entre parenteses
        Stream <String> st3 = Stream.of("Maria", " Alex", "Bob");
        System.out.println(Arrays.toString(st3.toArray()));

        System.out.println("------------com função de iteração------------------");
        Stream<Integer> st4 = Stream.iterate(0,x->x+2);//o iterate  você diz quem é o primeiro elemento da minha Stream =0
                                                            //e qual é a função de iteração de geração dos próximos elementos = x->x+2

        //como consumir essa Stream e processar alguns elementos
        System.out.println(Arrays.toString(st4.limit(20).toArray()));

        //sequencia de Fibonnaci
        //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181...
        // Analisada como uma sequência numérica, ela não passa de uma simples organização de numerais que recebem um
        // toque de lógica matemática.
       /* Stream<Long> st5 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));*/

    }
}
