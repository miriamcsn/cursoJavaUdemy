package exercicios.s15e01.exceptions;

import java.io.Serial;

public class DomainException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {  // isso é um construtor ou um método?????
        super(msg);   // não entendi esse super
    }
}
