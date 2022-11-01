package generics.initial.curingasdelimitados.aplication;

import generics.initial.curingasdelimitados.entities.Circle;
import generics.initial.curingasdelimitados.entities.Rectangle;
import generics.initial.curingasdelimitados.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0,2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: "+ totalArea(myCircles));
        System.out.println("Total area: "+ totalArea(myShapes));
    }

    //estou dizendo que essa List<? extends Shape> pode ser de shape ou de qualquer tipo que seja um subtipo de shape
    //então esse método também vai aceitar uma lista de circles
    public static Double totalArea(List<? extends Shape> list){
        Double sum = 0.00;
        for (Shape s:list
             ) {
            sum+=s.area();
        }
        return sum;
    }
}
