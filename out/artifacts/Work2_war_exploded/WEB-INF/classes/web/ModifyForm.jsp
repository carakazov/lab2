<%@ page import="beans.ActorBean" %><%--
  Created by IntelliJ IDEA.
  User: carak
  Date: 25.12.2020
  Time: 23:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Modify form</title>
</head>
<body>
    <%
        ActorBean bean = (ActorBean)(request.getAttribute("actor"));
        out.println("<form method=\"post\" action=\"change\">");
        out.println("<input type=\"hidden\" name=\"actorId\" value=\"" + bean.getId() + "\"/>");
        out.println("<input type=\"text\" name=\"name\" value = \"" + bean.getName() + "\"/>");
        out.println("<input type=\"text\"  name=\"surname\" value = \"" + bean.getSurname() + "\"/>");
        out.println("<input type=\"submit\" value = \"Modify\"/>");
        out.println("</form>");
    %>
</body>
</html>
