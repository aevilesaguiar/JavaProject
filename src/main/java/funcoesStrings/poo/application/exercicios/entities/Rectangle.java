package funcoesStrings.poo.application.exercicios.entities;

public class Rectangle {

    public Double wdth;
    public Double heigth;

    public Rectangle() {
    }

    public Double getWdth() {
        return wdth;
    }

    public void setWdth(Double wdth) {
        this.wdth = wdth;
    }

    public Double getHeigth() {
        return heigth;
    }

    public void setHeigth(Double heigth) {
        this.heigth = heigth;
    }

    public Double area(){
        double area= wdth*heigth;
        return area;
    }

    public Double perimeter(){
        double p =2*(heigth+ wdth);
        return p;
            }

    public double diagonal() {
        return Math.sqrt(wdth * wdth + heigth * heigth);
    }

}
