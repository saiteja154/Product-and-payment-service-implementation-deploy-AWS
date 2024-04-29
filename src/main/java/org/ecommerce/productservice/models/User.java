package org.ecommerce.productservice.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
//@Entity(name = "user")
// inheritance types in hibernate : Mappedsuperclass, single table , Joined table , table per class.
//@MappedSuperclass
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

@Getter
@Setter
@Entity()
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue()
    private UUID id;
    //randomUUID() : to generate random UUID's
    private String name;
    @Column(name="email_address" ,unique = true)
    private String email;

}
