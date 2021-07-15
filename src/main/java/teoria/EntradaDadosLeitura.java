package teoria;

import java.util.Scanner;

public class EntradaDadosLeitura {

    public static void main(String[] args) {

		/*

		Scanner sc1 = new Scanner(System.in);

		// ler uma variável do tipo String

		String x;

		System.out.print("Digite uma palavra: ");

		x = sc1.next();

		System.out.println("Vc digitou: " + x);

//		sc1.close(); // temos que fechar os objetos Scanner instanciados. Regras do Java...



		// ler uma variável do tipo int

		Scanner sc2 = new Scanner(System.in);

		int z;

		System.out.print("Digite um número: ");

		z = sc2.nextInt();

		System.out.println("Vc digitou: " + z);

//		sc2.close();



		// ler uma variável do tipo char

		Scanner sc3 = new Scanner(System.in);

		char b;

		System.out.print("Digite um caracter: ");

		b = sc3.next().charAt(0);

		System.out.println("Vc digitou: " + b);

//		sc3.close();



		// ler uma variável do tipo double (ponto flutuante)

		Scanner sc4 = new Scanner(System.in);

		double w;

		System.out.print("Digite um número com UMA casa decimal separada por vírgula (PT-BR): ");

		w = sc4.nextDouble();

		System.out.println("Vc digitou: " + w); // esse print vai sair com o ponto no lugar
		// da vírgula porque ele é localidade-independente! para imprimir com a vírgula, seria:


		// System.out.printf("Você digitou: %.1f%n", w);

//		sc4.close();



		// convertendo para US - casa decimal com ponto
		// pra isso, temos que colocar o Locale.setDefault antes de instanciar o Scanner.

		Locale.setDefault(Locale.US);
		Scanner sc5 = new Scanner(System.in);

		double m;

		System.out.print("Digite um número com uma casa decimal separada por ponto (US): ");

		m = sc5.nextDouble();

		System.out.println("Vc digitou: " + m);

//		sc5.close();


		// pra ler vários dados na mesma linha:

		Scanner sc6 = new Scanner(System.in);

		String h;
		int l;
		double n;

		h = sc6.next();
		l = sc6.nextInt();
		n = sc6.nextDouble();

		System.out.println("Dados digitados:");
		System.out.println(h);
		System.out.println(l);
		System.out.println(n);


		// Para ler um texto (String) até a quebra de linha:

		Scanner sc7 = new Scanner(System.in);
		String s1, s2, s3;
		s1 = sc7.nextLine(); // lê a linha inteira
		s2 = sc7.nextLine();
		s3 = sc7.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		*/

        // caso você leia outra variável antes do nextline e
        // fique com uma quebra de linha pendente:

        Scanner sc8 = new Scanner(System.in);

        int g;
        String ss1, ss2, ss3;

        g = sc8.nextInt();
        // quando digitar o número e der enter,
        // ficará uma quebra de linha pendente

        sc8.nextLine(); // limpa o buffer de leitura

        ss1 = sc8.nextLine();
        ss2 = sc8.nextLine();
        ss3 = sc8.nextLine();

        System.out.println("DADOS DIGITADOS:");

        System.out.println(g);
        System.out.println(ss1);
        System.out.println(ss2);
        System.out.println(ss3);

        // ...

        System.out.println("é isso aí :)");

        sc8.close();
    }
}
