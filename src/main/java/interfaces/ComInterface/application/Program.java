package interfaces.ComInterface.application;

import interfaces.ComInterface.model.entities.CarRental;
import interfaces.ComInterface.model.services.BrazilTaxService;
import interfaces.ComInterface.model.services.RentalService;
import interfaces.ComInterface.model.entities.Vehicle;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

  Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro:");
        String model = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(),fmt);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),fmt);


        CarRental carRental = new CarRental(start, finish,new Vehicle(model) );

        System.out.println("Entre com o preço por hora:");
        Double pricePerHour = sc.nextDouble();
        System.out.println("Entre com o preço por dia:");
        Double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay,new BrazilTaxService());
        rentalService.processInvoice(carRental);

          System.out.println("FATURA:");
          System.out.println("Pagamento basico:"+ String.format("%.2f",carRental.getInvoice().getBasicPayment()));

          System.out.println("Imposto:"+String.format("%.2f",carRental.getInvoice().getTax()));

          System.out.println("Pagamento total:"+String.format("%.2f",carRental.getInvoice().getTotalPayment()));

        sc.close();


    }
}
