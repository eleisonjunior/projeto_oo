package com.infnet.projeto_oo.exception;

import lombok.experimental.StandardException;

@StandardException
public class BebidaException extends RuntimeException{
    public BebidaException(String message) {
        super(message);
    }

    public BebidaException(Throwable t) {
        super(t);
    }

}
