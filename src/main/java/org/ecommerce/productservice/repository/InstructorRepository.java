package org.ecommerce.productservice.repository;

import org.ecommerce.productservice.models.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface InstructorRepository extends JpaRepository<Instructor, UUID> {

    List<Instructor> findByName(String name);

}