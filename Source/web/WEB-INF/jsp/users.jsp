<%-- 
    Document   : User
    Created on : 05-Jan-2016, 19:13:03
    Author     : Nguyen Nhat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List</h1>
        <table>
            <tr>
                <th> ID</th>
                <th> Name </th>
          
            </tr>
            
            <c:forEach var="user" items="${huehue}">
                <tr>
                <td> <c:out value="${user.getId()}"> </c:out></td>
                <td> <c:out value="${user.getName()}"> </c:out></td>
                </tr>
            </c:forEach>
                
        </table>
        <form action="add.htm" method="POST">
            ID <input type="text" name="id" value="" />
            Name <input type="text" name="name" value="" />
            <input type="submit" value="ADD" />
        </form>
    </body>
</html>
