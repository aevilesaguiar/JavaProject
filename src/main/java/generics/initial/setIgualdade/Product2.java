package generics.initial.setIgualdade;

import java.util.Objects;

public class Product2 implements Comparable<Product2>{

    private String name;
    private Double price;
    public Product2(String name, Double price) {
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

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product2 product = (Product2) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    //ordenar por ordem alfabetica
    @Override
    public int compareTo(Product2 o) {
        //comparando o nome de um produto com outro produto
        return name.toUpperCase().compareTo(o.getName().toUpperCase());
    }
}
