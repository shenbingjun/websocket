package com.example.websocket.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 申冰俊
 * @version 1.1_18
 */
@Controller
public class UserController {
    @RequestMapping("/user1")
    public String user1(){
        return "user01";
    }
    @RequestMapping("/user2")
    public String user2(){
        return "user2";
    }
    @RequestMapping("/user3")
    public String user3(){
        return "user03";
    }
}
