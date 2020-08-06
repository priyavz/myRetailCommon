package com.myretail.common.exception;

import static java.lang.String.format;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(String id, String msg) {
        super(format("%s : %s", msg, id));
    }

}
