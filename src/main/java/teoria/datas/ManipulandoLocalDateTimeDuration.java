package teoria.datas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ManipulandoLocalDateTimeDuration {

    public static void main(String[] args) {

/*
        LocalDateTime from = LocalDateTime.of
                (2020, 10, 4,10, 20, 55);
        LocalDateTime to = LocalDateTime.of
                (2020, 10, 10,10, 21, 1);

        Duration duration = Duration.between(from, to);

        // days between from and to
        System.out.println(duration.toDays() + " days");

        // hours between from and to
        System.out.println(duration.toHours() + " hours");

        // minutes between from and to
        System.out.println(duration.toMinutes() + " minutes");

        // seconds between from and to (there are two methods for this)
        System.out.println(duration.toSeconds() + " seconds");
        System.out.println(duration.getSeconds() + " seconds");
*/

/* LocalDateTime
    // Entrada pelo teclado:

    LocalDateTime variable = LocalDateTime.parse(scanner.next(), formatter);

    // Fazendo o parse de uma variavel do tipo LocalDateTime pro formatter que eu quiser:

    LocalDateTime.parse(variable, formatter); ou

    // Definindo uma LocalDateTime manualmente:
    LocalDateTime variable = LocalDateTime.of(2020, 10, 4,10, 20, 55);
*/

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Start date: ");
        LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), formatter);

        System.out.print("Finish date: ");
        LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), formatter);

        Duration duration = Duration.between(start, finish);
        Double hours = (double) duration.toMinutes() / 60; // pra pegar valores quebrados

        System.out.println(hours);
        System.out.println(Math.ceil(hours)); // hours arredondado pra cima com minutos quebrados








    }
}
