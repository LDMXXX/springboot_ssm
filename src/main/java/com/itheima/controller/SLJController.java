package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/slj")
public class SLJController {
    @RequestMapping("/show")
    public String show(){
        return "邵鹭杰";
    }
}
