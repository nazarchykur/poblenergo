package com.test.poblenergo.controllers;

import com.test.poblenergo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public String getUsersPage(ModelMap model) {
        model.addAttribute("usersFromServer", userRepository.findAll());
        return "users";
    }

}
