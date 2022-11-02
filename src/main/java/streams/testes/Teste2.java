package streams.testes;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Teste2 {
    public static void main(String[] args) {

        //Após conhecer alguns dos diferentes modos para criar e obter streams, vamos focar agora em como processá-las.
        // Para isso, apresentaremos nos próximos tópicos a transformação e o processamento de streams fazendo uso de diferentes
        // operações da interface Stream.

       // Algumas das operações intermediárias mais utilizadas são: filter(), map(), sorted(), limit() e distinct().
        // Portanto, nossos primeiros passos nessa nova API demonstrarão como utilizar essas operações.

        List<Pessoa> pessoas = new Pessoa().populaPessoas();
        Stream<Pessoa> stream = pessoas.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"));
        Stream<Pessoa> idade = pessoas.stream().filter(pessoa ->pessoa.getIdade()<20);

        System.out.println(stream.collect(Collectors.toList()));
        System.out.println(idade.collect(Collectors.toList()));


        //MÉTODO MAP
        IntStream stream1 = pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .mapToInt(Pessoa::getIdade);

        System.out.println(stream1);




    }
}
