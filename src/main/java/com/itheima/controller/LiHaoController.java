package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/li")
public class LiHaoController {

    public String Lihao(){
        return "你好吗";
    }
}
