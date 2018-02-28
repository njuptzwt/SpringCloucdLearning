package com.example.demo.Service;

import com.example.demo.Entity.User;

import java.util.List;

/**
 * Created by 18362 on 2018/2/3.
 */
public interface UserService {
    List<User> findAll();

    User insertByUser(User user);

    User update(User user);

    User delete(Long id);

    User findById(Long id);

    String acquireError();
}
