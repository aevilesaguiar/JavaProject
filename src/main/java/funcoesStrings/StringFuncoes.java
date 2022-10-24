package funcoesStrings;

public class StringFuncoes {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG    ";
        System.out.println("Original: -" + original+"-");

        //converter letras minusculas
        String s01 = original.toLowerCase();
        System.out.println("ToLowercase : -" + s01+"-");

        //converter maiuscular
        String s02 = original.toUpperCase();
        System.out.println("ToUppercase : -" + s02+"-");

        //remove espaços
        String s03 = original.trim();
        System.out.println("Trim : -" + s03+"-");

        //gera uma nova string a apartir do caractere c(indice 2)
        String s04 = original.substring(2);
        System.out.println("Substring(2) : -" + s04+"-");

        //gera uma nova string a apartir do caractere c(indice 2) - recorta do indie 2 até 9
        String s05 = original.substring(2,9);
        System.out.println("Substring(2 - 9) : -" + s05+"-");

        String s06= original.replace('a','x');
        System.out.println("Replace (a,x): "+s06);

        String s07= original.replace("abc","xy");
        System.out.println("Replace e substring(abc,xy): "+s07);

        int  i = original.indexOf("bc");
        int  j = original.lastIndexOf("bd");
        System.out.println("Index of'bc': "+i);
        System.out.println("Last Index of'bd': "+j);

        //função que serve para recortar uma string
        String s = "potato apple lemon";

        String[] vect=s.split(" ");
        String word01= vect[0];
        String word02= vect[1];
        String word03= vect[2];

        System.out.println(word01);
        System.out.println(word02);
        System.out.println(word03);

        String teste = "amarelo-azul-rosa";
        String cores[] = teste.split("-");
        String cor1=cores[0];
        String cor2=cores[1];
        String cor3=cores[2];

        System.out.println(cor1);
        System.out.println(cor2);
        System.out.println(cor3);




    }
}
