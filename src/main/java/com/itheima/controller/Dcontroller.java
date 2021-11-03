package com.itheima.controller;

@RestController
@RequestMapping("/index")
public class Dcontroller {

    @RequestMapping("/index")
    public String test1(){
        return "/index.html";
    }
}