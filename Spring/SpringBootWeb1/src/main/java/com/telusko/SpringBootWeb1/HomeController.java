package com.telusko.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

//    @RequestMapping("/")
    @GetMapping("/")
    public String home(){
        System.out.println("Home Method Called");
        return "index.jsp";
    }
}
