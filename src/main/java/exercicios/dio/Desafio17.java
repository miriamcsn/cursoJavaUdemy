package exercicios.dio;

public class Desafio17 {

    public static void main(String[] args) {

        System.out.println(retornaTempoMinimoEmMinutos(2749,50,8));

    }

    public static Integer retornaTempoMinimoEmMinutos(Integer p,Integer s,Integer n) {

        int pessoasPorPortaoArredondadoParaCima = (p + n - 1) / n;
        return (int) Math.ceil(pessoasPorPortaoArredondadoParaCima * s / 60.0);
    }
}
