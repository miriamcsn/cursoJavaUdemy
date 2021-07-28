package exercicios.s19e01;

import exercicios.s19e01.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class Secao19Exercicio01 {

    public static void main(String[] args) throws IOException {

        // fazer outra versão desse programa pra entrar com Date, e dps converter e manipular com LocalDateTime
        // a data está no formato ISO 8601

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        // /Users/miriam/javaUdemy/src/main/java/exercicios/s19e01/log.txt
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Set<LogEntry> set = new HashSet<>(); // mais rápido e não importa a ordem.

            String line = br.readLine();

            while (line != null) {

                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new LogEntry(username, moment));

                line = br.readLine();
            }
            System.out.println("Total users: " + set.size());
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
