package enumEComposicao.exercicioComposicao.entities;

import enumEComposicao.exercicioComposicao.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double basesalary;

    //composição de objeto as associação abaixo
    private Department department; //worker tem um department
    //QUANDO TEMOS UMA COMPOSIÇÃO TEM MUITOS, NÃO INCLUIMOS NO CONSTRUTOR, SIMPLISMENTE INICIO A LISTA VAZIA
    private List<HourContract> contracts=new ArrayList<>();//um Worker tem vários contrator por isso usei uma lista



    public Worker(){

    }

    public Worker(String name, WorkerLevel level, Double basesalary, Department department) {
        this.name = name;
        this.level = level;
        this.basesalary = basesalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBasesalary() {
        return basesalary;
    }

    public void setBasesalary(Double basesalary) {
        this.basesalary = basesalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }


    //metodo que adiciona um contarto a um trabalhador
    public void addContract(HourContract contract){

        //ele pega a listinha d econtratos contracts e adiciona o contract que veio como argumento
        contracts.add(contract);//adicionei na lista o contrato

    }

    public void removeContract(HourContract contract){

        contracts.remove(contract);

    }

    //income=renda
    public double income(int year, int month) {
        double sum = basesalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);//acrescentei +1 por que o mês do Calendar começa em 0
            //só quero os contratos que sejam desse mês e desse ano
            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }


}
