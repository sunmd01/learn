package com.example.demo.example.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@RequestMapping("/example")
@Controller
class ExampleController {
    @GetMapping("/hi")
    @ResponseBody
    fun sayHello(): String {
        return "Hello World!";
    }
}