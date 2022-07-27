<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ page import="org.example.Web_servlet.servlet_ver1.article.model.ArticleDto" %>
<%@ page import="java.util.List" %>


<%
List<ArticleDto> articles = (List<ArticleDto>) request.getAttribute("articles");


%>
<script src="https://cdn.tailwindcss.com"></script>


<!-- 보톻 구획은 섹션으로 나눈다 -->

<section>
    <!--container : 너비가 너무 넓게 퍼지는 것을 막고 + 반응형은 잃지 않는다. -->
    <div class="container mx-auto">
        <h1 class ="font-bold text-lg">게시물 리스트</h1>
        <ul >
            <% for (ArticleDto article : articles){%>

            <li class="flex">
                <a class="w-[100px]" href="/usr/article/detail/free/<%=article.getId()%>"><%=article.getId()%></a>
                <a class="flex-grow hover:underline"  href="/usr/article/detail/free/<%=article.getId()%>"><%=article.getTitle()%></a>
                <a class="w-[100px] hover:underline hover:text-[red]" href="/usr/article/delete/free/<%=article.getId()%>">삭제</a>
                <a class="w-[100px] hover:underline hover:text-[red]" href="/usr/article/update/free/<%=article.getId()%>">수정</a>
            </li>
            <%}%>

        </ul>

    </div>

</section>

