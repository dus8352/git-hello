package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/forms/{dir}/{page}")
    public String move(@PathVariable String dir, @PathVariable String page) {
        System.out.println("이동하려는 디렉토리: " + dir);
        System.out.println("이동하려는 페이지: " + page);
        return String.format("%s/%s", dir, page);
    }

}
