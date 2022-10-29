package interfaces.semInterface.model.services;

public class BrazilTaxService {//serviço que serve para calcular um imposto

    public Double tax(Double amount){

        Double tax = 0.00;

        if(amount<=100.00){
          tax = amount *0.20;
        }else{
            tax = amount *0.15;
        }
            return tax;
    }
}
