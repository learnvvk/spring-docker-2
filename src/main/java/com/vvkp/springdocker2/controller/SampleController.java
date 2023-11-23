package com.vvkp.springdocker2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {

    @GetMapping("/msg")
    public String getMessage(){
        return "Sample project for create docker image and push at Docker Hub using docker maven plugin";
    }
}
