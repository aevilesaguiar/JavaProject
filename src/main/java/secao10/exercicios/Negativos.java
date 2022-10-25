package secao10.exercicios;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros você vai digitar?");
        int num = sc.nextInt();

        Integer [] vector = new Integer[num];

        for (int i = 0; i < vector.length ; i++) {
            System.out.println("Digite um numero:");
            vector[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos:");

        for (int i = 0; i < vector.length ; i++) {
            if(vector[i]<0){
                System.out.printf("%d\n",vector[i]);
            }
        }


        sc.close();
    }
}
