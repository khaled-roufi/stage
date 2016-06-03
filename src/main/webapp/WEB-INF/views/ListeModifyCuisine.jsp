<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 22/05/2016
  Time: 01:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Nos Cuisines</title>
</head>
<body>
<center><strong>Nos Cuisines</strong></center>
<div>
    <table>
        <tr>
            <th>ID</th>
            <th>REFERENCE</th>
            <th>PRIX</th>
        </tr>
        <s:iterator value="AllCuisines">
            <tr>
                <td>
                    <s:property value="id"/>
                </td>
                <td>
                    <s:property value="reference"/>
                </td>
                <td>
                    <s:property value="price"/>
                </td>
                <td>
                    <s:url action="formcuisinemodify" var="lien">
                        <s:param name="idproduit"><s:property value="id"/> </s:param>
                    </s:url>
                    <s:a href="%{lien}">Modifier</s:a>
                </td>
            </tr>
        </s:iterator>
    </table>
</div>
</body>
</html>