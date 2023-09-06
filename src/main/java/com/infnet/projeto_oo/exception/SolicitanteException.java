package com.infnet.projeto_oo.exception;

import lombok.experimental.StandardException;

@StandardException
public class SolicitanteException extends RuntimeException{

    public SolicitanteException(String message) {
        super(message);
    }

    public SolicitanteException(Throwable t) {
        super(t);
    }
}
