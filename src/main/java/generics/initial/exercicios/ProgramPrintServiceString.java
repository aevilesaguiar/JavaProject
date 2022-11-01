package generics.initial.exercicios;

import generics.initial.exercicios.entities.PrintServiceGenerics;

import java.util.Locale;
import java.util.Scanner;

public class ProgramPrintServiceString {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        PrintServiceGenerics<String> ps = new PrintServiceGenerics<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("How many values?");
        Integer n = sc.nextInt();

        for (int i = 0; i <n ; i++) {
            String value= sc.next();
            ps.addValue(value);

        }
        ps.print();
        String x = ps.first();
        System.out.println("First: "+ps.first());

        sc.close();
    }
}
