package com.gapperdan.hswx.controller;

import com.gapperdan.hswx.domain.Hello;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String hello() {
        return "hello!";
    }

    @RequestMapping(value = "/hi/{name}")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody Hello hi(@PathVariable("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);

        return hello;
    }

    @RequestMapping(value = "/hi")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody Hello hi() {
        Hello hello = new Hello();
        hello.setName("stranger");

        return hello;
    }
}
