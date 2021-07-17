package exercicios.dio;

import java.io.*;
import java.util.*;

public class Desafio09 {

    // incompleto... ainda estou aprendendo a como resolvê-lo!

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        do {
            int number = readInteger(sc);
            List<Integer> vels = readString(sc, number);
            Integer max = checkTurtles(vels);
            System.out.println(max);

        } while (sc.hasNext());
    }


    public static Integer readInteger(Scanner sc) {
        Integer d = null;
        while (d == null || d < 1 || d > 500) {
            try {
                System.out.print("Type a valid Integer value: ");
                d = sc.nextInt();
            }
            catch (InputMismatchException ex) {
                System.out.println("Invalid Integer value. Type again.");
                sc.next();
            }
        }
        return d;
    }

    public static List<Integer> readString(Scanner sc, int number) {

        List<Integer> vels = new ArrayList<>();
        int max, min;

        do {
            sc.next();
            System.out.printf("Digite %d números separados por espaço:%n", number);
            // printa mas não deixa eu digitar, já entra na linha 50 e joga uma exceção -- ainda aprendendo a resolver!
            String reading = sc.nextLine();
            vels.add(Integer.valueOf(Arrays.toString(reading.split(" "))));

            max = vels.stream().max(Integer::compare).get();
            min = vels.stream().min(Integer::compare).get();

        } while (vels.size() != number || max > 50 || min < 1);

        return vels;
    }

    public static Integer checkTurtles(List<Integer> vels) {

        return vels.stream().max(Integer::compare).get();

    }
}