<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 23/05/2016
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>AjoutComp</title>
</head>
<body>
<div>
    <ul>

        <li><s:url action="addlit.action" var="link3" >
        </s:url>
            <s:a href="%{link3}">Ajouter Lit</s:a> </li>

        <li><s:url action="addchevet.action" var="link4" >
        </s:url>
            <s:a href="%{link4}">Ajouter Chevet</s:a> </li>

        <li><s:url action="addcommode.action" var="link5" >
        </s:url>
            <s:a href="%{link5}">Ajouter Commode</s:a> </li>

        <li><s:url action="addmiroir.action" var="link6" >
        </s:url>
            <s:a href="%{link6}">Ajouter Miroir</s:a> </li>

        <li><s:url action="addcoiffeuse.action" var="link7" >
        </s:url>
            <s:a href="%{link7}">Ajouter Coiffeuse</s:a> </li>

        <li><s:url action="addpouffe.action" var="link8" >
        </s:url>
            <s:a href="%{link8}">Ajouter Pouffe</s:a> </li>
    </ul>
</div>
</body>
</html>
