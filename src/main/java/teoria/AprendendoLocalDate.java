package teoria;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class AprendendoLocalDate {

    public static void main(String[] args) {


        SimpleDateFormat pattern = new SimpleDateFormat("dd/MM/yyy HH:mm:ss.SSS");

        LocalDate hoje = LocalDate.now();
        System.out.println("Hoje: " + hoje);

        LocalDate ontem = hoje.minusDays(1);
        System.out.println("Ontem: " + ontem);


        LocalTime agora = LocalTime.now();
        System.out.println("Hora agora: " + agora);


        LocalTime daquiUmaHora = agora.plusHours(1);
        System.out.println("Daqui uma hora: " + daquiUmaHora);


        LocalDateTime aquiAgora = LocalDateTime.now();
        System.out.println("Hoje e agora: " + aquiAgora);

        LocalDateTime futuro = aquiAgora.plusHours(1).plusDays(1).plusYears(4);
        System.out.println("Daqui 4 anos, 1 dia e 1 hora: " + futuro);


    }

}
