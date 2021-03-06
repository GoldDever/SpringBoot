package com.example.SpringBoot.service;

import com.example.SpringBoot.module.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(long id);
    void save(User user);
    void deleteById(long id);
    void update(long id, User user);
    User getUserByUserName(String name);
}
