<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page
        import = "org.example.Web_servlet.servlet_ver1.Rq"
        import="jakarta.servlet.http.HttpServletRequest"
        import="jakarta.servlet.http.HttpServletResponse" %>
<%

    Rq rq = new Rq(request,response );
    int dan = rq.getIntParam("dan", 0);

    System.out.println(dan);
    int limit = rq.getIntParam("limit", 0);
    
%>

<h1><%=dan%>단</h1>

<% for(int i = 1;i<limit;i++) {%>
<div><%=dan%> * <%=i%> = <%=dan * i%></div>

<%}%>


