package com.richardspringboot.richardspringboot.controllers;

import com.richardspringboot.richardspringboot.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Richard", "Makov");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model){
//        model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios!");
        return "list";

    }

    @ModelAttribute("users")
    public List<User> usersModel(){

        return Arrays.asList(
            new User("Pepa", "Gonzalez", "pepa@correo.com"),
            new User("Juan", "Coloma", "juancoloma@correo.com"),
            new User("Rosa", "Melano"));


    }
}
