package com.example.online_banking_system.service;

import com.example.online_banking_system.entity.User;
import java.util.List;


public interface UserService {

    List<User> findAll();

    User findById(int theId);

    void save(User theUser);

    void deleteById(int theId);
}
