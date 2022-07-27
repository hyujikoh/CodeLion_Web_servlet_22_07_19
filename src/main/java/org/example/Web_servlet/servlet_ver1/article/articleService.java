package org.example.Web_servlet.servlet_ver1.article;

import org.example.Web_servlet.servlet_ver1.article.model.ArticleDto;

import java.util.List;

public class articleService {

    private ArticleRepository articleRepository;

    public  articleService() {
        articleRepository = new ArticleRepository();
    }

    public long write(String title, String body) {
        return articleRepository.write(title, body);
    }

    public List<ArticleDto> showList() {
        return articleRepository.showList();

    }

    public ArticleDto findById(long id) {
        return articleRepository.findById(id);
    }

    public void delete(long id) {
        articleRepository.delete(id);
    }
}
