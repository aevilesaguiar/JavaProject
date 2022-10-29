package interfaceEHeranca.model.entities;

import interfaceEHeranca.model.enums.Color;

public abstract class Abstractshape implements Shape{

    private Color color;

    public Abstractshape() {
    }

    public Abstractshape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
