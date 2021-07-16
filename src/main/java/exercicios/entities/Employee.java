package exercicios.entities;

public class Employee {

    // classe criada para complementar Secao10ExercicioFixacao02

    private String name;
    private final int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

/*    public void setId(Integer id) {
        this.id = id;
    }*/

    public Double getSalary() {
        return salary;
    }

    public void salaryIncrease(Double percentage) {
        salary += salary * percentage / 100;
    }

    @Override
    public String toString() {
        return 	id
                + ", "
                + name
                + ", "
                + String.format("%.2f", salary);
    }

}