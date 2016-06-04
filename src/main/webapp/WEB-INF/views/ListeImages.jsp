<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 04/06/2016
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Images Produits</title>
</head>
<body>
<fieldset>Images :</fieldset>
<div>
    <s:iterator value="produit.images" var="prod">
        <img src="/<s:property value="file"></s:property>" width="100" height="100">
        <s:url action="supprimerimg" var="lien">
            <s:param name="nomimage"><s:property value="file"/> </s:param>
        </s:url>
        <s:a href="%{lien}">Supprimer</s:a>
    </s:iterator>
</div>


</body>
</html>
