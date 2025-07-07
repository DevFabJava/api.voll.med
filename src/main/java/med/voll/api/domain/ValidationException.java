package med.voll.api.domain;

public class ValidationException extends RuntimeException{

    public ValidacaoException(String mensagem){
        super(mensagem);
    }
}
