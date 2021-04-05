package com.learning.mircoservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@ComponentScan()
public class HomeController {

    @RequestMapping("/home")
    public Map home() {
        Map map = new HashMap<String, String>();
        map.put("Message", "Welcome to spring cloud learning pathway");
        return map;
    }
}
