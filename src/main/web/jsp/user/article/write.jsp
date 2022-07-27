<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ page import="org.example.Web_servlet.servlet_ver1.article.model.ArticleDto" %>
<%@ page import="java.util.List" %>

<h1>게시물 작성</h1>

<script>
    function AtricleSave__submitForm(form){
        if ( form.title.value.length == 0 ) {
            alert('제목을 입력해주세요.');
            form.title.focus();
            return;
        }
        form.body.value = form.body.value.trim();
        if ( form.body.value.length == 0 ) {
            alert('내용을 입력해주세요.');
            form.body.focus();
            return;
        }
        return form.submit();
    }
</script>


<form method="POST" onsubmit="ArticleSave__submitForm(this); return false;">
    <div>
        <span>제목</span>
        <div>
            <input name="title" type="text" maxlength="50" placeholder="제목을 입력해주세요." />
        </div>
    </div>

    <div>
        <span>내용</span>
        <div>
            <input name="body" type="text" maxlength="300" placeholder="내용을 입력해주세요." />
        </div>
    </div>

    <div>
        <span>작성</span>
        <div>
            <input type="submit" value="작성" />
        </div>
    </div>
</form>