package com.catmash.backcatmash.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatResource {

    @RequestMapping("/")
    public String sayHello(){
        return "Hello World";
    }
}
