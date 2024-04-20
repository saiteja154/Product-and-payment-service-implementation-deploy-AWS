package org.ecommerce.productservice.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CreateUserDTO {
    private String name;
    private String email;
}
