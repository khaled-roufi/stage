<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 23/05/2016
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>PreConception</title>
</head>
<body>
<div>
    <ul>
        <li><s:url action="cuisineavecpoinier.action" var="link2">
        </s:url>
            <s:a href="%{link2}">Cuisines Avec Poinier</s:a></li>

    </ul>

    <ul>
        <li><s:url action="cuisinesanspoinier.action" var="link3">
        </s:url>
            <s:a href="%{link3}">Cuisines Sans Poiniers</s:a></li>

    </ul>
</div>
</body>
</html>
