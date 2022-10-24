package funcoesStrings.poo.application.programApplication;

import funcoesStrings.poo.application.entities.Triangle;

import java.util.Scanner;

public class ProgramTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Triangle x =new Triangle();
        Triangle y =new Triangle();

        System.out.println("Enter de measures of triangle X: ");
        x.a= scanner.nextDouble();
        x.b= scanner.nextDouble();
        x.c= scanner.nextDouble();

        System.out.println("Enter de measures of triangle Y: ");
        y.a= scanner.nextDouble();
        y.b= scanner.nextDouble();
        y.c= scanner.nextDouble();


        double areaX=x.area();
        double areaY=y.area();

        System.out.printf("Tiangle X area: %.4f%n", areaX);
        System.out.printf("Tiangle Y area: %.4f%n", areaY);

        if(areaX>areaY){
            System.out.println("Larger area: X");
        }else{
            System.out.println("Larger area: Y");
        }



        scanner.close();
    }
}
