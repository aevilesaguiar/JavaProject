package expresssoesLambdas.criandofuncoes;

import expresssoesLambdas.interfaces.functions.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        /*Fazer um programa que, a partir de uma lista de produtos, calcule a
        soma dos preços somente dos produtos cujo nome começa com "T".*/

        List<Produto> list = new ArrayList<>();
        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.50));
        list.add(new Produto("HD Case", 80.90));

        ProductService ps = new ProductService();

        //Double sum = ps.filteresSum(list);
        Double sum = ps.filteresSum(list,p->p.getName().charAt(0)=='T');
        Double sum2 = ps.filteresSum(list,p->p.getPrice()<80.00);

        System.out.println("Sum= "+String.format("%.2f",sum));
        System.out.println("Sum mais barato= "+String.format("%.2f",sum2));



    }
}
