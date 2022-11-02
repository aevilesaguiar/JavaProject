package expresssoesLambdas.codigoconciso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        Integer sum=0;

        for (Integer x:list
             ) {
           sum+=x;
        }


        Integer sum1=list.stream().reduce(0,Integer::sum);
        System.out.println(sum1);
    }
}
