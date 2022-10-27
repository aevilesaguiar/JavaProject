package secao10.exercicios;

import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        Integer qtde = sc.nextInt();

        Integer posmaior=0;
        Double maior = 0.00;

        Double[] vetor = new Double[qtde];
        for (int i = 0; i < vetor.length ; i++) {
            System.out.println("Digite um numero:");
            vetor[i] = sc.nextDouble();
        }

        maior=vetor[0];

        for (int i = 0; i <vetor.length ; i++) {

            if(vetor[i]> maior){
                maior=vetor[i];
                posmaior=i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);



        sc.close();
    }
}
