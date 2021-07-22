package teoria.datas;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ManipulandoLocalDateTimeChronoUnit {

    public static void main(String[] args) {

        LocalDateTime from = LocalDateTime.of
                (2020, 10, 4,10, 20, 55);
        LocalDateTime to = LocalDateTime.of
                (2020, 11, 10,10, 21, 1);

        long years = ChronoUnit.YEARS.between(from, to);
        long months = ChronoUnit.MONTHS.between(from, to);
        long weeks = ChronoUnit.WEEKS.between(from, to);
        long days = ChronoUnit.DAYS.between(from, to);
        long hours = ChronoUnit.HOURS.between(from, to);
        long minutes = ChronoUnit.MINUTES.between(from, to);
        long seconds = ChronoUnit.SECONDS.between(from, to);
        long milliseconds = ChronoUnit.MILLIS.between(from, to);
        long nano = ChronoUnit.NANOS.between(from, to);

        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.println(weeks + " weeks");
        System.out.println(days + " days");
        System.out.println(hours + " hours");
        System.out.println(minutes + " minutes");
        System.out.println(seconds + " seconds");
        System.out.println(milliseconds + " milliseconds");
        System.out.println(nano + " nano");

    }
}
