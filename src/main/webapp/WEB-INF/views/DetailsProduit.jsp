<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 30/05/2016
  Time: 22:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>DetailsProduit</title>
</head>
<body>
<fieldset>Details Produit :</fieldset>
<div>
<s:property  value="reference"></s:property>
    <s:iterator value="produit.images" var="prod">
        <img src="/<s:property value="file"></s:property>" width="100" height="100">
    </s:iterator>
</div>


</body>
</html>
