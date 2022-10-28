package herancaEPolimorfismo.applicarion;

import herancaEPolimorfismo.entities.Account;
import herancaEPolimorfismo.entities.BussinessAccount;
import herancaEPolimorfismo.entities.SavingsAccount;

public class Program2 {
    public static void main(String[] args) {

        //Polimorfirmo : chamei as operações para as variaveis do mesmo tipo pois elas (x,y) são do tipo account
        //mas elas tiveram comportamentos diferentes conforme os objetos os quais elas apontam

        //Instanciando uma conta comum
       // Account x = new Account(1020, "Alex", 1000.0);
        //Instanciando uma conta poupança que não desconta o saque
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

       // x.withdraw(50.0);
        y.withdraw(50.0);

       // System.out.println(x.getBalance());
        System.out.println(y.getBalance());

    }
}
