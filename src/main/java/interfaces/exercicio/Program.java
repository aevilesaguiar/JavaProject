package interfaces.exercicio;

import interfaces.exercicio.model.entities.Contract;
import interfaces.exercicio.model.entities.Installment;
import interfaces.exercicio.model.services.ContractService;
import interfaces.exercicio.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre os dados do contrato:");

        System.out.println("Numero:");
        Integer contrato = sc.nextInt();
        System.out.println("Data (dd/MM/yyyy):");
        LocalDate date =LocalDate.parse(sc.next(),dtf);
        System.out.println("Valor do contrato: ");
        Double amount = sc.nextDouble();

        Contract obj = new Contract(contrato,date,amount);

        System.out.println("Entre com o numero de parcelas:");
        Integer n= sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(obj,n);

        System.out.println("Parcelas:");

        for (Installment installment: obj.getInstallments()
             ) {
            System.out.println(installment);
        }







        sc.close();
    }
}
