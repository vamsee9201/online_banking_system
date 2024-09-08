package com.example.online_banking_system.service;

import com.example.online_banking_system.dao.UserRepository;
import com.example.online_banking_system.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    public UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository theUserRepository) {
        userRepository = theUserRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAllByOrderByLastNameAsc();
    }

    @Override
    public User findById(int theId) {
        Optional<User> result = userRepository.findById(theId);
        User theUser = null;

        if(result.isPresent()) {
            theUser = result.get();
        }
        else {
            throw new RuntimeException("did not find item id" + theId);
        }
        return theUser;
    }

    @Override
    public void save(User theUser) {
        userRepository.save(theUser);
    }

    @Override
    public void deleteById(int theId) {
        userRepository.deleteById(theId);
    }
}
