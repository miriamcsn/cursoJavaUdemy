package teoria.hashcodes;

import teoria.hashcodes.entities.Client;

public class AprendendoHashCodes {

    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = "Test";
        String s2 = "Test";


        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2)); // true
        // equals() compara o CONTEÚDO dos objetos
        System.out.println(c1 == c2); // false
        // o == compara a REFERÊNCIA DE MEMÓRIA dos objetos.
        // apesar de terem o mesmo conteúdo, são dois objetos DIFERENTES.

        System.out.println();
        System.out.println(s1 == s2); // true
        // Uai, por que??
        // Porque quando iniciamos variáveis informando de forma literal o seu conteúdo,
        // como fiz atribuindo manualmente "Teste" à variável, o compilador trata isso de maneira diferente
        // àquela que ele usa para tratar objetos.

        // Agora, se eu fizesse como abaixo, seria diferente:

        String s3 = new String("Teste");
        String s4 = new String("Teste");
        System.out.println();
        System.out.println(s3 == s4); // false
        // Agora o compilador está tratando s3 e s4 como objetos do tipo String!
        // e são objetos diferentes, apesar de terem o mesmo conteúdo.
    }
}
