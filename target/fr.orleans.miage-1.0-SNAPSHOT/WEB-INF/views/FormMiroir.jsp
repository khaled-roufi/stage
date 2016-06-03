<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 23/05/2016
  Time: 18:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>AjouterMiroir</title>
</head>
<body>

<fieldset> Ajouter un Miroir </fieldset>
<div>
    <s:form action="validermiroir.action" enctype="multipart/form-data">
        <s:textfield name="reference" placeholder="reference" label="Reference" />
        <s:textfield name="price" placeholder="prix"  label="Prix"/>
        <s:textfield name="taille" placeholder="taille"  label="Taille"/>
        <s:textfield name="couleur" placeholder="couleur"  label="Couleur"/>
        <s:file name="userImage" label="Image" />
        <s:hidden name="type" value="miroir"/>
        <s:submit value="ajouter" id="submit"/>
    </s:form>
</div>

</body>
</html>

