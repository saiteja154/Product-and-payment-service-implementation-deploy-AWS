package org.ecommerce.productservice.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class GetProductDto {
    private  String name;
    private Double price;
    private  String imageUrl;
}
