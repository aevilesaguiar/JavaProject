package javacollections.maps.application;

import java.util.Map;
import java.util.TreeMap;

public class Program1 {
    public static void main(String[] args) {

        //Estrutura armazenar cookies
        Map<String, String> cookies = new TreeMap<>(); //treemap Ordena
        //Como o tipo String já POSSUEM O MÉTODO EQUAL/HASCH CODE e comparaTo IMPLEMENTADOS POR PADRÃO

        cookies.put("username","Maria");
        cookies.put("email","maria@mail.com");
        cookies.put("phone","998526-8526");
        cookies.put("phone","98562-2365");

        //estou excluindo a chave cujo nome é email
        cookies.remove("email");

        System.out.println("-----------------------------------");
        System.out.println("Contains 'phone' key: "+cookies.containsKey("phone"));
        System.out.println("-----------------------------------");
        System.out.println("Phone number: "+cookies.get("phone"));
        System.out.println("-----------------------------------");
        System.out.println("Username: "+cookies.get("username"));
        System.out.println("-----------------------------------");
        System.out.println("Email: "+cookies.get("email"));//quando a chave não existe get retorna null
        System.out.println("-----------------------------------");
        System.out.println("Size: "+cookies.size());
        System.out.println("-----------------------------------");
        System.out.println("ALL COOKIES: ");

        for (String key:cookies.keySet() //keySet() retorna um set com as chaves do meu map
             ) {
            System.out.println(key+": "+cookies.get(key));
        }
        System.out.println("-----------------------------------");


    }
}
