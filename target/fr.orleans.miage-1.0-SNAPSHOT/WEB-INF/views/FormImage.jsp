<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 30/05/2016
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Ajouter Une Image</title>
</head>
<body>

<fieldset> Ajouter une Image </fieldset>
<div>
    <s:form action="validerphoto.action" method="post" enctype="multipart/form-data">
        <s:file name="userImage" label="Image" />
        <s:hidden name="idproduit" value="%{idproduit}"/>
        <s:submit value="ajouter" id="submit"/>
    </s:form>
</div>

</body>
</html>
