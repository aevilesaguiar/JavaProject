package funcoesStrings.poo.application.exercicios.application;

import funcoesStrings.poo.application.exercicios.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class ApplicationRectangle {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();
        System.out.println("Enter rectangle width and height:");
        rect.wdth = sc.nextDouble();
        rect.heigth = sc.nextDouble();
        System.out.printf("AREA = %.2f%n", rect.area());
        System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());


        sc.close();
    }
}
