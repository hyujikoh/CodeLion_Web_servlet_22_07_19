<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ page import="org.example.Web_servlet.servlet_ver1.article.model.ArticleDto" %>
<%@ page import="java.util.List" %>

!
<h1>게시물 작성</h1>

<form>
    <div>
        <span>제목</span>
        <div>
            <input name="title" type="text" maxlength="50" placeholder="제목을 입력해주세요."/>
        </div>
    </div>

    <div>
        <span>내용</span>
        <div>
            <input name="body" type="text" maxlength="300" placeholder="내용을 입력해주세요."/>
        </div>
    </div>

    <div>
        <span>작성</span>
        <div>
            <input type="submit" value="작성"/>
        </div>
    </div>
</form>
<h1>폼 v1</h1>
<form action="https://search.naver.com/search.naver" target="_blank">

    <div><input type="text" name="where" value="nexearch" ></div>
    <div><input type="text" name="sm" value="top_hty" ></div>
    <div><input type="text" name="fbm" value="1" ></div>
    <div><input type="text" name="ie" value="utf-8" ></div>
    <div><input type="text" name="query" value="program"></div>
    <div><input type="submit" value="검색"></div>

</form>

<h1>폼 v2</h1>
<form action="https://search.naver.com/search.naver" target="_blank">

    <div><input type="text" name="where" value="nexearch" readonly></div>
    <div><input type="text" name="sm" value="top_hty" readonly></div>
    <div><input type="text" name="fbm" value="1" readonly></div>
    <div><input type="text" name="ie" value="utf-8" readonly></div>
    <div><input type="text" name="query" value="program"></div>
    <div><input type="submit" value="검색"></div>

</form>


<h1>폼 v3</h1>
<form action="https://search.naver.com/search.naver" target="_blank">

    <div><input type="hidden" name="where" value="nexearch" readonly></div>
    <div><input type="hidden" name="sm" value="top_hty" readonly></div>
    <div><input type="hidden" name="fbm" value="1" readonly></div>
    <div><input type="hidden" name="ie" value="utf-8" readonly></div>
    <div><input type="text" name="query" placeholder="입력하세요."></div>
    <div><input type="submit" value="검색"></div>

</form>