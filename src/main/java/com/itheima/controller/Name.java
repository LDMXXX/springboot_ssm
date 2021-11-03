package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class Name {
    @RequestMapping("/demo")
    public String nameDemo(){
        return "李鑫泽";
    }
}
