package exercicios.s08e03;

import java.util.Locale;
import java.util.Scanner;

public class Secao08Exercicio03 {

    /*
     * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres
     *  do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual
     *  a nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em
     *  caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota).
     * Você deve criar uma classe Student para resolver este problema.
     * */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Type the student's name: ");
        student.name = sc.nextLine();

        System.out.printf(
                "Type (separated by a single space) %s's grades from trimesters 1, 2, and 3, respectively: ",
                student.name);

        student.gradeT1 = sc.nextDouble();
        student.gradeT2 = sc.nextDouble();
        student.gradeT3 = sc.nextDouble();

        System.out.printf("%s%n %.2f%n %.2f%n %.2f%n",
                student.name, student.gradeT1, student.gradeT2, student.gradeT3);

        double finalGrade = student.calculateGrade();

        System.out.printf("Final grade = %.2f%n", finalGrade);

        double missingPoints;

        if (finalGrade >= 60) { System.out.println("Pass!"); }
        else {
            missingPoints = 60 - finalGrade;
            System.out.printf("Failed :( %nMissing %.2f points%n", missingPoints);
        }
    }
}
