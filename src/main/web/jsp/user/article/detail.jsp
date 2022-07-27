<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ page import="org.example.Web_servlet.servlet_ver1.article.model.ArticleDto" %>
<%@ page import="java.util.List" %>

<h1>게시물 상세 페이지</h1>

<%
    ArticleDto article = (ArticleDto) request.getAttribute("article");


%>


<div>
    <%if (article != null) {%>
    <div>
        ID= <%=article.getId()%>
    </div>
    <div>
        tittle= <%=article.getTitle()%>
    </div>
    <div>
        body= <%=article.getBody()%>
    </div>
    <%}%>

</div>

<a href="https://www.youtube.com">
    <button>Youtube</button>
</a>
<h1>폼 v3</h1>
<form method="POST" action="http://localhost:8082/usr/article/list/free">

    <div><input type="hidden" name="id" value=<%=article.getId()%> readonly></div>
    <div><input type="submit" value="삭제"></div>
</form>