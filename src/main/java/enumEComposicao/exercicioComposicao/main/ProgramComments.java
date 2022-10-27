package enumEComposicao.exercicioComposicao.main;

import enumEComposicao.exercicioComposicao.entities.Comment;
import enumEComposicao.exercicioComposicao.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ProgramComments {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Comment c1 = new Comment("Have a nice Trip!");
        Comment c2 = new Comment("Wow that's awesome!");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);




      sc.close();



    }
}
