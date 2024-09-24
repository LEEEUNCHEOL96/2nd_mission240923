package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/article")
    @ResponseBody
    public String article() {
        return "article 입니다.!!!! ";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/article/list";
    }
}
