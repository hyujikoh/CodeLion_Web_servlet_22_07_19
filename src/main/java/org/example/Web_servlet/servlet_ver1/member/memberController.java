package org.example.Web_servlet.servlet_ver1.member;

import org.example.Web_servlet.servlet_ver1.Rq;

import java.io.IOException;

public class memberController {

    public void showLogin(Rq rq) throws IOException {
        rq.appendBody("로그인");
    }
}
