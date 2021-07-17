package exercicios.s10e01.application;

import exercicios.s10e01.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Secao10ExercicioFixacao01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("How many rooms will be rented? ");
        int n = scanner.nextInt();  // nesse nextint a quebra de linha ficou pendente

        Student[] students = new Student[10];

        for (int i=1; i<=n; i++) {
            scanner.nextLine(); // consumindo a quebra de linha que ficou pendende do nextint

            System.out.printf("%nRent #%d%n", i);

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Room: ");
            int room = scanner.nextInt();

            students[room] = new Student(name, email);
        }
        System.out.println("Busy rooms:");

        for (int i=0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.printf("%d: %s, %s%n",
                        i, students[i].getName(), students[i].getEmail());
            }
        }
    }
}
