package com.james.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/v1")
public class HelloController {


    @GetMapping(path = "/hello", consumes = {"text/plain", "application/*"})
    @ResponseBody
    public String getHello() {

        return "hello";
    }
}
