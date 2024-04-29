package org.ecommerce.productservice.repository;

import org.ecommerce.productservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {


    Optional<User> findById(Long id);

    Optional<User> findByEmail(String email);

    List<User> findByName(String name);
    List<User> findAllByNameEndingWith(String suffix);

    @Override
    List<User> findAllById(Iterable<Long> longs);

    User save(User entity);
}
