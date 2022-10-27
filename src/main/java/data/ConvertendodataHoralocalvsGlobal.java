package data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertendodataHoralocalvsGlobal {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-10-27");
        LocalDateTime d05 = LocalDateTime.parse("2022-10-27T10:18:26");
        Instant d06 = Instant.parse("2022-10-27T09:37:26Z");
/*
        //imprimir zone ids
        for(String s : ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }*/

        //converter data-hora global para local
            LocalDate r1 = LocalDate.ofInstant(d06,ZoneId.systemDefault());
        System.out.println("r1= "+ r1);
        LocalDate r2 = LocalDate.ofInstant(d06,ZoneId.of("Portugal"));
        System.out.println("r2= "+ r2);

        LocalDateTime r3 = LocalDateTime.ofInstant(d06,ZoneId.systemDefault());
        System.out.println("r3= "+ r3);
        LocalDateTime r4 = LocalDateTime.ofInstant(d06,ZoneId.of("Portugal"));
        System.out.println("r4= "+ r4);

        LocalDateTime r5 = LocalDateTime.ofInstant(d06,ZoneId.of("America/Sao_Paulo"));
        System.out.println("r5= "+ r5);

        //obter dados de uma data-hora local

        //pegar o dia de uma data local
        System.out.println("d04 dia = "+d04.getDayOfMonth());
        //pegar o mês de uma data local
        System.out.println("d04 mês= "+d04.getMonth());
        //pegar o ano de uma data local
        System.out.println("d04 ano= "+d04.getYear());
        //pegar o era de uma data local
        System.out.println("d04 ano= "+d04.getEra());


        System.out.println("d05 hora= "+d05.getHour());
        System.out.println("d05 minuto= "+d05.getMinute());

    }
}
