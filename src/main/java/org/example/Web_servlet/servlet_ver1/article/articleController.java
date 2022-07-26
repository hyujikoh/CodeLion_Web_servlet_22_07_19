package org.example.Web_servlet.servlet_ver1.article;

import org.example.Web_servlet.servlet_ver1.Rq;
import org.example.Web_servlet.servlet_ver1.article.model.ArticleDto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class articleController {
    articleService articleService;
    public articleController() {
        articleService = new articleService();
    }

    public void showList(Rq rq) throws IOException {
        rq.appendBody("게시물 리스트");
        List<ArticleDto> articleDtoList = new ArrayList<>();
        List<ArticleDto> articleDtos = new ArrayList<>();
        articleDtos.add(new ArticleDto(5, "제목 5", "내용 5"));
        articleDtos.add(new ArticleDto(4, "제목 4", "내용 4"));
        articleDtos.add(new ArticleDto(3, "제목 3", "내용 3"));
        articleDtos.add(new ArticleDto(2, "제목 2", "내용 2"));
        articleDtos.add(new ArticleDto(1, "제목 1", "내용 1"));

        rq.setAttr("articles", articleDtos);
        rq.view("user/article/list");

    }

    public void showWrite(Rq rq) {
        rq.view("user/article/write");
    }

    public void doWrite(Rq rq) {
        String title = rq.getParam("title", "");
        String body = rq.getParam("body", "");

        rq.appendBody("<div>title : %s</div>".formatted(title));
        rq.appendBody("<div>body : %s</div>".formatted(body));
    }
}
