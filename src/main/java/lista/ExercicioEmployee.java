package lista;

import lista.entities.Employee;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioEmployee {
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

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase : ");
        int idsalary = sc.nextInt();

        // Integer pos = position(list, idsalary);

        Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

        // if (pos == null) {
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            //list.get(pos).increaseSalary(percent);
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee e : list) {
            System.out.println(e);
        }

        sc.close();
    }

    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
