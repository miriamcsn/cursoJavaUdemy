package exercicios.dio;

public class Desafio20 {

    public static void main(String[] args) {

        System.out.println(calculaDistanciaBandaPercorre(1,1));
    }

    public static Integer calculaDistanciaBandaPercorre(Integer numeroRodadaEnsaios,Integer numeroShows) {
        int distanciaShow = 5250 * 2;
        // Quanto cada um anda para chegar ao ponto P:
        // Ana: 3 x 250 m = 750 m
        // Bia: 5 x 250 m = 1250 m
        // Cadu: 5 x 250 m = 1250 m
        // Duda: 3 x 250 m = 750 m
        // Edu: 3 x 250 m = 750 m
        // Fabi: 2 x 250 m = 500 m
        // Total: 5250 m para ir ao ponto P + 5350 pra voltar pra casa = 10500 m

        int distanciaPorRodadaEnsaio = 17500 * 2;
        // total percorrido por todos os integrantes indo ensaiar alternando as casas por 1 rodada completa.
        // Se o ensaio for na casa de:
        // Ana: 11 x 250 m = 2750 m
        // Bia: 13 x 250 m = 3250 m
        // Cadu: 11 x 250 m = 2750 m
        // Duda: 15 x 250 m = 3750 m
        // Edu: 9 x 250 m = 2250 m
        // Fabi: 11 x 250 m = 2750 m
        // Total: 17500 m pra ir e 17500 m pra voltar pra casa = 35000 m

        return (numeroRodadaEnsaios * distanciaPorRodadaEnsaio) + (numeroShows * distanciaShow);
    }
}

//import org.junit.Test;
//        import static org.junit.Assert.*;
//public class CalculaDistanciaBandaPercorreTests {
//    @Test
//    public void comUmaRodadaDeEnsaiosEUmShow() {
//        Integer expected0 = 45500;
//        Integer actual0 = Challenge.calculaDistanciaBandaPercorre(1,1);
//        assertEquals(expected0, actual0);
//    }
//}
