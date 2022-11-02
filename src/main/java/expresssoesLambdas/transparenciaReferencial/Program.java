package expresssoesLambdas.transparenciaReferencial;

import expresssoesLambdas.primeiraOrdem.entities.Product;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Program {
    public static int globalValue = 3;

    public static void main(String[] args) {

        int[] vect = new int[]{3, 4, 5};
        changeOddValues(vect);
        System.out.println(Arrays.toString(vect));
    }

    //O resultado da função não depende unicamente dela, ela depende de um valor externo, que nesse caso é o globalValue
    public static void changeOddValues(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += globalValue;

            }
        }
    }

  
}
