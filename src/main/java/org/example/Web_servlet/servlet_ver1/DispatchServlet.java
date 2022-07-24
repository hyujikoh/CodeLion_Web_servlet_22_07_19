package org.example.Web_servlet.servlet_ver1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.Web_servlet.servlet_ver1.article.articleController;
import org.example.Web_servlet.servlet_ver1.member.memberController;

import java.io.IOException;
@WebServlet("/usr/*")
public class DispatchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Rq rq = new Rq(req, resp);
        articleController articleController = new articleController();
        memberController memberController = new memberController();
        //resp.getWriter().append("Work?");
        String url = req.getRequestURI();

        switch (url) {
            case "/usr/article/list/free":
                articleController.showList(rq);
                break;
            case "/usr/member/login":
                memberController.showLogin(rq);
                break;
        }

    }
}
