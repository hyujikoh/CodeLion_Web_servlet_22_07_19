package org.example.Web_servlet.testdata;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;// 내가 가는데 이미 있다라는것
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/hello")
public class hello extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 들어오는 파라미터를 UTF-8로 해석
        req.setCharacterEncoding("UTF-8");
        // 서블릿이 HTML 파일을 만들 때 UTF-8 로 쓰기
        resp.setContentType("UTF-8");

        // HTML이 UTF-8 형식이라는 것을 브라우저에게 알린다.
        resp.setContentType("text/html; charset=utf-8");

        resp.getWriter().append("안녕하tnRhk");
    }
}