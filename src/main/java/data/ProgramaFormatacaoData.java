package data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ProgramaFormatacaoData {
    public static void main(String[] args) {

        //transformar data e hora em um formato customizado
        LocalDate d04 = LocalDate.parse("2022-10-27");
        LocalDateTime d05 = LocalDateTime.parse("2022-10-27T01:30:26");
        Instant d06 = Instant.parse("2022-10-27T09:37:26Z");


        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("d04= "+d04.format(fmt1));
        System.out.println("d04= "+fmt1.format(d04));
        System.out.println("d04= "+d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));


        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("d05= "+d05.format(fmt1));
        System.out.println("d05= "+d05.format(fmt2));

        //imprimir instant em formato customizado
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());//pegou o fuso horario padrão do usuario
        System.out.println("d06= "+fmt3.format(d06));

        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
        System.out.println("d06= "+d05.format(fmt4));
        System.out.println("d06= "+fmt5.format(d06));
    }
}
