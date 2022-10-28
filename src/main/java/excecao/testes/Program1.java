package excecao.testes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
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
        }catch (InputMismatchException e){
            System.out.println("Informe um numero válido!");
        }

        System.out.println("Fim do Programa!");

        sc.close();
    }
}
