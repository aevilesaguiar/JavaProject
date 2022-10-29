package interfaceEHeranca.application;

import interfaceEHeranca.model.entities.Abstractshape;
import interfaceEHeranca.model.entities.Circle;
import interfaceEHeranca.model.enums.Color;
import interfaceEHeranca.model.entities.Rectangle;

public class Programa {

    public static void main(String[] args) {

        Abstractshape s1 = new Circle(Color.BLACK, 2.0);
        Abstractshape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", s1.area()));
        System.out.println("Rectangle color: " + s2.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));




    }
}
