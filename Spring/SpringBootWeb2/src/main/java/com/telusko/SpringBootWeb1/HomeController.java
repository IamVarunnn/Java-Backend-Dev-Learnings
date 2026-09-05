package com.telusko.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

//    @GetMapping
    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }

//    @RequestMapping("add")
//    public String add(HttpServletRequest request, HttpSession session){
//        int num1 = Integer.parseInt(request.getParameter("num1"));
//        int num2 = Integer.parseInt(request.getParameter("num2"));
//
//        int result = num1 + num2;
//
//        session.setAttribute("result", result);
//
//        System.out.println(result);
//
//        return "result.jsp";
//    }

    @RequestMapping("add")
    public String add(@RequestParam("num1")int a, @RequestParam("num2")int b, HttpSession session){

        int result = a + b;

        session.setAttribute("result", result);

        System.out.println(result);

        return "result.jsp";
    }
}
