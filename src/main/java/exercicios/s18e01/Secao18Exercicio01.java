package exercicios.s18e01;

import exercicios.s18e01.entities.Contract;
import exercicios.s18e01.entities.Installment;
import exercicios.s18e01.services.ContractService;
import exercicios.s18e01.services.PaypalService;
import teoria.interfaces.solucao01.model.entities.CarRental;
import teoria.interfaces.solucao01.model.entities.Vehicle;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Secao18Exercicio01 {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter contract data:");
        System.out.print("Number: ");
        Integer number = scanner.nextInt();

        scanner.nextLine(); // consumindo a quebra de linha do nextInt()

        System.out.print("Contract date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(scanner.nextLine(), formatter);

        System.out.print("Contract value: ");
        Double amount = scanner.nextDouble();

        System.out.print("Enter number of installments: ");
        Integer months = scanner.nextInt();


        Contract contract = new Contract(number, date, amount);

        ContractService cs = new ContractService(new PaypalService());

        cs.processContract(contract, months);

        System.out.println("Installments:");

        for (Installment i : contract.getInstallments()) {
            System.out.println(i);
        }

        scanner.close();
    }
}
