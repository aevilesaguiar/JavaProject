package secao10.exercicios;

import java.util.Scanner;

public class LerNumberNegat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quantos numeros serão lidos?");
        int qtde = sc.nextInt();

        int [] nums= new int[qtde];

        for (int i = 0; i <nums.length ; i++) {
            System.out.println("Informe "+(1+i)+" º numero:");
            nums[i]= sc.nextInt();
        }

        System.out.println("Numeros negativos:");

        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]< 0){
                System.out.println(nums[i]);
            }
        }



        sc.close();
    }
}
