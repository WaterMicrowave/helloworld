package com.example.helloworld.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "你好，Jenkins！CI的优势在于自动化打包、构建和部署项目！";
    }

}