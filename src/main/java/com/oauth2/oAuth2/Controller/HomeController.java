package com.oauth2.oAuth2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public  String home(){
        return "Hello welcome to home";
    }
    @GetMapping("/secured")
    public String secured(){
        return "hello welcome secured";
    }
}
