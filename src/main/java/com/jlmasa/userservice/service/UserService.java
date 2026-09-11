package com.jlmasa.userservice.service;

import com.jlmasa.userservice.domain.Role;
import com.jlmasa.userservice.domain.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User>getUsers();
}
