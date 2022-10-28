package excecao.exercicio.application;

import excecao.exercicio.model.entities.AccountSolucaoRuim;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSolucaoRuim {

    public static void main(String[] args) {
        //forma errada tudo no programa principal sem delegar

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //balance = saldo
        //holder=titular

        System.out.println("Enter account data:");
        System.out.println("Number: ");
        Integer number = sc.nextInt();
        System.out.println("Holder: ");
        sc.next();//se eu não colocar o next() eu não consigo ler o que for digitado abaixo pois usei nextLine(), pois eu preciso consumir o enter
        String holder = sc.nextLine();
        System.out.println("Initial Balance");
        Double balance = sc.nextDouble();
        System.out.println("Withdraw limit: ");
        Double witdrawLimit = sc.nextDouble();

        AccountSolucaoRuim acc = new AccountSolucaoRuim(number,holder,balance,witdrawLimit);
        System.out.println("Enter amount for withdraw:");
        Double amount = sc.nextDouble();

        if(amount>acc.getWithdrawLimit()){
            System.out.println("Withdraw error: The amount exceeds witdraw limit");

        }else if(amount>acc.getBalance()){
            System.out.println("Withdraw error: Not enough balance");

        }else {
            acc.withdraw(amount);
            System.out.printf("New Balance: $ %.2f%n", acc.getBalance());
        }
        sc.close();

    }
}
