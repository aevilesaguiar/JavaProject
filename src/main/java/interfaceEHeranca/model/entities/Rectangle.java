package interfaceEHeranca.model.entities;

import interfaceEHeranca.model.enums.Color;

public class Rectangle extends Abstractshape{

    private Double width;
    private Double heigth;

    public Rectangle(Double width, Double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public Rectangle(Color color, Double width, Double heigth) {
        super(color);
        this.width = width;
        this.heigth = heigth;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeigth() {
        return heigth;
    }

    public void setHeigth(Double heigth) {
        this.heigth = heigth;
    }
    @Override
    public Double area(){
        return width*heigth;
    }
}
