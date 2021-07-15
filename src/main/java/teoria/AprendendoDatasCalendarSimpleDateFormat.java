package teoria;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AprendendoDatasCalendarSimpleDateFormat {

    public static void main(String[] args) {

        // Evite isso porque é muito confuso! Prefira trabalhar com LocalDateTime - ver aula AprendendoLocalDate

        // Date()
        // Date(long date)  // ele usa como referencia um long que representa os milissegundos que se passaram desde 01 de janeiro de 1970 às 00:00:00

        Date agora = new Date();
        System.out.println("Date: " + agora);


  /*      Calendar agora = Calendar.getInstance();
        System.out.println(agora);
*/

/*
        String dateToStr = DateFormat.getInstance().format(newDate); // passou uma data para ela formatar - newDate
        System.out.println("DateFormat: " + dateToStr);  // pega o formato do sistema

*/

        SimpleDateFormat pattern = new SimpleDateFormat("dd/MM/yyy HH:mm:ss.SSS"); // S maiúsculo é o milisegundo
        String dataFormatada = pattern.format(agora);
        System.out.println("Data Formatada SimpleDateFormat: " + dataFormatada);
    }
}
