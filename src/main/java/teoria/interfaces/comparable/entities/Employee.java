package teoria.interfaces.comparable.entities;

import org.jetbrains.annotations.NotNull;

public class Employee implements Comparable<Employee> {
    // a interface comparable permite comparar objetos.
    // basta implementar seu método compareTo!
    // retorna um int negativo quando o objeto vem antes; positivo quando vem dps; zero quando é igual.

    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(@NotNull Employee outro) {
//        return name.compareTo(outro.getName());
// compara o nome de um funcionário com o de outro

        return -name.compareTo(outro.getName());
// compara o nome de um funcionário com o de outro e retorna em ordem decrescente

//        return salary.compareTo(outro.getSalary());
// compara o salario de um funcionário com o de outro

//        return -salary.compareTo(outro.getSalary());
        // compara o salario de um funcionário com o de outro e retorna em ordem decrescente

    }
}
