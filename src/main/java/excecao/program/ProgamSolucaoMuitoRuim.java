package excecao.program;

import excecao.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgamSolucaoMuitoRuim {
    public static void main(String[] args) throws ParseException {

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
            Reservation reservation = new Reservation(number,checkin,checkOut);
            System.out.println("Reservation "+reservation);//já foi definido no Tostring

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.println("CheckIn: ");
             checkin = sdf.parse(sc.next());
            System.out.println("CheckOut: ");
             checkOut = sdf.parse(sc.next());

             //cria uma data com a hora de agora
            Date now = new Date();

            //as datas para atualização não podem ser menores que a data atual
            if(checkin.before(now) || checkOut.before(now)){
                System.out.println("Error in reservation : Reservation dates for updates must be future dates");
            }else if(!checkOut.after(checkin)){
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            }else{
                //método que atualiza as datas
                reservation.updateDates(checkin,checkOut);
                System.out.println("Reservation "+reservation);//já foi definido no Tostring

            }




        }



        sc.close();

    }
}
