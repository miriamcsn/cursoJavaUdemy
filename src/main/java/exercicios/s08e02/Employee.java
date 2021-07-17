package exercicios.s08e02;

public class Employee {

    // Classe criada para o exercício 02 da seção 08

    public String name;
    public double grossSalary, tax;


    public double netSalary() {
        return this.grossSalary - this.tax;
    }

    public void increaseSalary(double percentage) {
        this.grossSalary += this.grossSalary * (percentage / 100);
    }

}
