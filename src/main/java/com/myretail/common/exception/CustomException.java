package com.myretail.common.exception;

import com.fasterxml.jackson.core.JsonProcessingException;

public class CustomException extends JsonProcessingException {

    public CustomException(String msg,String id) {
        super(msg + id);
    }

}
