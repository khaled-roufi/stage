<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 22/05/2016
  Time: 01:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>ModifierCuisine</title>
</head>
<body>

<fieldset> Modifier une Cuisine </fieldset>
<div>
    <s:form action="modifiercuisine.action">
       <s:textfield name="reference" value="%{produit.reference}"  label="Reference" />
        <s:textfield name="price" value="%{produit.price}"  label="Prix"/>
        <s:hidden name="idproduit"  value="%{produit.id}"/>
        <s:submit value="modifier" id="submit"/>
    </s:form>
</div>
</body>
</html>
