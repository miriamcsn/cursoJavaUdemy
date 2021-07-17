package exercicios.s13e02.application;

import exercicios.s13e02.entities.Comment;
import exercicios.s13e02.entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Secao13ExercicioFixacao02 {

    // Learning StringBuilder (implemented at class Post in toString method)
    // :: related classes: exercicios.s13e02.entities.Post, exercicios.s13e02.entities.Comment (see imports, it's easier!)

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Post p1 = new Post(LocalDateTime.parse(
                "21/06/2018 13:05:44", formatter),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow, that's awesome!");

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

        Post p2 = new Post(LocalDateTime.parse(
                "28/07/2018 23:14:19", formatter),
                "Good night guys",
                "See you tomorrow",
                5);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p2);

    }

}
