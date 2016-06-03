<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 22/05/2016
  Time: 02:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Nos Produits</title>
</head>
<body>
<div>
    <ul>
        <li><s:url action="addproduct.action" var="link2">
        </s:url>
            <s:a href="%{link2}">Ajouter un Produit</s:a></li>

    </ul>

    <ul>

        <li><s:url action="deleteproduct.action" var="link4">
        </s:url>
            <s:a href="%{link4}">Supprimer un Produit</s:a></li>


    </ul>
    <ul>
        <li><s:url action="modifyproduct.action" var="link5">
        </s:url>
            <s:a href="%{link5}">Modifier Produit</s:a></li>
    </ul>

    <ul>
        <li><s:url action="ajouterimage.action" var="link6">
        </s:url>
            <s:a href="%{link6}">Ajouter Une Image</s:a></li>
    </ul>
</div>
</body>
</html>