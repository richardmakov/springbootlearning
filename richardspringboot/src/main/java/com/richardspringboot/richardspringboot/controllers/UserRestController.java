package com.richardspringboot.richardspringboot.controllers;

import com.richardspringboot.richardspringboot.models.User;
import com.richardspringboot.richardspringboot.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path="/details")
    public UserDto details(){
        UserDto userDto = new UserDto();
        User user = new User("Richard", "Makov");
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");

        return userDto;
    }

    @GetMapping("/list")
    public List<User> list(){
        User user = new User("Richard", "Makov");
        User user2 = new User("Miguel", "Gaytan");
        User user3 = new User("Juan", "Coloma");

//        List<User> users = new ArrayList<>();
//        users.add(user);
//        users.add(user2);
//        users.add(user3);

        return Arrays.asList(user, user2, user3);

    }

}
