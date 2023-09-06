package com.infnet.projeto_oo.exception;

import lombok.experimental.StandardException;

@StandardException
public class PedidoException extends RuntimeException{

    public PedidoException(String message) {
        super(message);
    }

    public PedidoException(Throwable t) {
        super(t);
    }
}
