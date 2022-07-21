package org.example.Web_servlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Rq {
    HttpServletRequest req;
    HttpServletResponse resp;
    public Rq(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException {
        this.req = req;
        this.resp = resp;
        req.setCharacterEncoding("UTF-8");
        // 서블릿이 HTML 파일을 만들 때 UTF-8 로 쓰기
        resp.setContentType("UTF-8");

        // HTML이 UTF-8 형식이라는 것을 브라우저에게 알린다.
        resp.setContentType("text/html; charset=utf-8");
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
