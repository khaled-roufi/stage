<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 22/05/2016
  Time: 01:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Modifier Produit</title>
</head>
<body>
<div>
    <ul>
        <li><s:url action="modifycuisine.action" var="link2">
        </s:url>
            <s:a href="%{link2}">Modifier une Cuisine</s:a></li>

        <li><s:url action="modifychambre.action" var="link3">
        </s:url>
            <s:a href="%{link3}">Modifier une Chambre</s:a></li>
    </ul>
</div>
</body>
</html>

