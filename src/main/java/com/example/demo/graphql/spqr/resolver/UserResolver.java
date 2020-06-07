package com.example.demo.graphql.spqr.resolver;

import com.example.demo.graphql.spqr.service.IUserService;
import com.example.demo.graphql.spqr.model.User;
import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserResolver {
    @Autowired
    private IUserService userService;

    @GraphQLMutation(name = "createUser")
    public User createUser(@GraphQLArgument(name = "details") User user) {
        return userService.createUser(user);
    }

    @GraphQLMutation(name = "createUsers")
    public List<User> createUsers(@GraphQLArgument(name = "details") List<User> users) {
        return userService.createUsers(users);
    }

    @GraphQLQuery(name = "getAllUser")
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }

    @GraphQLMutation(name = "updateUser")
    public User updateUser(@GraphQLArgument(name = "details") User user) {
        return userService.updateUser(user);
    }

    @GraphQLMutation(name = "deleteUser")
    public Boolean deleteUser(@GraphQLArgument(name = "userId") String id) {
        userService.deleteUser(id);
        return true;
    }

    @GraphQLQuery(name = "getUser")
    public User getUser(@GraphQLArgument(name = "userId") String id) {
        return userService.getUser(id);
    }
}
