<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 17/05/2016
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
<div>
    <ul>

        <li><s:url action="nosproduits.action" var="link3" >
        </s:url>
            <s:a href="%{link3}">Nos Produits</s:a> </li>

        <li><s:url action="monpanier.action" var="link4" >
        </s:url>
            <s:a href="%{link4}">Mon Panier</s:a> </li>

        <li><s:url action="admin.action" var="link5" >
        </s:url>
            <s:a href="%{link5}">Admin</s:a> </li>

        <li><s:url action="conceptioncuisine.action" var="link6" >
        </s:url>
            <s:a href="%{link6}">Conception Cuisine</s:a> </li>

        <li><s:url action="contact.action" var="link2" >
        </s:url>
            <s:a href="%{link2}">Contact</s:a> </li>
    </ul>
</div>

<p>

<p>
<h1>ici votre profile ! </h1><br>
Votre nom : <s:property value="courant.firstName"/>
Votre prenom : <s:property value="courant.lastName"/>
</p>

</body>
</html>
