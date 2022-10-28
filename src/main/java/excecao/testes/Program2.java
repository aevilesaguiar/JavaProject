package excecao.testes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {


        method1();
        System.out.println("Fim do Programa!");

    }
    public static void method1(){
        System.out.println("***METHOD1 START***");

        method2();
        System.out.println("***METHOD1 END***");
    }
    public static void method2(){
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);

        try {
            //vou escrever ler vários dados na mesma linha separados por um espaço em branco e cada elemento vai ser um elemento do vetor
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            //mostrar na tela aquela posição que eu informei
            System.out.println(vect[position]);
        }catch (ArrayIndexOutOfBoundsException e){
            //ArrayIndexOutOfBoundsException:  acessando uma posição que não existe
            System.out.println("Posição inválida");

            //imprime na tela o rastreamento do stack
            e.printStackTrace();
            sc.next();
        }catch (InputMismatchException e){
            System.out.println("Informe um numero válido!");
        }



        sc.close();
        System.out.println("***METHOD2 END***");

    }
}
