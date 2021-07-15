package exercicios;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Secao08Exercicio02 {

    /*
    * Fazer um programa para ler os dados de um funcionário
    *  (nome, salário bruto e imposto).
    * Em seguida, mostrar os dados do funcionário
    *  (nome e salário líquido). Em seguida, aumentar
    *  o salário do funcionário com base em uma porcentagem dada
    *  (somente o salário bruto é afetado pela porcentagem)
    *  e mostrar novamente os dados do funcionário.
     * */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        employee.name = sc.nextLine();

        employee.grossSalary = readDouble(sc);

        employee.tax = readDouble(sc);

        System.out.printf("Name: %s%nGross salary: %.2f%nTax: %.2f%n%n",
                employee.name, employee.grossSalary, employee.tax);


        System.out.printf("Employee: %s, $ %.2f%n%n",
                employee.name, employee.netSalary());

        System.out.print("Which percentage to increase salary? ");
        double percentage = readDouble(sc);

        employee.increaseSalary(percentage);

        System.out.printf("%nUpdated data: %s, $ %.2f%n",
                employee.name, employee.netSalary());

        sc.close();


    }

    public static double readDouble(Scanner sc) {

        double d = 0d;

        while (d == 0d) {

            try {
                d = sc.nextDouble();
            }
            catch (InputMismatchException ex) {
                System.out.println("Invalid numeric value. Type again:");
                sc.nextLine();
            }
            finally { System.out.println("Parabéns"); }
        }
        return d;
    }
}
