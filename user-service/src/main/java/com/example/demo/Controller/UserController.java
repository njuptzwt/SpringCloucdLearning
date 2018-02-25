package com.example.demo.Controller;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 18362 on 2018/2/3.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @GetMapping()
    public String getAllUser(Model model) {
        model.addAttribute("userlist", userService.findAll());
        return "userList";
    }

    @GetMapping("/create")
    public String getUserForm(ModelMap map) {
        map.addAttribute("user", new User());
        map.addAttribute("action", "create");
        return "userForm";
    }

    @PostMapping(value = "/create")
    public String postUser(@ModelAttribute User user) {
        user.setPassword("123456");
        user.setUsername("zhengwentan");
        user.setId(1001L);
        userService.insertByUser(user);
        userService.acquireCuppon();
        return "result:"+userService.acquireCuppon();
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String getUser(@PathVariable Long id, ModelMap map) {
        map.addAttribute("user", userService.findById(id));
        map.addAttribute("action", "update");
        return "userForm";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String putUser(@ModelAttribute User user) {
        userService.update(user);
        return "redirect:/users/";
    }
}
