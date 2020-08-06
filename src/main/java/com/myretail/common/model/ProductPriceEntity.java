package com.myretail.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection="productprice")
public class ProductPriceEntity {

    @Id
    private String id;
    private Double price;
    private String currencyCode;

}
