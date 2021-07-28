package teoria.lambda;

import teoria.set.entities.ProductSet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AprendendoExpressoesLambda04Function {

    public static void main(String[] args) {

        List<ProductSet> list = new ArrayList<>();

        list.add(new ProductSet("Tv", 900.00));
        list.add(new ProductSet("Mouse", 50.00));
        list.add(new ProductSet("Tablet", 350.50));
        list.add(new ProductSet("HD Case", 80.90));

        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList()); // inline

        // map é uma funcao INTERMEDIÁRIA que aplica outra funcao a todos os elementos
        // de uma stream (stream é uma sequencia de dados) e retorna os elementos transformados.
        // porem, a map só funciona em streams, nao funciona em listas...
        // por isso, temos que converter a List em stream primeiro, e dps re-converter pra List.

        // primeiro temos que pegar a List;
        // converter pra Stream: .stream;
        // aplicar a função;
        // converter de volta de Stream pra List: .collect(Collectors.toList())

        names.forEach(System.out::println); // chamei um consumer aqui :)
    }
}
