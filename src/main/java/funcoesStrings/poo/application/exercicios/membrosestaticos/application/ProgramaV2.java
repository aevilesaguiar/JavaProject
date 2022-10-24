package funcoesStrings.poo.application.exercicios.membrosestaticos.application;

import funcoesStrings.poo.application.exercicios.membrosestaticos.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaV2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius:");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("PI value: %.2f%n",Calculator.PI);



        sc.close();

    }


}
