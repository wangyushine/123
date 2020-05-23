package com.sharedguide.guide.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 18710
 */
@RequestMapping("hello")
public class HelloController {
    public String hello(){
        return "hello";
    }

}
