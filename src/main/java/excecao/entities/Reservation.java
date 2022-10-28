package excecao.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    public Reservation() {
    }

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    //removido o setCheckin e o setcHECKOUT por que teremos dois métodos para fazer isso
    public Long duration(){
        //calcular a diferença entre duas datas em milisegundos
        Long diff = checkout.getTime()-checkin.getTime();

        //converter milisegundos para dias
       return  TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);

    }

    public void updateDates(Date checkin, Date checkout){

        //recebe duas datas novas e atualiza o checkin e o checkout
        this.checkin=checkin;
        this.checkout=checkout;

    }

    @Override
    public String toString() {
        return "Room "
                + roomNumber
                + ", check-in: "
                + sdf.format(checkin)
                + ", check-out: "
                + sdf.format(checkout)
                + ", "
                + duration()
                + " nights";
    }
}
