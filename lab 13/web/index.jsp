<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>HttpServlet and JSP</title>
    </head>
    <body>
        Hello World
        <p>To invoke the java servlet click <a href="${pageContext.request.contextPath}/Servlet">here</a></p>
        <p>Java in static page: <a href="firstpage.jsp" target="_blank">here</a></p>
        <p>Java injected by Servlet: <a href="SecondServlet?message=hello!" target="_blank">here</a></p>
    </body>
</html>
