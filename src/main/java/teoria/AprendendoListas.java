package teoria;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AprendendoListas {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        // <> => generics | arraylist pega as boas caract de arrays e vetores

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        list.add(2, "Marco");  // "desce" o Bob 1 posição e coloca o Marco no lugar

        //list.remove("Anna");
        //list.remove(1);

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println(list.size());

        // Para remover to do mundo que começa com a letra M:
        list.removeIf(x -> x.charAt(0) == 'M');
        //lê-se: remova x se o primeiro caracter de X começar com M -- Maria e Marco
        // isso é chamado predicado; é um tipo de função lambda


        System.out.println("----------------------");
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println(list.size());

        System.out.println("----------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));  // retorna o index do elemento
        System.out.println("Index of Marco: " + list.indexOf("Marco"));  // não existe, então retorna -1

        /*
         * Vamos supor que vc queira filtrar todos os elementos que começam com A.
         * Para fazer isso, temos que declarar uma nova lista que receba os elementos filtrados.
         * Primeiro, temos que converter para o tipo stream() a lista original que contém os elementos
         * a serm filtrados. Esse tipo, stream(), aceita operações com expressoes lambda.
         * a função filter vai filtrar algo que vc passa como parâmetro e no caso colocamos a expressao lambda.
         * dai apos filtrar, ele retorna um stream - so que o stream não é compatível com o tipo list.
         * então tem q ser feita a conversao pela funcao collect que converte para o tipo Lista.
         * */

        System.out.println("----------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        System.out.println("----------------------");
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("----------------------");

        /*Suponha que você quer encontrar qual é o primeiro elemento da lista que comece com a letra A. */
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

        System.out.println(name);
        // retorna Alex (1a ocorrencia de um nome com a letra A)
        // se colocar um caracter q nao encontre um objeto ("J" por exemplo), retorna null
    }
}
