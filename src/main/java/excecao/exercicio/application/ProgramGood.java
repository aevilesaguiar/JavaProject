package excecao.exercicio.application;

import excecao.exercicio.model.entities.AccountGood;
import excecao.exercicio.model.exceptions.BussinessException;

import java.util.Locale;
import java.util.Scanner;

public class ProgramGood {

    public static void main(String[] args) {

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

        AccountGood acc = new AccountGood(number,holder,balance,witdrawLimit);
        System.out.println("Enter amount for withdraw:");
        Double amount = sc.nextDouble();

        try {
            acc.withdraw(amount);
            System.out.printf("New Balance: $ %.2f%n", acc.getBalance());
        }catch (BussinessException e){
            System.out.println(e.getMessage());
        }
        sc.close();

    }
}
