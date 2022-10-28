package herancaEPolimorfismo.applicarion;

import herancaEPolimorfismo.entities.Account;
import herancaEPolimorfismo.entities.BussinessAccount;
import herancaEPolimorfismo.entities.SavingsAccount;

public class Program1 {
    public static void main(String[] args) {
       // Account acc1 = new Account(1001,"Alex",1000.00);
       // acc1.withdraw(200.00);
       // System.out.println(acc1.getBalance());

        //devido a sobreposição (override)
        Account acc2 = new SavingsAccount(1002,"Maria", 1000.00,0.01);
        acc2.withdraw(100.00);
        System.out.println(acc2.getBalance());

        Account acc3 = new BussinessAccount(1003,"Jonh",1000.00,500.00);
        acc3.withdraw(200.00);
        System.out.println(acc3.getBalance());


    }
}
