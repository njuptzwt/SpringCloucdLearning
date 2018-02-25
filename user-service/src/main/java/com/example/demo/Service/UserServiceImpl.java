package com.example.demo.Service;

import com.example.demo.Entity.User;
import com.example.demo.Entity.UserRepository;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by 18362 on 2018/2/3.
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    UserRepository userRepository;
    @Autowired
    RestTemplate restTemplate;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User insertByUser(User user) {
        LOGGER.info("手動添加用戶",user.toString());
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public User delete(Long id) {
        User user=userRepository.findOne(id);
        userRepository.delete(user);
        return user;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findOne(id);
    }

    @HystrixCommand(fallbackMethod = "acquireError")
    public String acquireCuppon(){
       return restTemplate.getForObject("http://coupon-service/coupon/insert/10", String.class);
    }
    public String acquireError(){
        return "sorry,acquire coupon failed";
    }
}
