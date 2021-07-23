package teoria.datas;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ManipulandoLocalDatePeriod {

    public static void main(String[] args) {

/*
        LocalDate from = LocalDate.of(2020, 5, 4);
        LocalDate to = LocalDate.of(2020, 10, 10);

        Period period = Period.between(from, to);


        System.out.print(period.getYears() + " years, ");
        System.out.print(period.getMonths() + " months, ");
        System.out.print(period.getDays() + " days");
*/




        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Start date: ");
        LocalDate start = LocalDate.parse(scanner.nextLine(), formatter);

        LocalDate other = start.plusMonths(1);

//        System.out.println(start.format(formatter));
        System.out.println(other.format(formatter));



    }
}
