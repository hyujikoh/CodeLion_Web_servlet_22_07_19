package org.example.Web_servlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Rq {
    HttpServletRequest req;
    HttpServletResponse resp;
    public Rq(HttpServletRequest req, HttpServletResponse resp) {
        this.req = req;
        this.resp = resp;
    }

    public int getIntParam(String value, int i) {
        if(value==null){
            return 0 ;
        }
        int dan_re = Integer.parseInt(req.getParameter(value));

            return dan_re;

    }

    public void appendBody(String formatted) throws IOException {
        resp.getWriter().append(formatted);
    }
}
