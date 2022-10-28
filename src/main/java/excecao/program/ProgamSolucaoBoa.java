package excecao.program;

import excecao.model.entities.ReservationBoa;
import excecao.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgamSolucaoBoa {
    public static void main(String[] args) {

        //Solução Boa tratamento de Exceções
        Scanner sc = new Scanner(System.in);

        try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            System.out.println("Romm Number: ");
            Integer number = sc.nextInt();
            System.out.println("CheckIn: ");
            Date checkin = sdf.parse(sc.next());
            System.out.println("CheckOut: ");
            Date checkOut = sdf.parse(sc.next());


            //realize a reserva
            ReservationBoa reservation = new ReservationBoa(number, checkin, checkOut);
            System.out.println("Reservation " + reservation);//já foi definido no Tostring

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.println("CheckIn: ");
            checkin = sdf.parse(sc.next());
            System.out.println("CheckOut: ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkin, checkOut);

            System.out.println("Reservation " + reservation);//já foi definido no Tostring
        }catch (ParseException e){
            System.out.println("Invalid date format");
        }catch (DomainException e){
            System.out.println("Error in reservation:  "+e.getMessage());//getMessage é o erro que inclui no método que lança através do throw
        }catch (RuntimeException e){
            System.out.println("Unexpected error");
        }

           finally {
            sc.close();
        }






    }
}
