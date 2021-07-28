package teoria.map;

import java.util.Map;
import java.util.TreeMap;

public class AprendendoMap01 {

    // coleçao de pares chave/valor
    // nao admite repeticoes do objeto chave
    // indexados pelo objeto chave (nao existe posicao em um map!)
    // acesso, insercao, remocao de elementos: RAPIDO!

    // HashMap, TreeMap, LinkedHashMap

    public static void main(String[] args) {


        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "998239421");

        cookies.remove("email");

        cookies.put("phone", "8276829328");
        // entradas repetindo a chave sobrescrevem o valor que ja tem no map


        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        // retorna um boolean

        System.out.println("Value of 'phone' key: " + cookies.get("phone"));
        // retorna o valor associado àquela chave

        System.out.println("Value of inexistent 'email' key: " + cookies.get("email"));
        // retorna null pq a chave nao existe

        System.out.println("Map lenght: " + cookies.size());

        System.out.println("ALL COOKIES:");

        for(String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }


    }

}
