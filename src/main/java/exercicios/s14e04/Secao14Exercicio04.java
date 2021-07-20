package exercicios.s14e04;

import exercicios.s14e04.entities.Pessoa;
import exercicios.s14e04.entities.PessoaFisica;
import exercicios.s14e04.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Secao14Exercicio04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int number = scanner.nextInt();

        for (int i=1; i<=number; i++) {

            scanner.nextLine();
            System.out.printf("Tax payer #%d data:%n", i);

            System.out.print("Individual or company (i/c)? ");
            char option = scanner.next().charAt(0);

            if (option == 'i') {

                scanner.nextLine();
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Anual income: ");
                Double rendaAnual = scanner.nextDouble();
                System.out.print("Health expenditures: ");
                Double gastosSaude = scanner.nextDouble();

                if (gastosSaude == 0) {
                    list.add(new PessoaFisica(name, rendaAnual));
                }
                else list.add(new PessoaFisica(name, rendaAnual, gastosSaude));
            }
            else if (option == 'c') {

                scanner.nextLine();
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Anual income: ");
                Double rendaAnual = scanner.nextDouble();
                System.out.print("Number of employees: ");
                Double numeroFunc = scanner.nextDouble();

                list.add(new PessoaJuridica(name, rendaAnual,numeroFunc ));
            }

        }
        System.out.println();
        System.out.println("TAXES PAID: ");

        Double sum = 0.0;
        for (Pessoa p : list) {
            sum += p.calculoImposto();
            System.out.println(
                    p.getName()
                            + ": $ "
                            + String.format("%.2f", p.calculoImposto()));
        }

        System.out.printf("%nTOTAL TAXES: $ %.2f%n", sum);

        scanner.close();

    }

}
