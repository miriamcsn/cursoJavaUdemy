package exercicios.s13e01.entities;

import exercicios.s13e01.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    // fazendo a composição dos objetos (conforme diagrama UML no material do professor):

    private Department department;
    // um trabalhador tem apenas um departamento

    private List<HourContract> contracts = new ArrayList<>();
    // um trabalhador pode ter vários contratos, por isso uma lista!
    // já iniciamos a lista vazia aqui porque listas não são passadas nos construtores.


    // construtores

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
        // repare que não incluí a lista de contratos no construtor!
    }


    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

/*
    public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts;
    }  // não podemos deixar esse setter porque a lista de contratos nao pode ser alterada livremente
*/

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance(); // cal recebe a data atual

        for (HourContract c : contracts) {
            cal.setTime(c.getDate());  //  troquei a data atual pela data do contrato, que peguei pelo getDate
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH); // tem q colocar +1 porque o mês do Calendar começa com zero (??)
            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }

}
