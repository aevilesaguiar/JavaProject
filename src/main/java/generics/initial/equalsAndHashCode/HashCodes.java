package generics.initial.equalsAndHashCode;

public class HashCodes {
    public static void main(String[] args) {

        String a = "Maria";
        String b = "Alex";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        Integer first = 3;
        Integer second = 1;

        System.out.println(first.hashCode(second));
        System.out.println(second.hashCode(second));
    }
}


