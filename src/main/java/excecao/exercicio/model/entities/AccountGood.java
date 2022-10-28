package excecao.exercicio.model.entities;

import excecao.exercicio.model.exceptions.BussinessException;

public class AccountGood {

    private Integer number;
    private String name;
    private Double balance;
    private Double withdrawLimit;

    public AccountGood() {
    }

    public AccountGood(Integer number, String name, Double balance, Double withdrawLimit) {
        this.number = number;
        this.name = name;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

      public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount){

        this.balance+=amount;
    }

    public void withdraw(Double amount){
        validateWithdraw(amount);

        this.balance -= amount;

    }

    private void validateWithdraw(Double amount){
        if(amount>getWithdrawLimit()){
            throw  new BussinessException( "Withdraw error: The amount exceeds witdraw limit") ;

        }
        if(amount>getBalance()){
           // throw  new RuntimeException( "Withdraw error: Not enough balance");
            throw  new BussinessException( "Withdraw error: Not enough balance");

        }

    }
}
