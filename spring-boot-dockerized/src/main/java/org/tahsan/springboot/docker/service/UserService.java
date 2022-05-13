package org.tahsan.springboot.docker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tahsan.springboot.docker.model.User;
import org.tahsan.springboot.docker.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;


    public List<User> findAll () {
        return userRepository.findAll();
    }

    public User add(User user) {
        return userRepository.saveAndFlush(user);
    }


}
