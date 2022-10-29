package interfaces.comparables;

public class Employee implements Comparable<lista.entities.Employee> {
    private String name;
    private Double salary;
    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }


    //método compareTo serve para comparar um objeto com outro
    @Override
    public int compareTo(lista.entities.Employee o) {
        //comparação entre funcionários é apenas comparar os seus nome
        return salary.compareTo(o.getSalary());
    }
}
