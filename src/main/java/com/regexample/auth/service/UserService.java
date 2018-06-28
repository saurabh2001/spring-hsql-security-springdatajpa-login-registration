package com.regexample.auth.service;

import com.regexample.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
