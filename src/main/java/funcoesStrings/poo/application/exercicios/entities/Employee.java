package funcoesStrings.poo.application.exercicios.entities;

public class Employee {
    public String name;
    public Double grossSalary;
    public Double tax;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(Double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double netSalary(){
        return grossSalary-this.tax;

    }

    public void increaseSlary(Double percentage){
                grossSalary+=grossSalary*percentage/100.00;
    }

    @Override
    public String toString() {
        return  name + " , $" +
                String.format("%.2f",netSalary());
    }
}
