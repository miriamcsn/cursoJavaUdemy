package exercicios.s15e02.exceptions;

public class NotEnoughBalance extends Exception {

    public NotEnoughBalance(String msg) {  // isso é um construtor, pois tem o mesmo nome da classe e nao tem retorno
        super(msg);
    }

}
