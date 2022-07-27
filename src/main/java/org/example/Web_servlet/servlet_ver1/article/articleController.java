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
//        List<ArticleDto> articleDtos = new ArrayList<>();
//        articleDtos.add(new ArticleDto(5, "제목 5", "내용 5"));
//        articleDtos.add(new ArticleDto(4, "제목 4", "내용 4"));
//        articleDtos.add(new ArticleDto(3, "제목 3", "내용 3"));
//        articleDtos.add(new ArticleDto(2, "제목 2", "내용 2"));
//        articleDtos.add(new ArticleDto(1, "제목 1", "내용 1"));
        //articleService.showList();
        rq.setAttr("articles", articleService.showList());
        rq.view("user/article/list");

    }

    public void showWrite(Rq rq) {
        rq.view("user/article/write");
    }

    public void doWrite(Rq rq) {
        String title = rq.getParam("title", "");
        String body = rq.getParam("body", "");

        long id = articleService.write(title, body);

        rq.appendBody("%d번 게시물이 생성 되었습니다.".formatted(id));
    }

    public void showDetail(Rq rq) {
        long id = rq.getLongPathValueByIndex(1, 0);

        if (id == 0) {
            rq.appendBody("번호를 입력해주세요.");
            return;
        }

        ArticleDto articleDto = articleService.findById(id);

        if (articleDto == null) {
            rq.appendBody("해당 글이 존재하지 않습니다.");
            return;
        }

        rq.setAttr("article", articleDto);
        rq.view("user/article/detail");
    }
    public void dodelete(Rq rq) {
        long id = rq.getLongPathValueByIndex(1, 0);

        if (id == 0) {
            rq.appendBody("번호를 입력해주세요.");
            return;
        }

        ArticleDto articleDto = articleService.findById(id);

        if (articleDto == null) {
            rq.appendBody("해당 글이 존재하지 않습니다.");
            return;
        }

        articleService.delete(id);

        rq.appendBody("%d번 게시물이 삭제되었습니다.".formatted(id));
    }

}
