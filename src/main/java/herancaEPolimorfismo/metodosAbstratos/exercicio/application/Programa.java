package herancaEPolimorfismo.metodosAbstratos.exercicio.application;

import herancaEPolimorfismo.metodosAbstratos.exercicio.entities.Contribuintes;
import herancaEPolimorfismo.metodosAbstratos.exercicio.entities.PessoaFisica;
import herancaEPolimorfismo.metodosAbstratos.exercicio.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        //TaxPayer(pagador de impostos)
        //Individual (Pessoa fisica)
        //Company (Pessoa juridica)

        //pessoa fisica é um pagador de impostos
        //pessoa juridica é um pagador de impostos


        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Contribuintes> list = new ArrayList<>();

        System.out.println("Enter the number of tax payers:");
        Integer qpayer= sc.nextInt();


        for (int i=1; i<=qpayer; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double income = sc.nextDouble();
            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new PessoaFisica(name, income, healthExpenditures));
            }
            else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new PessoaJuridica(name, income, numberOfEmployees));
            }
        }

        Double sum = 0.00;

        System.out.println();
        System.out.println("TAXES PAID:");

        for (Contribuintes c:list
             ) {
            Double imposto = c.imposto();
            System.out.println(c.getNome() +":"+String.format("%.2f",imposto));
             sum+=imposto;
        }
        System.out.println();
        System.out.println("Total Taxes: $ "+String.format("%.2f",sum));


        sc.close();

    }
}
