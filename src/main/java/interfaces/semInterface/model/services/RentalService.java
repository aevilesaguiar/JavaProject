package interfaces.semInterface.model.services;

import interfaces.semInterface.model.entities.CarRental;
import interfaces.semInterface.model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private BrazilTaxService brazilTaxService;

    //não foi incluido o contrutor vazio por que eu quero obrigadar ele a informar os dados
    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService brazilTaxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.brazilTaxService = brazilTaxService;
    }

    //o método que vai procecssar a fatura a aprtir de um carRental
    public void processInvoice(CarRental carRental){

        //encontra a duração entre dois instantes
       double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
       //numero de horas em fração
       double hours = minutes/60.00;
       double days = hours/24.00;

       double basicPayment;

       if(hours<=12){
           basicPayment = pricePerDay*Math.ceil(hours); //pega a fração arredonda para cima e calcula o pagamento

       }else{
            basicPayment=pricePerDay*Math.ceil(days);
       }
       //calcular imposto
        Double tax = brazilTaxService.tax(basicPayment);


        carRental.setInvoice(new Invoice(basicPayment,tax));


    }

}
