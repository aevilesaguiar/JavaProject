package generics.initial.exercicios;

import generics.initial.exercicios.entities.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class ProgramPrintService {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        PrintService ps = new PrintService();

        Scanner sc = new Scanner(System.in);
        System.out.println("How many values?");
        Integer n = sc.nextInt();

        for (int i = 0; i <n ; i++) {
            Integer value= sc.nextInt();
            ps.addValue(value);

        }
        ps.print();
        System.out.println("First: "+ps.first());

        sc.close();
    }
}
