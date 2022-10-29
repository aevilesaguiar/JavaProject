package interfaces.ComInterface.model.services;

public class BrazilTaxService implements TaxService{//serviço que serve para calcular um imposto
    @Override
    public double tax(Double amount){

        Double tax = 0.00;

        if(amount<=100.00){
          tax = amount *0.20;
        }else{
            tax = amount *0.15;
        }
            return tax;
    }


}
