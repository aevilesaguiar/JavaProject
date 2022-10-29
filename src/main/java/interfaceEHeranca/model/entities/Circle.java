package interfaceEHeranca.model.entities;

import interfaceEHeranca.model.enums.Color;

public class Circle extends Abstractshape{

    private Double radius;


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
        return Math.PI*radius*radius;
    }
}
