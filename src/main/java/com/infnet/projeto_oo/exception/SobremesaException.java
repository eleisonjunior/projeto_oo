package com.infnet.projeto_oo.exception;

import lombok.experimental.StandardException;

@StandardException
public class SobremesaException extends RuntimeException{
    public SobremesaException(String message) {
        super(message);
    }

    public SobremesaException(Throwable t) {
        super(t);
    }
}
