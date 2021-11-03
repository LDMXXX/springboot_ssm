package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dyp")
public class Dcontroller {

    @GetMapping
    public String test1(){
        return "窦云鹏";
    }
}