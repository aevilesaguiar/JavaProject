package lista;

import lista.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioEmployee2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How Many employees will be registered?");
        Integer n= sc.nextInt();

        System.out.println();
        List<Employee> list= new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            System.out.println("Employee #"+(i+1)+": ");
            System.out.println("Id: ");
            Integer id = sc.nextInt();
            System.out.println("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary:");
            Double salary= sc.nextDouble();

            Employee employee = new Employee(id,name,salary);
            list.add(employee);
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        Integer idSalary = sc.nextInt();

        Employee employee = list.stream().filter(x->x.getId()==idSalary).findFirst().orElse(null);

        if(employee==null){
            System.out.println("This id does not exist!");
        }else{
            System.out.println("Enter the percentage:");
        }




        sc.close();
    }
    
    public Integer hasId(List<Employee> list,Integer id){
        //dizer a posição do id na lista
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i).getId()==id){
                return i;
            }
        }
        return -1; //se eu não encontrar aparece null
    }

    
}
