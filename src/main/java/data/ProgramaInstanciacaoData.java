package data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProgramaInstanciacaoData {
    public static void main(String[] args) {

    //intanciando datas no intante atual
        LocalDate d01 = LocalDate.now();
        System.out.println("D01:"+d01);

        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("D02:"+d02);

        Instant d03= Instant.now();
        System.out.println("D03(data e hora GMT - no horário de Londres):"+d03);

        //pegar um texto 8601 e gerar uma data-hora a partir dele
        LocalDate d04 = LocalDate.parse("2022-10-27");
        System.out.println(d04);

        LocalDateTime d05 = LocalDateTime.parse("2022-10-27T01:30:26");
        System.out.println(d05);

        Instant d06 = Instant.parse("2022-10-27T09:37:26Z");
        System.out.println(d06);

        Instant d07 = Instant.parse("2022-10-27T09:37:26-03:00");
        System.out.println(d07);

        //TEXTO NO FORMATO CUSTOMIZADO - Data-hora
        //date time formatter (converter de string para data hora)
        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1= DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d08 = LocalDate.parse("20/07/2022",fmt1);
        System.out.println(d08);

        DateTimeFormatter fmt2= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 09:44",fmt2);
        System.out.println(d09);

        //dia mes e ano separado
        LocalDate d10 = LocalDate.of(2022,7,20);
        System.out.println(d10);

        LocalDateTime d11 = LocalDateTime.of(2022,10,27,9,49);
        System.out.println(d11);



    }
}
