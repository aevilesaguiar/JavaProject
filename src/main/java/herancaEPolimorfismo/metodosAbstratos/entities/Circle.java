package herancaEPolimorfismo.metodosAbstratos.entities;

import herancaEPolimorfismo.metodosAbstratos.entities.enums.Color;

public class Circle extends Shape {

    private static final Double PI= 3.141559;

    private Double radius;

    public Circle(){

    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        return PI*radius*radius;
    }
}
