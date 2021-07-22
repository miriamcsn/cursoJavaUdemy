package teoria.datas;
import java.time.LocalDate;
import java.time.Period;

public class ManipulandoLocalDatePeriod {

    public static void main(String[] args) {

        LocalDate from = LocalDate.of(2020, 5, 4);
        LocalDate to = LocalDate.of(2020, 10, 10);

        Period period = Period.between(from, to);

        System.out.print(period.getYears() + " years, ");
        System.out.print(period.getMonths() + " months, ");
        System.out.print(period.getDays() + " days");

    }
}
