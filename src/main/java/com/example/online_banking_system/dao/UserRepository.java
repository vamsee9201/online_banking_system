package com.example.online_banking_system.dao;

import java.util.List;
import java.util.Optional;

import com.example.online_banking_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {



    public List<User> findAllByOrderByLastNameAsc();
}
