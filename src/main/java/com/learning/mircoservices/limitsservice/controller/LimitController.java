package com.learning.mircoservices.limitsservice.controller;

import com.learning.mircoservices.limitsservice.bean.Limit;
import com.learning.mircoservices.limitsservice.configurations.MyCustomConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LimitController {

    @Autowired
    private MyCustomConfig myCustomConfig;

    @GetMapping
    @RequestMapping("/limit")
    public Limit retriveLimits() {
        System.out.println("request come in controller");
        System.out.println(myCustomConfig.getMinimum());
        System.out.println(myCustomConfig.getMaximum());
        return new Limit(myCustomConfig.getMinimum(), myCustomConfig.getMaximum());
    }
}
