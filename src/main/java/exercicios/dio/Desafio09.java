package exercicios.dio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Desafio09 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int quantidadeTartarugas;
        do {
            quantidadeTartarugas = Integer.parseInt(br.readLine());
            String tartarugasVelocidades[] = br.readLine().split(" ");
            int maiorVelocidade = Integer.parseInt(tartarugasVelocidades[0]);

            for (int i = 1; i < quantidadeTartarugas; i++) {
                int velocidadeCadaTartaruga = Integer.parseInt(tartarugasVelocidades[i]);

                if (velocidadeCadaTartaruga > maiorVelocidade){
                    maiorVelocidade = velocidadeCadaTartaruga;
                }
            }

            if (maiorVelocidade < 10) {
                System.out.println("1");
            } else if (maiorVelocidade > 10 && maiorVelocidade < 20) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        } while (br.ready());
    }
}