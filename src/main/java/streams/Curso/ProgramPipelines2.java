package streams.Curso;

import streams.Curso.entities.Produtos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramPipelines2 {
    public static void main(String[] args) {

        /**
         * Fazer um programa para ler um conjunto de produtos a partir de um
         * arquivo em formato .csv (suponha que exista pelo menos um produto, ou seja supor que a sua lista não será vazia).
         *
         * Em seguida mostrar o preço médio dos produtos. Depois, mostrar os
         * nomes, em ordem decrescente, dos produtos que possuem preço
         * inferior ao preço médio.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full file path:");
        String path = sc.nextLine();

        //bloco try if resources abrindo o arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            //instancio a lista de produtos
            List<Produtos> list = new ArrayList<>();

            //leio uma linha
            String line = br.readLine();
            //enquanto essa linha for diferente de nulo eu faço um split, para que ele possa recortar com base na virgula,
            //o resultado fica em fields. adiciono o produto, fields na posição 0 é o nome, fields na posição 1 vai ser o preço e eu converto o numero para Double
            //depois eu leio a próxima linha  line= br.readLine(); e assim por diante até acabar o arquivo
            while (line!= null){
                String[] fields = line.split(",");
                list.add(new Produtos(fields[0],Double.parseDouble(fields[1]) ));
                line= br.readLine();
            }
            //fazer os processamentos
            //nesse ponto do programa o arquivo já foi lido, e todos os produtos estão armazernados la Lista acima 'list'

            //preço médio de todos os produtos

            double avg = list.stream()
                    .map(p->p.getPrice())
                    .reduce(0.0, (x,y)-> x+y)/list.size();

            System.out.println("Average price: " +String.format("%.2f",avg));

            //NOMES DOS PRODUTOS ABAIXO DA MÉDIA
            Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());//comparador de Strings independente de letra maiuscula e minuscula

            List<String> names = list.stream()
                    .filter(p -> p.getPrice()<avg)
                    .map(p-> p.getName())
                    .sorted(comp.reversed())// compara na ordem decrescente
                    .collect(Collectors.toList());//transforma a stream em lista

            names.forEach(System.out::println);


        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }






        sc.close();
    }
}
