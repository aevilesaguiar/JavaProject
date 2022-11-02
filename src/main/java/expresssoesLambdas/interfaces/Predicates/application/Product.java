package expresssoesLambdas.interfaces.Predicates.application;

public class Product {

    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
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

    //método estatico trabalha com o Product que você passa como argumento
    public static  void staticPriceUpdate(Product p){
         p.setPrice(p.getPrice()*1.10);
    }

    //método não estático é aquele que trabalha com o Objeto da instancia, ou seja estou acessando o atributo direto da classe
    public void  nonstaticPriceUpdate( ){
       price= price*1.10;
    }

    @Override
    public String toString() {
        return String.format(name + ", R$ " + price);
    }
}