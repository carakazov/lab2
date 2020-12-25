<%@ page import="java.util.List" %>
<%@ page import="model.Actor" %>
<%@ page import="beans.ActorBean" %><%--
  Created by IntelliJ IDEA.
  User: carak
  Date: 24.12.2020
  Time: 23:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Actor list</title>
</head>
<body>
    <table>
        <tr>
            <th>
                <label>Name</label>
            </th>
            <th>
                <label>Surname</label>
            </th>
        </tr>
        <%
            List<ActorBean> actors = (List<ActorBean>)request.getAttribute("actorBeans");
            for(ActorBean bean : actors){
                String name = bean.getName();
                String surname = bean.getSurname();
                out.println("<tr>");
                out.println("<th>" + name + "</th>");
                out.println("<th>" + surname + "</th>");
                out.println("<th>");
                out.println("<form method=\"get\" action=\"change\">");
                out.println("<input type=\"hidden\" name=\"actorId\" value=\"" + bean.getId() + "\"/>");
                out.println("<input type=\"submit\" value = \"Delete\"/>");
                out.println("</form>");
                out.println("</th>");
                out.println("<th>");
                out.println("<form method=\"get\" action=\"modify\">");
                out.println("<input type=\"hidden\" name=\"actorId\" value=\"" + bean.getId() + "\"/>");
                out.println("<input type=\"submit\" value = \"Modify\"/>");
                out.println("</form>");
                out.println("</th>");
                out.println("</tr>");
            }
        %>
    </table>
    <p>
        <a href="CreatingForm.html">Add new actor</a>
    </p>
</body>
</html>
