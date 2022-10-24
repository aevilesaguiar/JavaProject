package funcoes;

import java.util.Scanner;

public class Func1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*Fazer um programapara ler 3 numeros inteiros e mostrar o maior na tela*/
        System.out.println("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int higher = max(a,b,c);
        showResult(higher);


        scanner.close();
    }

    public static int max(int a, int b, int c){

        int aux;

        if(a>b && a>c){
           aux=a;
        }else if(b>c){
            aux=b;
        }else {
            aux=c;
        }

        return aux;

    }

    public static void showResult(int value){

        System.out.println("Higher= "+value);

    }


}
