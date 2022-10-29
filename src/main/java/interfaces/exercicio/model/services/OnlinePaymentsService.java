package interfaces.exercicio.model.services;

public interface OnlinePaymentsService {

    //taxa de pagamento
     Double paymentFee(Double amount);
     Double interest(Double amount, Integer months);


}
