package org.example.Web_servlet;

import jakarta.servlet.http.HttpServlet;

public class hello extends HttpServlet {
    public String sayHelloWorldFrom(String from) {
        String result = "Hello, world, from " + from;
        System.out.println(result);
        return result;
    }
}