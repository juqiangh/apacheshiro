package com.learning.demo2.service;

import com.learning.demo2.model.User;

public interface UserService {

    User findByUsername(String username);
}
