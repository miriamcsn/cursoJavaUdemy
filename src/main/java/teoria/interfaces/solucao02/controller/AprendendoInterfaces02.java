package teoria.interfaces.solucao02.controller;

import teoria.interfaces.solucao01.model.entities.CarRental;
import teoria.interfaces.solucao01.model.entities.Vehicle;
import teoria.interfaces.solucao01.model.services.BrazilTaxService;
import teoria.interfaces.solucao01.model.services.RentalService;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class AprendendoInterfaces02 {

    public static void main(String[] args) throws ParseException {

        // solução 02 - com interface
        // nessa solucao, criamos uma interface TaxService que vai se colocar entre
        // RentalService e BrazilTaxService, ou seja, o serviço de aluguel dependerá da
        // interface TaxService, que vai conter um método tax() sem implementaçao.
        // Dai, todas as classes que derivarem dela serao obrigadas a implementar esse método tax,
        // de forma muito similar ao que acontece nas classes abstratas.
        // ***** nesse momento, estamos deixando o nosso sistema mais flexivel e desacoplado! *****
        // vou ter também a classe concreta BrazilTaxService, que implementa a interface TaxService
        // calculando o imposto do brasil para gerar a nota fiscal (invoice).

        // CAMADAS:
        // camada de domínio: tem as entidades do negócio
        // camada de serviço:  que contem serviços que realizam operaçoes no meu negócio


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rental data:");
        System.out.print("Car model: ");
        String model = scanner.nextLine();

        System.out.print("Pickup date (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), formatter);

        System.out.print("Return date (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), formatter);

        CarRental carRental = new CarRental(start, finish, new Vehicle(model));

        System.out.print("Enter price per hour: ");
        Double pricePerHour = scanner.nextDouble();

        System.out.print("Enter price per day: ");
        Double pricePerDay = scanner.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        // aqui a gente deixa BrazilTaxService mesmo, porque essa classe é um subtipo de TaxService (que está no construtor)
        // aí, instanciando uma BrazilTaxService, ele faz um upcasting pra TaxService e funcionará perfeitamente.
        // se eu tiver que mudar a regra de imposto, eu só mudo aqui pra outra classe que também
        // implemente TaxService, como por exemplo, new USATaxService() =)

        // ISSO SE CHAMA INVERSÃO DE CONTROLE E INJEÇÃO DE DEPENDÊNCIA POR MEIO DE CONSTRUTOR

        // veja o slide numero 10 da aula secao18-interfaces.pdf ou veja o video 196 pra entender melhor

        // ou seja,
        // quem está instanciando a classe concreta é o meu programa principal, através do construtor.
        // a classe RentalService nao se preocupa com o tipo de objeto que ela está recebendo,
        // contando que seja do tipo TaxService :)
        // por isso, no programa principal, ao instanciar o objeto RentalService usando
        // new BrazilTaxService() no construtor, estamos fazendo automaticamente um UPCASTING desse objeto
        // para TaxService (que é o tipo que consta no construtor de RentalService).
        // -- TaxService(): genérico
        // -- BrazilTaxService(): tipo específico e mais concreto

        // Dessa forma, no programa principal, eu poderia passar no construtor de RentalService
        // QUALQUER CLASSE que implemente TaxService que daria certo (EUATaxService, ChileTaxService etc).
        // isso é a INJEÇÃO DE DEPENDÊNCIA POR MEIO DE CONSTRUTOR
        // O objeto de servico de imposto, o qual RentalService depende, é instanciado por outro lugar,
        // no caso, o programa principal, e essa instancia será injetada em RentalService por meio desse construtor.
        // isso é a INVERSÃO DE CONTROLE
        // que é um padrão de desenvolvimento que consiste em retirar da classe a responsabilidade
        // de instanciar suas dependências.


        // a injeção de dependencia é uma forma de realizar a inversão de controle: um
        // componente externo instancia a dependência, que é então injetada no objeto "pai".
        // Pode ser implementada de várias formas:
        //• Construtor
        //• Classe de instanciação (builder / factory)
        //• Container / framework



        rentalService.processInvoice(carRental);

        System.out.println(carRental.getInvoice().toString());

        scanner.close();
    }
}
