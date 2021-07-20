package exercicios.s15e01.exceptions;

import java.io.Serial;

public class BusinessException extends Exception {

    @Serial
    private static final long serialVersionUID = 2L;

    public BusinessException(String msg) {  // isso é um construtor, pois tem o mesmo nome da classe e nao tem retorno
        super(msg);
    }

}
