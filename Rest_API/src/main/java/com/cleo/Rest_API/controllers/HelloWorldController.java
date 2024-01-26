package com.cleo.Rest_API.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/** Shortcut for these two is @RestController
@Controller

@ResponseBody

 */

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping("")
    public String hello_world(){
        return "Hello World";
    }
}
