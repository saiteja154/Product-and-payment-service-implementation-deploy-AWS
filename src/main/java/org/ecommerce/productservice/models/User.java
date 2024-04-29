package org.ecommerce.productservice.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

//@MappedSuperclass
@Entity(name = "user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue()
    private UUID id;
    //randomUUID() : to generate random UUID's
    private String name;
    @Column(name="email_address" ,unique = true)
    private String email;

}
