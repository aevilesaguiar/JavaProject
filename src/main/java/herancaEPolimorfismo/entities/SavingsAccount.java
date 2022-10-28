package herancaEPolimorfismo.entities;

//conta poupança
public class SavingsAccount extends Account { //quando uso final num classe informa que ela não pode ser herdada por outra classe

    private  Double interestRate;//taxa de juros

    public SavingsAccount(){

    }

    public SavingsAccount(Double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    //atualizar o saldo da conta com base na taxa de juros
    public void updateBalance(){
        balance+= balance*interestRate;

    }

    //sobreposição( o compilador busca na super classe e encontra por isso da importancia de usar Override)
    @Override
    public void withdraw(Double amount){
        balance-=amount;
    }

}
