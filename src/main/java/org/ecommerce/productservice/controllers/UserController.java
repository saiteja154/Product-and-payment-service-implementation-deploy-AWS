package org.ecommerce.productservice.controllers;

import org.ecommerce.productservice.dtos.CreateUserDTO;
import org.ecommerce.productservice.dtos.GetInstructorDto;
import org.ecommerce.productservice.models.Instructor;
import org.ecommerce.productservice.models.User;
import org.ecommerce.productservice.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
    public List<User> findUserByName(@PathVariable(name = "name") String name){
        return userService.getUserByName(name);


    }
    @PostMapping("")
    public User createUser(@RequestBody CreateUserDTO createUserDTO) {
        return userService.createUser(createUserDTO.getName(),createUserDTO.getEmail());
    }

    @PostMapping("/instructor")
    public Instructor createInstructor(@RequestBody CreateUserDTO createUserDto) {
        return userService.
                createInstructor(createUserDto.getName(), createUserDto.getEmail());
    }

    @GetMapping("/instructor/{name}")
    public List<Instructor> getInstructorByName(@PathVariable(name = "name") String name) {
        return userService.getInstructorByName(name);
    }
/*
    @GetMapping("/instructor")
    public List<GetInstructorDto> getInstructorByUUID(@RequestBody List<UUID> uuid) {
        return userService.getInstructorByIds(uuid);
    }

 */

}
