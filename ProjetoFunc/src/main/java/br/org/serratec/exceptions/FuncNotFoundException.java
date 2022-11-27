package br.org.serratec.exceptions;

public class FuncNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public FuncNotFoundException(Long id){
        super(id + "Não existe no banco!");
    }
    
}
