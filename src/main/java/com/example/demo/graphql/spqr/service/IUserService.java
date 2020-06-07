package com.example.demo.graphql.spqr.service;

import com.example.demo.graphql.spqr.model.User;

import java.util.List;

public interface IUserService {

    public User createUser(User user);
    public void deleteUser(String id);
    public User updateUser(User user);
    public User getUser(String id);
    public List<User> getAllUsers();
}
