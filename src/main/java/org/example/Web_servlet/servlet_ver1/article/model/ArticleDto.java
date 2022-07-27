package org.example.Web_servlet.servlet_ver1.article.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ArticleDto {
    private long id;
    private String title;
    private String body;
}