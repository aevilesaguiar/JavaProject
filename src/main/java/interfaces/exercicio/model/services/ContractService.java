package interfaces.exercicio.model.services;

import interfaces.exercicio.model.entities.Contract;
import interfaces.exercicio.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

   private OnlinePaymentsService onlinePaymentsService;

   public ContractService(OnlinePaymentsService onlinePaymentsService) {
      this.onlinePaymentsService = onlinePaymentsService;
   }

   public void processContract(Contract contract, Integer months){
      //parcela básica
         double basicQuota= contract.getTotalValue()/months;

      for (int i = 1; i <=months ; i++) {
         //dueDate =vencimento da parcela
         LocalDate dueDate = contract.getDate().plusMonths(i); //quando começar o for e o i valer 1 eu vou adicionar um mês, então a data original será dueDate mais um mês

         //calcular o valor do juro para cada um dos meses (interest=juro)
         double interest =onlinePaymentsService.interest(basicQuota,i);
         //fee=taxa
         //eu aplicao a taxa em cima de basicQuota+juri
         double fee = onlinePaymentsService.paymentFee(basicQuota+interest);

         //cota cheia
         double quota = basicQuota+interest+fee;
         contract.getInstallments().add(new Installment(dueDate,quota));
      }
   }
}
