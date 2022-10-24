package exerciciopoo.application;

import exerciciopoo.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAccount {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account number:");
        Integer number = sc.nextInt();

        System.out.println("Enter account holder: ");
        sc.nextLine();
        String nameHolder = sc.nextLine();

        System.out.println("Is there an initial deposit (y/n)?");
        char response = sc.next().charAt(0);

        Account account1;
        if(response=='y'){
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account1=new Account(number,nameHolder,initialDeposit);

        }else{
            account1 = new Account(number,nameHolder);
        }

        System.out.println();

        System.out.println("Account data: ");
        System.out.println(account1);

        System.out.println();
        System.out.println(" Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account1.deposit(depositValue);
        System.out.println(account1);

        System.out.println();
        System.out.println(" Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account1.withdraw(withdrawValue);
        System.out.println("Update account data:");
        System.out.println(account1);




        sc.close();
    }
}
