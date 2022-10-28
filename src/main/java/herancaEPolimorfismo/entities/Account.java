package herancaEPolimorfismo.entities;

public abstract class Account {

    private Integer number;
    private String holder;//titular
    protected Double balance;//saldo da conta


    public Account(){

    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }
    //saque
    public void withdraw(Double amount){
    //saque desconta 5.00
        this.balance-=amount+5.00;
    }
    //deposito
    public void deposit(Double amount){
        this.balance+=amount;
    }


}
