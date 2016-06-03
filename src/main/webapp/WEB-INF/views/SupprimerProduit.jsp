<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 21/05/2016
  Time: 23:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Supprimer Produit</title>
</head>
<body>
<div>
    <ul>
        <li><s:url action="deletecuisine.action" var="link2">
            <s:param name="categorie" >cuisine</s:param>
        </s:url>
            <s:a href="%{link2}">Supprimer une Cuisine</s:a></li>

        <li><s:url action="deletechambre.action" var="link3">
            <s:param name="categorie" >chambre</s:param>
        </s:url>
            <s:a href="%{link3}">Supprimer une Chambre</s:a></li>

        <li><s:url action="deletelit.action" var="link4">
            <s:param name="categorie" >lit</s:param>
        </s:url>
            <s:a href="%{link4}">Supprimer un Lit</s:a></li>

        <li><s:url action="deletecommode.action" var="link5">
            <s:param name="categorie" >commode</s:param>
        </s:url>
            <s:a href="%{link5}">Supprimer une Commode</s:a></li>

        <li><s:url action="deletearmoire.action" var="link6">
            <s:param name="categorie" >armoire</s:param>
        </s:url>
            <s:a href="%{link6}">Supprimer une Armoire</s:a></li>

        <li><s:url action="deletechevet.action" var="link7">
            <s:param name="categorie" >chevet</s:param>
        </s:url>
            <s:a href="%{link7}">Supprimer un Chevet</s:a></li>

        <li><s:url action="deletemiroir.action" var="link8">
            <s:param name="miroir" >commode</s:param>
        </s:url>
            <s:a href="%{link8}">Supprimer un Miroir</s:a></li>

        <li><s:url action="deletecoiffeuse.action" var="link9">
            <s:param name="categorie" >coiffeuse</s:param>
        </s:url>
            <s:a href="%{link9}">Supprimer une Coiffeuse</s:a></li>

        <li><s:url action="deletepouffe.action" var="link1">
            <s:param name="categorie" >pouffe</s:param>
        </s:url>
            <s:a href="%{link1}">Supprimer un Pouffe</s:a></li>

    </ul>
</div>
</body>
</html>
