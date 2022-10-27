package secao10.exercicios;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    /*Faça um programa que leia N números reais e armazene-os em um vetor.
    Em seguida:
    - Imprimir todos os elementos do vetor
    - Mostrar na tela a soma e a média dos elementos do vetor */

        System.out.println("Quantos numeros voce vai digitar?");
        int qtde = sc.nextInt();

        double [] nums = new double[qtde];

        double sum=0.00;

        double average=0.00;

        for (int i = 0; i <nums.length ; i++) {
            System.out.println("Digite um numero: ");
            nums[i]=sc.nextInt();
        }

        System.out.println("Valores: ");
        for (int i = 0; i < nums.length ; i++) {
            System.out.println(nums[i]);
            sum+=nums[i];
        }

        System.out.println("SOMA: "+sum);
        average=sum/ nums.length;
        System.out.println("MEDIA:"+average);




        sc.close();
    }
}
