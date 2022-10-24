package funcoesStrings.poo.application.exercicios.membrosestaticos.util;

public class CurrencyConverter {

    public static final double IOF=0.06;

    public static double cdollarToReal( Double amount, double dollarPrice){
        return amount* dollarPrice*(1.0+IOF);


    }
}
