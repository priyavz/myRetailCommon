package com.myretail.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductData {

    private String id;
    private String name;
    private CurrentPrice current_price;

}
