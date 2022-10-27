package secao10.array;

import java.util.Locale;
import java.util.Scanner;

public class Alt2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quantas alturas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();
        double [] altura = new double[n];
        double sum = 0.00;


        for (int i = 0; i < altura.length ; i++) {
            System.out.println("Informe a "+(i+1) +"ª altura");
            altura[i] = sc.nextDouble();

        }

        for (int i = 0; i < altura.length ; i++) {
            sum+=altura[i];
        }
        double average=sum/ altura.length;
        System.out.println(sum);
        System.out.println(average);




        sc.close();
    }
}
