<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 23/05/2016
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>AjouterCoiffeuse</title>
</head>
<body>

<fieldset> Ajouter Coiffeuse </fieldset>
<div>
    <s:form action="validercoiffeuse.action" enctype="multipart/form-data">
        <s:textfield name="reference" placeholder="reference" label="Reference" />
        <s:textfield name="price" placeholder="prix"  label="Prix"/>
        <s:textfield name="taille" placeholder="taille"  label="Taille"/>
        <s:textfield name="couleur" placeholder="couleur"  label="Couleur"/>
        <s:file name="userImage" label="Image" />
        <s:hidden name="type" value="coiffeuse"/>
        <s:submit value="ajouter" id="submit"/>
    </s:form>
</div>

</body>
</html>

