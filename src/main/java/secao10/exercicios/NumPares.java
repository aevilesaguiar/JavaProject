package secao10.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class NumPares {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        Integer qtde = sc.nextInt();

        Integer [] nums = new Integer[qtde];
        Integer qpares=0;

        for (int i = 0; i < nums.length ; i++) {
            System.out.println("Digite um numero:");
            nums[i]=sc.nextInt();
        }

        System.out.println("NUMEROS PARES: \n");
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] %2==0){
                System.out.println(nums[i]);
                qpares++;

            }

        }
            System.out.println("QUANTIDADE DE PARES: "+qpares);





        sc.close();

    }
}
