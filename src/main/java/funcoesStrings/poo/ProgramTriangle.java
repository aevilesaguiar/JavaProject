package funcoesStrings.poo;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class ProgramTriangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner= new Scanner(System.in);
        double xA, xB, xC, yA,yB, yC;

        System.out.println("Enter de measures of trinagle X: ");
        xA= scanner.nextDouble();
        xB= scanner.nextDouble();
        xC= scanner.nextDouble();

        System.out.println("Enter de measures of trinagle Y: ");
        yA= scanner.nextDouble();
        yB= scanner.nextDouble();
        yC= scanner.nextDouble();

        double p = (xA+xB+xB)/2.0;
        double areaX=Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));

        p = (yA+yB+yB)/2.0;
        double areaY=Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));

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
