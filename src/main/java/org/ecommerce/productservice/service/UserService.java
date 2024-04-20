package org.ecommerce.productservice.service;

import org.ecommerce.productservice.models.User;
import org.ecommerce.productservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String name , String email){
       User user = new User();
       user.setName(name);
       user.setEmail(email);
        userRepository.save(user);
        return user;
    }
    public Optional<User> findUserById(Long id){
        return userRepository.findById(id);
    }


    public User getUserByName(String name) {
       return userRepository.findByName(name).get();
    }
}
