package excecao.exercicio.model.entities;

public class AccountGambiarra {

    private Integer number;
    private String name;
    private Double balance;
    private Double withdrawLimit;

    public AccountGambiarra() {
    }

    public AccountGambiarra(Integer number, String name, Double balance, Double withdrawLimit) {
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

            this.balance -= amount;

    }

    public String validateWithdraw(Double amount){
        if(amount>getWithdrawLimit()){
           return  "Withdraw error: The amount exceeds witdraw limit";

        }
        if(amount>getBalance()){
           return "Withdraw error: Not enough balance";

        }
        //senão houver nenhum erro retorna null
        return null;
    }
}
