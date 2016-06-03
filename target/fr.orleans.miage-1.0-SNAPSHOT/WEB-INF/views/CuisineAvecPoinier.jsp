<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 23/05/2016
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>CuisineAvecPoinier</title>
</head>
<body>
<div>
    <ul>
        <li><s:url action="cuisinelineaire.action" var="link2">
        </s:url>
            <s:a href="%{link2}">Cuisine Linéaire</s:a></li>
    </ul>

    <ul>
        <li><s:url action="cuisineenu.action" var="link3">
        </s:url>
            <s:a href="%{link3}">Cuisine en U</s:a></li>
    </ul>

    <ul>
        <li><s:url action="cuisineavecilot.action" var="link4">
        </s:url>
            <s:a href="%{link4}">Cuisine Avec Ilot</s:a></li>
    </ul>
</div>
</body>
</html>
