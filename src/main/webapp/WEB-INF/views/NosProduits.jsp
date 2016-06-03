
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Nos Produits</title>
</head>
<body>
<div>
    <ul>
        <li><s:url action="noscuisines.action" var="link2">
            <s:param name="categorie" >cuisine</s:param>

        </s:url>
            <s:a href="%{link2}">Nos Cuisines</s:a></li>

    </ul>

    <ul>
        <li><s:url action="noschambres.action" var="link3">
            <s:param name="categorie" >chambre</s:param>

        </s:url>
            <s:a href="%{link3}">Nos Chambres</s:a></li>

    </ul>

    <ul>
        <li><s:url action="noslits.action" var="link4">
            <s:param name="categorie" >lit</s:param>

        </s:url>
            <s:a href="%{link4}">Nos Lits</s:a></li>

    </ul>

    <ul>
        <li><s:url action="noscommodes.action" var="link5">
            <s:param name="categorie" >commode</s:param>

        </s:url>
            <s:a href="%{link5}">Nos Commodes</s:a></li>

    </ul>

    <ul>
        <li><s:url action="nosarmoires.action" var="link6">
            <s:param name="categorie" >armoire</s:param>

        </s:url>
            <s:a href="%{link6}">Nos Armoires</s:a></li>

    </ul>

    <ul>
        <li><s:url action="noschevets.action" var="link7">
            <s:param name="categorie" >chevet</s:param>

        </s:url>
            <s:a href="%{link7}">Nos Chevets</s:a></li>

    </ul>

    <ul>
        <li><s:url action="nosmiroirs.action" var="link8">
            <s:param name="categorie" >miroir</s:param>

        </s:url>
            <s:a href="%{link8}">Nos Miroirs</s:a></li>

    </ul>

    <ul>
        <li><s:url action="noscoiffeuses.action" var="link9">
            <s:param name="categorie" >coiffeuse</s:param>

        </s:url>
            <s:a href="%{link9}">Nos Coiffeuses</s:a></li>

    </ul>

    <ul>
        <li><s:url action="nospouffes.action" var="link1">
            <s:param name="categorie" >pouffe</s:param>

        </s:url>
            <s:a href="%{link1}">Nos Pouffes</s:a></li>

    </ul>
</div>
</body>
</html>