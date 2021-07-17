package exercicios.s13e01.entities;

import exercicios.s13e01.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WorkerV2 {

    // teste usando LocalDate ao invés do Calendar pra ver se dá certo

    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;
    private List<HourContractV2> contracts = new ArrayList<>();

    public WorkerV2() {
    }

    public WorkerV2(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }


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

    public List<HourContractV2> getContracts() {
        return contracts;
    }


    public void addContract(HourContractV2 contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContractV2 contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;

        for (HourContractV2 c : contracts) {

            LocalDate date = c.getDate();
            int c_year = date.getYear();
            int c_month = date.getMonthValue();
            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }


}
