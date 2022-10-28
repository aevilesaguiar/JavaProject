package excecao.model.entities;

import excecao.model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ReservationBoa {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    public ReservationBoa() {
    }

    public ReservationBoa(Integer roomNumber, Date checkin, Date checkout) throws DomainException {
            //programação defensiva é uma boa prática
        if(!checkout.after(checkin)){
            throw new  DomainException(" Check-out date must be after check-in date");
            //throw new IllegalArgumentException(" Check-out date must be after check-in date");
        }

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

    //o meu método updatesDates é um método que pode lançar uma exceção depende do que ocorrer abaixo se , por exemplo nos ifs
    public void updateDates(Date checkin, Date checkout) throws DomainException {
        //cria uma data com a hora de agora
        Date now = new Date();

        //as datas para atualização não podem ser menores que a data atual
        if(checkin.before(now) || checkout.before(now)) {
            //geralmente usamos a exceção IllegalArgumentException quando os argumentos que voc~e passa para o método são inválidos em tese ela pode ser usada
           throw new DomainException( " Reservation dates for updates must be future dates");
        }
        if(!checkout.after(checkin)){
            throw new  DomainException(" Check-out date must be after check-in date");
            //throw new IllegalArgumentException(" Check-out date must be after check-in date");
        }

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
