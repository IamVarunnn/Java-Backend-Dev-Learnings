package com.telusko.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


//    @GetMapping("/")
//    @RequestMapping("/")
//    public String home(){
//        System.out.println("Home Method Called");
//        return "index.jsp";
//    }

    @RequestMapping("/")
    public String home(){
        System.out.println("Home Method Called");
        return "index";
    }

//    @RequestMapping("add")
//    public String add(HttpServletRequest request, HttpSession session){
//        System.out.println("Add Called");
//
//        int num1 = Integer.parseInt(request.getParameter("num1"));
//        int num2 = Integer.parseInt(request.getParameter("num2"));
//        int result = num1 + num2;
//        session.setAttribute("result", result);
//        System.out.println(result);
//        return "result.jsp";
//    }

//    @RequestMapping("add")
//    public String add(@RequestParam("num1")int a, @RequestParam("num2")int b, HttpSession session){
//        System.out.println("Add Called");
//
//
//        int result = a + b;
//        session.setAttribute("result", result);
//        System.out.println(result);
//        return "result.jsp";
//    }

//    @RequestMapping("add")
//    public String add(@RequestParam("num1")int a, @RequestParam("num2")int b, Model model){
//        System.out.println("Add Called");
//
//
//        int result = a + b;
//        model.addAttribute("result", result);
//        System.out.println(result);
//        return "result.jsp";
//    }

//    @RequestMapping("add")
//    public String add(@RequestParam("num1")int a, @RequestParam("num2")int b, Model model){
//        System.out.println("Add Called");
//
//
//        int result = a + b;
//        model.addAttribute("result", result);
//        System.out.println(result);
//        return "result";
//    }

//    @RequestMapping("add")
//    public ModelAndView add(@RequestParam("num1")int a, @RequestParam("num2")int b, ModelAndView mv){
//        System.out.println("Add Called");
//        int result = a + b;
//
//        mv.addObject("result", result);
//        mv.setViewName("result");
//
//        return mv;
//    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1")int a, @RequestParam("num2")int b, ModelAndView mv){
        System.out.println("Add Called");
        int result = a + b;

        mv.addObject("result", result);
        mv.setViewName("result");

        return mv;
    }

//    @RequestMapping("addAlien")
//    public ModelAndView addAlien(@RequestParam("aid")int aid, @RequestParam("aname")String aname, ModelAndView mv){
//        System.out.println("Add Alien Called");
//
//        Alien alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//
//        mv.addObject("alien", alien);
//        mv.setViewName("result");
//
//        return mv;
//    }

//    @RequestMapping("addAlien")
//    public ModelAndView addAlien(Alien alien, ModelAndView mv){
//        System.out.println("Add Alien Called");
//
//        mv.addObject("alien", alien);
//        mv.setViewName("result");
//
//        return mv;
//    }

    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute("aliens") Alien alien){
        System.out.println("Add Alien Called");

        return "result";
    }
}
