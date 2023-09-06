package com.infnet.projeto_oo.exception;

import lombok.experimental.StandardException;

@StandardException
public class ProdutoException extends RuntimeException{
    public ProdutoException(String message) {
        super(message);
    }

    public ProdutoException(Throwable t) {
        super(t);
    }
}
