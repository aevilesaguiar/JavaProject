package enumEComposicao.exercicioComposicao.main;

import enumEComposicao.exercicioComposicao.entities.Department;
import enumEComposicao.exercicioComposicao.entities.HourContract;
import enumEComposicao.exercicioComposicao.entities.Worker;
import enumEComposicao.exercicioComposicao.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramDepartment {
    public static void main(String[] args) throws ParseException {
        /*Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
        do usuário um mês e mostrar qual foi o salário do funcionário nesse mês,*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("MM/yyyy");

        System.out.println("Enter department's name: ");
        String departmentName= sc.nextLine();

        System.out.println("Enter worker data: ");
        System.out.println("Name: ");
        String workerName = sc.nextLine();
        System.out.println("LeveL: ");
        String workerLevel = sc.nextLine();
        System.out.println("Base salary: ");
        Double baseSlary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),baseSlary, new Department(departmentName));//o departamento é um Objeto do tipo Department por isso tuivemos que instanciar o objeto

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();
        //ler os dados do contrato
        for (int i=1; i<=n; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        //recorta um string gerando um substring com os dois dígitos
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());//composição do objeto
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));


        sc.close();
    }
}
