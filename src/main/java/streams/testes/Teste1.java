package streams.testes;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Teste1 {

    public static void main(String[] args) throws IOException {

        //Criação de uma stream a partir de um List.
        List<String> items = new ArrayList<>();
        items.add("um");
        items.add("dois");
        items.add("tres");

        Stream<String> stream = items.stream();

        System.out.println(stream.collect(Collectors.toList()));

      //  Criação de Stream a partir de um Map
        Map<String,String> map = new HashMap<>();
        map.put("key1","abacate");
        map.put("key2","melancia");
        map.put("key3","manga");
        Stream<String> stream1 = map.values().stream();

        System.out.println(stream1.collect(Collectors.toList()));

        //Para obter uma stream a partir de valores ou arrays é muito simples: basta chamar os métodos estáticos Stream.of() ou Arrays.stream(), como mostra o código a seguir:

        Stream<Integer> numbersForValues =Stream.of(1,2,3,4,5,6);
        System.out.println(numbersForValues.collect(Collectors.toList()));

        IntStream numbersFromArray = Arrays.stream(new int[]{1,2,3,4,5,6,7,8,9,10});

        //Por sua vez, para criar uma stream de linhas a partir do conteúdo de um arquivo texto (I/O), podemos chamar o método estático Files.lines(Path path).
        // No código a seguir, por exemplo, é possível descobrir a quantidade de linhas que um arquivo possui:

        Stream <String> lines= Files.lines(Paths.get("C:\\TEMP\\names.txt"),
                Charset.defaultCharset());
        long numbersLines = lines.count();
        System.out.println(numbersLines);




    }
}
