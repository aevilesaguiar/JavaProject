package javacollections.exerciciosSet.exercicio1.application;

import javacollections.exerciciosSet.exercicio1.entities.LogEntry;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //digite o caminho completo do arquivo
        System.out.print("Enter file full path: ");
        //leio o caminho completo do arquivo
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            //foi escolhido o hashSet porque é mais rápido e ele não permite repetição de código
            //contarei apenas os usuarios unicos
            Set<LogEntry> set = new HashSet<>();


            //lemos a primeira linha do arquivo
            String line = br.readLine();

            while (line!=null){

                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new LogEntry(username, moment));

                line = br.readLine();
            }
            System.out.println("Total users: "+set.size());

        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }


        sc.close();



    }
}
