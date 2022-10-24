package funcoesStrings.poo.application.entities;

public class Product {
    public String name;
    public Double price;
    public Integer quantity;


    public Product() {
    }

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double totalValueStock(){
        return quantity*price ;
    }

    public void addProducts(Integer quantity){
        this.quantity+=quantity;
    }

    //saida do estoque
    public  void removerProducts(Integer quantity){

        this.quantity-=quantity;
    }

    @Override
    public String toString() {
        return  name +
                ", $ " + String.format("%.2f",price) +
                ", " + quantity+ " units, "+
                " Total: $ "+String.format("%.2f",totalValueStock());

    }
}


