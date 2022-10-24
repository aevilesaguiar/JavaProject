package funcoesStrings.poo.application.exercicios.membrosestaticos.application;

import funcoesStrings.poo.application.exercicios.membrosestaticos.util.Calculator;
import funcoesStrings.poo.application.exercicios.membrosestaticos.util.Calculator1;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaV3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calculator1 calculator1= new Calculator1();

        System.out.println("Enter radius:");
        double radius = sc.nextDouble();

        double c = calculator1.circumference(radius);

        double v = calculator1.volume(radius);

        System.out.printf("Circumference: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("PI value: %.2f%n",calculator1.PI);



        sc.close();

    }


}
