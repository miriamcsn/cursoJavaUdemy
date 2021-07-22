package teoria.interfaces.solucao01.model.services;

import teoria.interfaces.solucao01.model.entities.CarRental;
import teoria.interfaces.solucao01.model.entities.Invoice;

import java.time.Duration;
import java.time.format.DateTimeFormatter;

public class RentalService {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    private Double pricePerHour, pricePerDay;

    private BrazilTaxService brazilTaxService;
    // dependencia! o servico de aluguel depende do servico
    // de imposto do brasil para gerar a nota de pagamento

    // isso nao é uma boa prática, porque o nosso servico de aluguel fica dependendo,
    // exclusivamente, do BrazilTaxService.
    // qualquer alteração nesse cálculo, eu teria que alterar 2 pontos no meu servico.
    // se amanhã mudar a regra de imposto, e for por exemplo as regras de imposto
    // dos EUA... entao o -- 1º ponto de alteração -- seria criar uma nova classe USATaxService,
    // por exemplo, e na hora de instanciar (veja o construtor), eu teria que instanciar esse novo objeto,
    // usaTaxService. Depois disso, o -- 2º ponto de alteração -- seria alterar a classe RentalService
    // e colocar o novo atributo como private USATaxService usaTaxService.
    // em termos de manutençao, isso fica horrível, porque uma troca no servico de imposto te obriga
    // a abrir outras classes e alterar as existentes também.
    // Como evitar isso?  com INTERFACES! veja a solucao02 dentro da pasta interfaces!

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService brazilTaxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.brazilTaxService = brazilTaxService;
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

        Double tax = brazilTaxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }


}
