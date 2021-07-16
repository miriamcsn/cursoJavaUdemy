package exercicios;

import exercicios.entities.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Secao10ExercicioFixacao02 {

    public static void main(String[] args) {

        /*
        * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario)
        * de N funcionários. Não deve haver repetição de id. Em seguida, efetuar o aumento de
        *  X por cento no salário de um determinado funcionário. Para isso, o programa deve ler
        * um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação.
        *  Ao final, mostrar a listagem atualizada dos funcionários, conforme exemplos. Lembre-se de aplicar
        * a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente.
        * Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.
        * */


        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        Integer number = scanner.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 1; i <= number; i++) {

            System.out.printf("%nEmployee #%d:%n", i);
            System.out.print("ID: ");

            Integer id = scanner.nextInt();

            while ((id < 0) || hasID(employees, id)) {
                // while id is a negative number or already exists in list employees:
                System.out.print("Invalid or repeated ID. Type again: ");
                id = scanner.nextInt();
            }

            scanner.nextLine();  // consuming line break

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            Double salary = readDouble(scanner);
            // idem aqui pras wrapper classes

            Employee emp = new Employee(name, id, salary);
/*
            // aqui estou criando um objeto da classe Employee, recebendo os parâmetros name, id e salary.
            // esse objeto terá um endereço de memória.
            // a variável emp, que é da classe (ou tipo) Employee, apontará para o endereço de memória
            // do objeto recem-criado.
*/
            employees.add(emp);

            // essa lista estoca as variáveis que apontam para os endereços de memória onde os objetos
            // do tipo Employee foram criados.

        }

        System.out.println();
        System.out.print("Enter the employee ID that will have a salary increase: ");
        Integer idSalary = scanner.nextInt();

/*
        // SOLUTION 1 -- using the function "position" to get the employee's id

        Integer pos = position(employees, idSalary);

        if (pos == null) {
            System.out.println("This ID does not exist.");
        } else {
            System.out.println("Enter the percentage: ");
            Double percentage = readDouble(scanner);
            employees.get(pos).salaryIncrease(percentage);
        }
*/

        // SOLUTION 2 - using lambda expression ("predicado" in portuguese)

        Employee emp = employees.stream()
                .filter(x -> x.getId().equals(idSalary))
                .findFirst()
                .orElse(null);
        // nessa linha, estou criando uma variável emp do tipo Employee que referencia (aponta para) um objeto
        // existente que tenha o mesmo id que digitei (idSalary); caso não encontre, recebe o valor null
        // só se cria objeto com new (instanciar) ou com Factory Methods! Isso que criei aí em cima é uma VARIÁVEL

        // o predicate (predicado) é o que está depois da setinha; é uma expressão que retorna true or false

/*
        List<Employee> employeeList = employees.stream()
                .filter(x -> x.getName().equals("Daniel"))
                .sorted(Comparator.comparingInt(Employee::getId))
                .collect(Collectors.toList());
*/

/*
        List<String> names = employees.stream()
                .map(x -> x.getName())
                .collect(Collectors.toList());
        // manipulei a lista para extrair os nomes de todos os funcionários
*/

        if (emp == null) {
            System.out.println("This ID does not exist.");
        } else {
            System.out.print("Enter the percentage: ");
            Double percentage = readDouble(scanner);
            emp.salaryIncrease(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");

        for (Employee instance :
             employees) {
            System.out.println(instance);
        }

        scanner.close();
    }

    /*
    // PART OF SOLUTION 1; UNCOMMENT IN ORDER TO MAKE SOLUTION #1 TO WORK
    public static Integer position(List<Employee> employees, int id) {
        for (int i=0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }*/

    public static double readDouble(Scanner sc) {
        double d = 0d;
        while (d == 0d) {
            try {
                d = sc.nextDouble();
            }
            catch (InputMismatchException ex) {
                System.out.print("Invalid numeric value. Type again: ");
                sc.nextLine();
            }
        }
        return d;
    }

    public static boolean hasID(List<Employee> list, int id) {
        Employee employee = list.stream()
                .filter(x -> x.getId().equals(id))
                .findFirst()
                .orElse(null);
        return employee != null;
        // returns "true" if the lambda expression finds an existing employee's id :)
    }
 }
