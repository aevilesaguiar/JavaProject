package herancaEPolimorfismo.applicarion;

import herancaEPolimorfismo.entities.Account;
import herancaEPolimorfismo.entities.BussinessAccount;
import herancaEPolimorfismo.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        //Account account = new Account(1234,"Alex",0.00 );

        BussinessAccount bussinessAccount = new BussinessAccount(1002, "Maria",0.00,500.00);

        //UPCASTING (PEGAR UM OBJETO DO TIPO bussinessAccount e atribuí-lo para uma variável do tipo Account
        //não dá erro quando eu faço um objeto da subclasse ser atribuido a uma variável da SuperClasse
        //por que aprendemos que herança é uma relação "é 1", ou seja uma BussinessAccount é uma Account, ou seja
        //uma conta empresarial também "é uma conta"

        Account acc1 = bussinessAccount;
        acc1.getBalance();

        Account acc2 = new BussinessAccount(1003,"bob",0.00,200.00);
        Account acc3 = new SavingsAccount(1004,"Deb",0.00,0.01);

        //Downcasting converter o objeto da superClasse para a subclasse
        //Não posso converter de Account para Bussiness Acount, a converssão não é natural, assim eu tenho que
        //fazer um casting manual eu tenho que
        BussinessAccount acc4 =(BussinessAccount) acc2;
        acc4.loan(100.00);


        //nem sempre dá certo fazer downCasting
        //BussinessAccount acc5 = (BussinessAccount) acc3;

        if(acc3 instanceof BussinessAccount ){
            acc4.loan(200.00);
            System.out.println("Loan!");
        }

        if(acc3 instanceof  SavingsAccount){
            SavingsAccount acc5=(SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }


    }
}
