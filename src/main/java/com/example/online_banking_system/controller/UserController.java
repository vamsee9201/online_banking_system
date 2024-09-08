package com.example.online_banking_system.controller;

import com.example.online_banking_system.entity.User;
import com.example.online_banking_system.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService theUserService) {userService = theUserService;}

    @GetMapping("/list")
    public String ListUsers(Model theModel) {
        List<User> theUsers = userService.findAll();
        theModel.addAttribute("users",theUsers);



        return "users/list-users";
    }

}
