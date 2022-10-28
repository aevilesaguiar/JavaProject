package excecao.exercicio.model.exceptions;

import java.io.Serial;

public class BussinessException extends RuntimeException{
    @Serial
    private static  final long serialVersionUID=1L;

    public BussinessException(String msg){
        super(msg);
    }
}
