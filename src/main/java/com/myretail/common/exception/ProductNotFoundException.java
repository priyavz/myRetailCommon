package com.myretail.common.exception;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(String id,String msg) {
        super(String.format("%s : %s",msg , id));
    }
}
