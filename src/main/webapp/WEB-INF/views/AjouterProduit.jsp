<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 18/05/2016
  Time: 00:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Ajouter Produit</title>
</head>
<body>
<div>
    <ul>
        <li><s:url action="addcuisine.action" var="link2">
        </s:url>
            <s:a href="%{link2}">Ajouter une Cuisine</s:a></li>

        <li><s:url action="addchambre.action" var="link3">
        </s:url>
            <s:a href="%{link3}">Ajouter une Chambre </s:a></li>

        <li><s:url action="ajoutcomp.action" var="link4">
        </s:url>
            <s:a href="%{link4}">Ajouter Meubles </s:a></li>
    </ul>
</div>
</body>
</html>
