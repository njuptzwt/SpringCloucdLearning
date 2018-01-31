package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 18362 on 2018/1/30.
 */
@Controller
public class infoController {
    @RequestMapping("/info")
    public String info(){
        return "hello"; //当浏览器输入/index时，会返回 /templates/hello.html页面
    }
}
