package com.example.demo.graphql.spqr.service;

import com.example.demo.graphql.spqr.model.User;
import com.example.demo.graphql.spqr.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    public UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> createUsers(List<User> users) {
        return userRepository.saveAll(users);
    }

    @Override
    public void deleteUser(String id) {
        userRepository.deleteById(id);

    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(String id) {
        Optional<User> user =  userRepository.findById(id);
        if(user.isPresent()){
            return user.get();
        }else{
            return null;
        }
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
