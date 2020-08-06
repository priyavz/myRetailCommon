package com.myretail.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CurrentPrice {

    private Double value;
    private String currency_code;

}
