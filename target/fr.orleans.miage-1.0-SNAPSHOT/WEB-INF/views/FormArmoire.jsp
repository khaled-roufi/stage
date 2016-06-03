<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 24/05/2016
  Time: 04:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>AjouterArmoire</title>
</head>
<body>

<fieldset> Ajouter un Armoire </fieldset>
<div>
    <s:form action="validerarmoire.action"  enctype="multipart/form-data">
        <s:textfield name="reference" placeholder="reference"  label="Reference"/>
        <s:textfield name="price" placeholder="prix"  label="prix"/>
        <s:textfield name="taille" placeholder="taille"  label="taille"/>
        <s:textfield name="couleur" placeholder="couleur"  label="couleur"/>
        <s:file name="userImage" label="Image" />
        <s:hidden name="type" value="chevet"/>
        <s:submit value="ajouter" id="submit"/>
    </s:form>
</div>

</body>
</html>

