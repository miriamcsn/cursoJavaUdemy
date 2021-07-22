package exercicios.s17e01.application;

import exercicios.s17e01.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Secao17Exercicio01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the path of source .csv file: ");
        String sourcePath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        String sourceFolder = sourceFile.getParent();

//        String sourcePath = "/Users/miriam/javaUdemy/src/main/java/exercicios/s17e01/entities/source.csv";

        boolean success = new File(sourceFolder + "/out").mkdir();
//        System.out.println("Directory created successfully: " + success);

        String targetFilePath = sourceFile.getParent() + "/out/summary.csv";

        List<Product> products = new ArrayList<>();

        // ler o arquivo

        try (BufferedReader br = new BufferedReader(new FileReader(sourcePath))) {

            String line = br.readLine();

            while (line != null) {

                try {
                    String[] attributes = line.split(",");

                    String name = attributes[0];
                    Double price = Double.parseDouble(attributes[1]);
                    Integer quantity = Integer.parseInt(attributes[2]);

                    products.add(new Product(name, price, quantity));
                    line = br.readLine();

                } catch (NullPointerException e) {
                    System.out.println("Vector error: " + e);
                }
            }

            // escrever o resultado no novo arquivo

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFilePath))) {

                for (Product p : products) {
                    bw.write(p.getName());
                    bw.write(",");
                    bw.write(String.format("%.2f", p.total()));
                    bw.newLine();
                }
            }
            catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
            catch (Exception e) {
                System.out.println("An unknown error occurred: " + e.getMessage());
            }
        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        scanner.close();

    }
}
