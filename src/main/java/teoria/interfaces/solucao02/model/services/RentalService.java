package teoria.interfaces.solucao02.model.services;

import teoria.interfaces.solucao01.model.entities.CarRental;
import teoria.interfaces.solucao01.model.entities.Invoice;

import java.time.Duration;
import java.time.format.DateTimeFormatter;

public class RentalService {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    private Double pricePerHour, pricePerDay;

    private TaxService taxService;
    // agora, RentalService depende de TaxService, que é uma interface genérica.
    // dessa forma, a classe RentalService nao precisa saber qual é o método de cálculo de imposto implementado.
    // delegou isso para a Interface criada!
    // assim, "fechamos" a classe RentalService para alterações e deixamos ela mais protegida e eficiente!
    // se amanhã a regra de imposto mudar, eu não preciso mais mexer nessa classe.

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {

        // método responsável por gerar a nota fiscal do aluguel do carro

        // nessa versao, o prof fez aquele calculo bizarro em milissegundos.
        // mas ele quer o valor em horas.
        // entao adaptei pra LocalDateTime para fazer um cálculo menos bizarro.

        // preciso da diferença em HORAS. Pra calcular, vou usar a classe Duration (exemplo abaixo):

/*
        Duration duration = Duration.between(date1, date2);

        // days between from and to
        System.out.println(duration.toDays() + " days");

        // hours between from and to
        System.out.println(duration.toHours() + " hours");
*/


        Duration duration = Duration.between(carRental.getStart(), carRental.getFinish());
        Double hours = (double) duration.toMinutes() / 60; // pra pegar valores quebrados
        // convertendo Long pra Double, mas como duration retorna um long primitivo,
        // o casting inicial tem que ser double primitivo tb

        Double basicPayment;
        if (hours <= 12.0) {
            basicPayment = Math.ceil(hours) * pricePerHour;
            // Math.ceil arredonda um double pra cima
            // se passar 1 min da hora ja conta +1 hora
        } else {
            basicPayment = Math.ceil(hours / 24) * pricePerDay;
            // aqui, dividi por 24 pra dar o número de dias, tb arredondado pra cima
        }

        // quando se trata de diária:
        // até 12h -- pagamento por hora; a partir de 12h 1min - diária.
        // OBS: 24h - 1 diária; 24h 1min - 2 diárias.

        Double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }

}
