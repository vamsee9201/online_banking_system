package com.example.online_banking_system.dao;

import java.util.List;
import com.example.online_banking_system.entity.User;

public interface UserRepository {

    public List<User> findAllByOrderByLastNameAsc();
}
