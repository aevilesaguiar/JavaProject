package excecao.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ReservationRuim {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    public ReservationRuim() {
    }

    public ReservationRuim(Integer roomNumber, Date checkin, Date checkout) {
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

    //ao invéns de ser void como o anterior , agora retorna uma String
    //Essa String é a mensagem de erro que por acaso ocorra
    public String updateDates(Date checkin, Date checkout){
        //cria uma data com a hora de agora
        Date now = new Date();

        //as datas para atualização não podem ser menores que a data atual
        if(checkin.before(now) || checkout.before(now)){
           return " Reservation dates for updates must be future dates";
        }
        if(!checkout.after(checkin)){
           return " Check-out date must be after check-in date";
        }

        //recebe duas datas novas e atualiza o checkin e o checkout
        this.checkin=checkin;
        this.checkout=checkout;

        //o critério para dizer que a minha operação não teve nenhum erro eu mando retornar nulo
        //se retonar algum String é por que deu erro aí eu tenho que tratar
        return null;

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
