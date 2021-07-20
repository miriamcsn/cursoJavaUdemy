package exercicios.s15e02.exceptions;

public class AmountExceedsLimit extends Exception {

    public AmountExceedsLimit(String msg) {  // isso é um construtor, pois tem o mesmo nome da classe e nao tem retorno
        super(msg);
    }

}
