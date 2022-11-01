package generics.initial.equalsAndHashCode;

import generics.initial.equalsAndHashCode.entitie.Client;

public class ProgramClient {
    public static void main(String[] args) {
        Client c1 = new Client("Maria","bib@mail.com");
        Client c2 = new Client("Maria","bib@mail.com");

        String s1 ="Test";
        String s2 ="Test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1==c2);
        System.out.println(s1==s2);//o compilador trata o valor literal de forma diferente
    }
}
