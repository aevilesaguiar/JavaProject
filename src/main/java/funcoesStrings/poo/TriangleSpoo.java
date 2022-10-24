package funcoesStrings.poo;

import java.util.Scanner;

public class TriangleSpoo {
    public static void main(String[] args) {
        /*ler medidas de lado de dois triangulos, mostrar valor da área e a maior área */
        Scanner scanner = new Scanner(System.in);

        int areat1;
        int areat2;

        System.out.println("Triangulo 1");
        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int m3 = scanner.nextInt();

        areat1 = (m1+m2+m3)/2;

        System.out.println("Triangulo 2");
        int mt21 = scanner.nextInt();
        int mt22 = scanner.nextInt();
        int mt23 = scanner.nextInt();

        areat2 = (mt21+mt22+mt23)/2;

        System.out.println("Triangle X area: "+areat1);

        System.out.println("Triangle Y area: "+areat2);

        if(areat1>areat2){
            System.out.println("Area: Y =  "+areat1);
        }else{
            System.out.println("Area: X = "+areat2);
        }

        scanner.close();


    }
}
