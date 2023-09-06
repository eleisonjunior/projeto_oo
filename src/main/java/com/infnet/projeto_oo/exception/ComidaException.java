package com.infnet.projeto_oo.exception;

import lombok.experimental.StandardException;

@StandardException
public class ComidaException extends RuntimeException{
    public ComidaException(String message) {
        super(message);
    }

    public ComidaException(Throwable t) {
        super(t);
    }
}
