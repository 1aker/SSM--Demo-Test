package org.test.service;

import org.test.domain.User;

import java.util.List;

public interface AccountService {
    public List<User> findAll();
    public void saveUser(User user);
}
