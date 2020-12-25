<%--
  Created by IntelliJ IDEA.
  User: carak
  Date: 24.12.2020
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Hello</h1>
  <div>
    <form method="post" action="${pageContext.request.contextPath}/hui">
      <p>
        <label>
          <input type="text" name="userName"/>
        </label>
      </p>
      <p>
        <label>
          <input type="text" name="userSurname">
        </label>
      </p>
      <p>
        <label>
          <input type="submit" name="Send">
        </label>
      </p>
    </form>
  </div>
  </body>
</html>
