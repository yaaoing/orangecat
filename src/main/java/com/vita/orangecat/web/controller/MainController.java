package com.vita.orangecat.web.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    private static final Logger log = Logger.getLogger(MainController.class);
    @RequestMapping("/")
    public String index() {
        log.info("欢迎访问");
        return "hello world";
    }
}
