package com.example.helloworld.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "你好，Jenkins！CI的优势在于自动化打包、构建和部署项目！<h1>相较于传统人工打包、上传、发布节省了很多人力和时间成本。是不是很香~~</h1>";
    }

}