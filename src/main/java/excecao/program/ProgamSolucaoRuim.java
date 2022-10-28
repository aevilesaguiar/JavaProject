package excecao.program;

import excecao.entities.ReservationMuitoRuim;
import excecao.entities.ReservationRuim;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgamSolucaoRuim {
    public static void main(String[] args) throws ParseException {

        //Problema de delegação por isso é uma solução ruim
        //Método retornando string: muito utilizada em liguagens antigas tipo linguagem c, tinhamos uma função que retornava um erro
        //aí essa função tinha que retoornar o código do erro para o programador tratar essa exceção


        Scanner sc = new Scanner(System.in);
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Romm Number: ");
        Integer number = sc.nextInt();
        System.out.println("CheckIn: ");
        Date checkin = sdf.parse(sc.next());
        System.out.println("CheckOut: ");
        Date checkOut = sdf.parse(sc.next());
        //se checkout não for depois de checkin
        if(!checkOut.after(checkin)){
            //significa que as datas são erradas
            System.out.println("Error in reservation: Check-out date must be after check-in date");

        }else{
            //realize a reserva
            ReservationRuim reservation = new ReservationRuim(number,checkin,checkOut);
            System.out.println("Reservation "+reservation);//já foi definido no Tostring

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.println("CheckIn: ");
             checkin = sdf.parse(sc.next());
            System.out.println("CheckOut: ");
             checkOut = sdf.parse(sc.next());


             // reservation.updateDates(checkin,checkOut); retorna uma string de acordo com o método que alteramos
            //e esse String é o que vai dizer para mim se ocorreu erro ou não
             String error =reservation.updateDates(checkin,checkOut);

             if(error != null) {
                 System.out.println("Error in reservation: " + error);
             }else{
                System.out.println("Reservation "+reservation);//já foi definido no Tostring

            }




        }



        sc.close();

    }
}
