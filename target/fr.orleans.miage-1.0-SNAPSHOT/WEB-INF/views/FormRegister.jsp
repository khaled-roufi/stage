<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 16/05/2016
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Formulaire Inscription</title>
</head>
<body>
<fieldset> Inscription </fieldset>


<s:form action="validerregistr.action">
    <s:textfield name="login" placeholder="identifiant"  />
    <s:textfield name="password" placeholder="motDePasse"  />
    <s:textfield name="firstName" placeholder="prenom" />
    <s:textfield name="lastName" placeholder="nom" />
    <s:textfield name="adresse" placeholder="adresse" />
    <s:textfield name="adresseLivraison" placeholder="adresseDeLivraison" />
    <s:submit value="Valider" id="submit"/>
</s:form>

</body>
</html>
