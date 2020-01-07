package com.test.socket.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        log.info("---------------------");
        return "hello.html";
    }
}
