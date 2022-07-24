<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ page import="org.example.Web_servlet.servlet_ver1.article.model.ArticleDto" %>
<%@ page import="java.util.List" %>

<h1>게시물 리스트</h1>

<%
List<ArticleDto> articles = (List<ArticleDto>) request.getAttribute("articles");


%>

<%= articles%>>

<ul>
    <% for (ArticleDto article : articles){%>

    <li><%=article.getId()%>. <%=article.getTitle()%> </li>
    <%}%>

</ul>
