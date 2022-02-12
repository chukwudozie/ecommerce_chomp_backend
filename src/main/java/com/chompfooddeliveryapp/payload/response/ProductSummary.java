package com.chompfooddeliveryapp.payload.response;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ProductSummary {

    private String productName;
    private String productOwner;
    private String productImage;
    private Integer productQuantity;
    private Long productPrice;
}
