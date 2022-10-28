package excecao.model.exceptions;

import java.io.Serial;

public class DomainException extends Exception {
    //Domain Exeption será uma exceção lançada por algum erro na minha entidade de dominio que é o ReservatonSoluçãoBoa
    //é apenas uma convenção poderia ser outro nome

    //Exception é um tipo serializable e ela precisa ter um numero de versão, ou seja classes serializables
    //seus objetos podem ser convertidos para bytes e assim trafegar em rede, ser gravados em arquivos etc.
    @Serial
    private static final long serialVersionUID=1L;//1L é o valor padrão de srializable

    public  DomainException(String msg){
        super(msg);
    }
}
