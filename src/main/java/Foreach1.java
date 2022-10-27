public class Foreach1 {
    public static void main(String[] args) {
        String[] vector = new String[]{"Maria", "Bob", "Alex"};

        for (int i = 0; i < vector.length ; i++) {
            System.out.println(vector[i]);
        }

        System.out.println("------------------------------");

        //Leitura: "para cada objeto 'obj' contido em vect, faça:"
        for (String list:vector
             ) {
            System.out.println(list);
        }

    }
}
