<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 30/05/2016
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>PreImage</title>
</head>
<body>
<div>
    <ul>
        <li><s:url action="prelistecuisine.action" var="link2">
            <s:param name="categorie" >cuisine</s:param>

        </s:url>
            <s:a href="%{link2}">Nos Cuisines</s:a></li>

    </ul>

    <ul>
        <li><s:url action="prelistechambre.action" var="link3">
            <s:param name="categorie" >chambre</s:param>

        </s:url>
            <s:a href="%{link3}">Nos Chambres</s:a></li>

    </ul>

    <ul>
        <li><s:url action="prelistelit.action" var="link4">
            <s:param name="categorie" >lit</s:param>

        </s:url>
            <s:a href="%{link4}">Nos Lits</s:a></li>

    </ul>

    <ul>
        <li><s:url action="prelistecommode.action" var="link5">
            <s:param name="categorie" >commode</s:param>

        </s:url>
            <s:a href="%{link5}">Nos Commodes</s:a></li>

    </ul>

    <ul>
        <li><s:url action="prelistearmoire.action" var="link6">
            <s:param name="categorie" >armoire</s:param>

        </s:url>
            <s:a href="%{link6}">Nos Armoires</s:a></li>

    </ul>

    <ul>
        <li><s:url action="prelistechevet.action" var="link7">
            <s:param name="categorie" >chevet</s:param>

        </s:url>
            <s:a href="%{link7}">Nos Chevets</s:a></li>

    </ul>

    <ul>
        <li><s:url action="prelistemiroir.action" var="link8">
            <s:param name="categorie" >miroir</s:param>

        </s:url>
            <s:a href="%{link8}">Nos Miroirs</s:a></li>

    </ul>

    <ul>
        <li><s:url action="prelistecoiffeuse.action" var="link9">
            <s:param name="categorie" >coiffeuse</s:param>

        </s:url>
            <s:a href="%{link9}">Nos Coiffeuses</s:a></li>

    </ul>

    <ul>
        <li><s:url action="prelistepouffe.action" var="link1">
            <s:param name="categorie" >pouffe</s:param>

        </s:url>
            <s:a href="%{link1}">Nos Pouffes</s:a></li>

    </ul>
</div>
</body>
</html>
