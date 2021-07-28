package exercicios.s20e02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import exercicios.s20e02.entities.Employee;

public class Secao20Exercicio02 {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
// /Users/miriam/javaUdemy/src/main/java/exercicios/s20e02/funcionarios.csv
        String path = sc.nextLine();

        System.out.print("Enter a value to filter employees by salary: ");  // colocar 2000
        Double value = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> list = new ArrayList<>();

            String line = br.readLine();

            while (line != null) {

                String[] fields = line.split(",");

                try {
                    list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Invalid array position: " + e.getMessage());
                }
                line = br.readLine();
            }

            Comparator<String> comp = Comparator.comparing(String::toUpperCase);

            List<String> filtered = list.stream()
                    .filter(e -> e.getSalary() > value)
                    .map(Employee::getEmail)
                    .sorted(comp)
                    .collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than 2000.00:");
            filtered.forEach(System.out::println);

            Double salaries = list.stream()
                    .filter(e -> e.getName().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);

            System.out.println("Sum of salary of people whose name starts with 'M': " + salaries);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
