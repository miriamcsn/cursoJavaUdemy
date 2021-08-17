package exercicios.dio;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class Desafio15 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int signalOneCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> signalOne = IntStream.range(0, signalOneCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int signalTwoCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> signalTwo = IntStream.range(0, signalTwoCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int result = Desafio15.updateTimes(signalOne, signalTwo);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

//    public static void main(String[] args) {
//
//    }

    public static int updateTimes(List<Integer> signalOne, List<Integer> signalTwo) {

        int maxequal = 0;
        int updated = 0;

        for (int i = 0; i < signalOne.size(); i++) {

            if (Objects.equals(signalOne.get(i), signalTwo.get(i))) {
                if (maxequal < signalOne.get(i)) {
                    maxequal = signalOne.get(i);
                    updated++;
                } else {
                    maxequal = signalTwo.get(i);
                    updated++;
                }
            } else if (signalOne.get(i) > signalTwo.get(i)) {
                maxequal = signalOne.get(i);
                updated++;
            } else if (signalTwo.get(i) > signalOne.get(i)) {
                maxequal = signalTwo.get(i);
                updated++;
            }
            else {

            }
        }
        return updated;
    }
}