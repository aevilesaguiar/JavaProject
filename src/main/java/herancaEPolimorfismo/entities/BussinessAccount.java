package herancaEPolimorfismo.entities;

public class BussinessAccount extends Account {

    private Double loanLimit; //limite de empréstimo

    public BussinessAccount(){
        super();

    }

    public BussinessAccount(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public BussinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);//agora faz sentido usar o super() pois  ele executa a lógica na sub classe que é Bussiness acount
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount){
            if(amount<= loanLimit){

               balance+=amount-10;
            }
    }
}
