package funcoesStrings.poo.application.exercicios.membrosestaticos.util;

public class Calculator1 {

    public final double PI = 3.141559;

    public double circumference(double radius){

        return 2*PI*radius;
    }

    public double volume(double radius){

        return (4.0*PI*radius*radius*radius)/3;
    }
}
