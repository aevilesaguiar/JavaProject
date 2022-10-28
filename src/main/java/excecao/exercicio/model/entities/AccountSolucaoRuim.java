package excecao.exercicio.model.entities;

public class AccountSolucaoRuim {

    private Integer number;
    private String name;
    private Double balance;
    private Double withdrawLimit;

    public AccountSolucaoRuim() {
    }

    public AccountSolucaoRuim(Integer number, String name, Double balance, Double withdrawLimit) {
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
        if(amount>balance){
            System.out.println("Not possible withdraw");
        }else if(withdrawLimit>300.00){
            System.out.println("Not possible withdraw limite R$ 300.00");
        }else {
            this.balance -= amount;
        }
    }
}
