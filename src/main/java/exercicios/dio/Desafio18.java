package exercicios.dio;

public class Desafio18 {

    public static void main(String[] args) {
        System.out.println(retornaPessoasPreferemUmUnicoPalco(9999));
//        System.out.println(retornaPessoasNaoGostamNenhumPalco(10000));
    }

    public static Integer retornaPessoasPreferemUmUnicoPalco(Integer quantidadePessoasEvento) {

        int intABC = 3; // 3% = intABC
        int intAB = 17; // 20% - intABC = 17%
        int intAC = 15; // 18% - intABC = 15%
        int intBC = 7; // 10% - intABC = 7%
        double somenteA = quantidadePessoasEvento * (45.0 - intAB - intAC - intABC) / 100.0;
        double somenteB = quantidadePessoasEvento * (33.0 - intAB - intBC - intABC) / 100.0;
        double somenteC = quantidadePessoasEvento * (34.0 - intAC - intBC - intABC) / 100.0;
        int nenhumPalco = (int) (quantidadePessoasEvento - somenteA - somenteB - somenteC - intAB - intAC - intBC - intABC);
        return (int) (somenteA + somenteB + somenteC);
    }

//    public static Integer retornaPessoasNaoGostamNenhumPalco(Integer quantidadePessoasEvento) {
//    }
}
