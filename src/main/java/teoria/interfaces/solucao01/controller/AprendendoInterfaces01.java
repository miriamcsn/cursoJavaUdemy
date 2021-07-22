package teoria.interfaces.solucao01.controller;

import teoria.interfaces.solucao01.model.entities.CarRental;
import teoria.interfaces.solucao01.model.entities.Invoice;
import teoria.interfaces.solucao01.model.entities.Vehicle;
import teoria.interfaces.solucao01.model.services.BrazilTaxService;
import teoria.interfaces.solucao01.model.services.RentalService;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class AprendendoInterfaces01 {

    public static void main(String[] args) throws ParseException {

        // solução 01 - sem interface
        // nessa solucao, criamos uma DEPENDENCIA entre RentalService e BrazilTaxService,
        // ou seja, o serviço de aluguel DEPENDE do serviço de imposto do brasil para gerar
        // a nota fiscal (invoice).

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

        // aqui já posso instanciar o objeto do tipo CarRental, sem informar o invoice

        CarRental carRental = new CarRental(start, finish, new Vehicle(model));

        System.out.print("Enter price per hour: ");
        Double pricePerHour = scanner.nextDouble();

        System.out.print("Enter price per day: ");
        Double pricePerDay = scanner.nextDouble();

        // agora já podemos instanciar o serviço de aluguel (RentalService)

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        // dá pra instanciar serviço sem informar nenhum argumento, como fiz com BrazilTaxService().

        rentalService.processInvoice(carRental);

        System.out.println(carRental.getInvoice().toString());

        scanner.close();
    }
}
