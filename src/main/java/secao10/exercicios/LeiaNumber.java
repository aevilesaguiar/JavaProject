package secao10.exercicios;

import java.util.Scanner;

public class LeiaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros você vai digitar?");
        int numeros = sc.nextInt();

        double[] vector = new double[numeros];

        for (int i = 0; i < vector.length ; i++) {
            System.out.println("Digite um numero: ");
            vector[i]=sc.nextInt();

        }

        double soma=0;

        for (int i = 0; i < vector.length ; i++) {
            soma=soma+vector[i];

        }

        double media = soma/vector.length;

        System.out.println("VALORE= ");

        for (int i = 0; i < vector.length ; i++) {
            System.out.printf("%.1f ",vector[i]);
        }
        System.out.printf("\n Soma= %.2f\n",soma);
        System.out.printf("\n Media = %.2f\n",media);




        sc.close();
    }
}
