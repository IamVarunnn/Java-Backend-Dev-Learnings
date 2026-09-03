package com.telusko;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {


//    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        System.out.println("In Service");
//
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("<i>Hello People<i/>");
//    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("In Service");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<i>Hello People<i/>");
    }
}
