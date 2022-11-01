package generics.initial.exercicios;

import generics.initial.exercicios.entities.PrintServiceGenerics;

import java.util.Locale;
import java.util.Scanner;

public class ProgramPrintServiceGenerics {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        PrintServiceGenerics<Integer> ps = new PrintServiceGenerics<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("How many values?");
        Integer n = sc.nextInt();

        for (int i = 0; i <n ; i++) {
           Integer value = sc.nextInt();
           ps.addValue(value);

        }

        ps.print();
        Integer x = ps.first();
        System.out.println("First: "+ps.first());

        sc.close();
    }
}
