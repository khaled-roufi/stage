<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 18/05/2016
  Time: 00:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>AjouterCuisine</title>
</head>
<body>

<fieldset> Ajouter une Cuisine </fieldset>
<div>
    <s:form action="validercuisine.action" method="post" enctype="multipart/form-data">
        <s:textfield name="reference" placeholder="reference"  />
        <s:textfield name="price" placeholder="prix"  />
        <s:file name="userImage" label="Image" />

        <s:submit value="ajouter" id="submit"/>
    </s:form>
</div>

</body>
</html>
