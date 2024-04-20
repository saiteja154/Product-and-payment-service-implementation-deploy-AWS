package org.ecommerce.productservice.controllers;

import org.ecommerce.productservice.dtos.CreateUserDTO;
import org.ecommerce.productservice.models.User;
import org.ecommerce.productservice.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController()
@RequestMapping("/users")
public class UserController {

    private UserService userService;
    private UserController( UserService userService){
        this.userService = userService;
    }

/*
   @GetMapping("{id}")
    public Optional<User> findUserById(@PathVariable(name = "id") Long id){
        return userService.findUserById(id);
    }
    */


    @GetMapping("{name}")
    public User findUserByName(@PathVariable(name = "name") String name){
        return userService.getUserByName(name);


    }
    @PostMapping("")
    public User createUser(@RequestBody CreateUserDTO createUserDTO) {
        return userService.createUser(createUserDTO.getName(),createUserDTO.getEmail());
    }
}
