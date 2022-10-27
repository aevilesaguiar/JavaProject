package data;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class CalculoDataHora {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-10-27");
        LocalDateTime d05 = LocalDateTime.parse("2022-10-27T10:18:26");
        Instant d06 = Instant.parse("2022-10-27T09:37:26Z");

        //calculo com data e hora

        //subtrai 7 dias
        LocalDate pastWeekLocaldate = d04.minusDays(7);
        System.out.println("pastWeekLocaldate= "+pastWeekLocaldate);


        LocalDate nextWeekLocalDate = d04.plusDays(7);
        System.out.println("nextWeekLocalDate= "+nextWeekLocalDate);

        LocalDate today= LocalDate.now();
        System.out.println("Today= "+today);

        LocalDate tomorrow= today.plusDays(1);
        System.out.println("Tomorrow= "+tomorrow);

        LocalDate yesterday= today.minusDays(1);
        System.out.println("Yesterday= "+yesterday);


        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        System.out.println("past Week Local Date Time= "+pastWeekLocalDateTime);

        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        System.out.println("past Week Local Date Time= "+nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        System.out.println("past Week Instant Time= "+pastWeekInstant);
        Instant pastWeekLocalInstant = d06.plus(7,ChronoUnit.DAYS);
        System.out.println("Next Week  Instant Time= "+pastWeekLocalInstant);


        //duração

        Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
        System.out.println("t1 dias = "+t1.toDays());

        Duration t2 = Duration.between(pastWeekLocaldate.atTime(0,0), d04.atTime(0,0));
        System.out.println("t2 dias = "+t2.toDays());

        Duration t3 = Duration.between(pastWeekLocaldate.atStartOfDay(), d04.atStartOfDay());
        System.out.println("t3 dias = "+t3.toDays());

        Duration t4 = Duration.between(pastWeekInstant,d06);
        System.out.println("t4 dias = "+t4.toDays());

        Duration t5 = Duration.between(d06,pastWeekInstant);
        System.out.println("t5 dias = "+t5.toDays());


    }
}
