package herancaEPolimorfismo.applicarion;

import herancaEPolimorfismo.entities.Account;
import herancaEPolimorfismo.entities.BussinessAccount;
import herancaEPolimorfismo.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class ProgramAbstract {

    public static void main(String[] args) {

        //o compilador não permite instanciar por que ele não pode ser instanciada
       // Account acc1 = new Account(1020, "Alex", 1000.0);
        Account acc2 = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
        Account acc3 = new BussinessAccount(1024, "Bob", 1000.0, 500.00);
        Account acc4 = new SavingsAccount(1022, "Joana", 1200.0, 0.01);
        Account acc5 = new BussinessAccount(1021, "pedro", 1300.0, 500.00);

        //o tipo da minha lista é genérica Account
        List <Account> list = new ArrayList<>();
        list.add(acc2);
        list.add(acc3);
        list.add(acc4);
        list.add(acc5);

        Double sum= 0.00;

        //soma total das contas
        for (Account acc: list
             ) {
            sum+=acc.getBalance();

        }

        System.out.printf("Total balance: %.2f%n ",sum);


        //depositar o valor de 10.00 para cada conta

        for (Account acc: list
             ) {
                acc.deposit(10.00);
        }

        for (Account acc:list
             ) {
            System.out.printf("Update balance for account %d: %.2f%n",acc.getNumber(),acc.getBalance());
        }




    }
}
