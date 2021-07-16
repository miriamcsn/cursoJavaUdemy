package teoria;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class AprendendoLocalDate {

    public static void main(String[] args) {

        //
        // SimpleDateFormat pattern = new SimpleDateFormat("dd/MM/yyy HH:mm:ss.SSS");

        LocalDate today = LocalDate.now();
        System.out.println(today);

        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String text = today.format(formatters);
        System.out.println(text);

        LocalDate parsedDate = LocalDate.parse(text, formatters);

        int month = parsedDate.getMonthValue();
        int year = parsedDate.getYear();
        int day = parsedDate.getDayOfMonth();

        System.out.printf("Dia %d, mês %d, ano %d.%n", day, month, year);
        System.out.println(parsedDate);


        //System.out.println(hoje.get(ChronoField.YEAR));


        /*System.out.println("Hoje: " + hoje);

        LocalDate ontem = hoje.minusDays(1);
        System.out.println("Ontem: " + ontem);

        LocalTime agora = LocalTime.now();
        System.out.println("Hora agora: " + agora);

        LocalTime daquiUmaHora = agora.plusHours(1);
        System.out.println("Daqui uma hora: " + daquiUmaHora);

        LocalDateTime aquiAgora = LocalDateTime.now();
        System.out.println("Hoje e agora: " + aquiAgora);

        LocalDateTime futuro = aquiAgora.plusHours(1).plusDays(1).plusYears(4);
        System.out.println("Daqui 4 anos, 1 dia e 1 hora: " + futuro);*/
    }
}
