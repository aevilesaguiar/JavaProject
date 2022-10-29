package interfaces.comparables;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        String path = "C:\\temp\\names.txt";

        //leitura do arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String name = br.readLine();

            while (name !=null){
            //ler o arquivo inteiro guaradando cada um dos nomes em um elemento da lista
                list.add(name);
                name= br.readLine();
            }

            //operação padrão utilizada para ordenar uma coleção
            Collections.sort(list);
            for (String s:list
                 ) {
                System.out.println(s);
            }

        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
