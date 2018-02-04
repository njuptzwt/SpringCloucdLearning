package com.example.demo.Service;

import com.example.demo.Entity.User;
import com.example.demo.UserApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by 18362 on 2018/2/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UserApplication.class)
public class UserServiceImplTest {
    @Autowired
    UserServiceImpl userService;
    @Test
    public void findAll() throws Exception {
    }

    @Test
    public void insertByUser() throws Exception {
        User user=new User();
        user.setUsername("zwt");
        user.setPassword("123");
        userService.insertByUser(user);
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void delete() throws Exception {
    }

    @Test
    public void findById() throws Exception {
    }

}