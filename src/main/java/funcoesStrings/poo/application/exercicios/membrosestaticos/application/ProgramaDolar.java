package funcoesStrings.poo.application.exercicios.membrosestaticos.application;

import funcoesStrings.poo.application.exercicios.membrosestaticos.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaDolar {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dolar price?");
        double dolarProce = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        double amount = sc.nextDouble();

        double result = CurrencyConverter.cdollarToReal(amount,dolarProce);

        System.out.printf("Amount to be paid in reais = %.2f %n", result);

        sc.close();

    }
}
