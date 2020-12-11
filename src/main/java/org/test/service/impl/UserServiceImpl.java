package org.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.dao.UserDao;
import org.test.domain.User;
import org.test.service.AccountService;


import java.util.List;

@Service("userService")
public class UserServiceImpl implements AccountService {
    @Autowired
    private UserDao userDao;
    @Override

    public List<User> findAll() {
        System.out.println("业务层，查询所有账号信息");
        return userDao.findAll();
    }

    @Override
    public void saveUser(User user) {
        System.out.println("业务层，保存账号");
        userDao.saveUser(user);
    }
}
