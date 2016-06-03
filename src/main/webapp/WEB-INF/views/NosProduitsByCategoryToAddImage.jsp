<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 30/05/2016
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Nos Cuisines</title>
</head>
<body>
<center><strong><s:textfield name="reference" value="nos %{categorie}s"   /></strong></center>
<div>
    <table>
        <tr>
            <th>ID</th>
            <th>REFERENCE</th>
            <th>PRIX</th>
            <th>IMAGE</th>
        </tr>
        <s:iterator value="AllProduits" var="prod">
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
                    <img src="/<s:property value="imagePrincipal"></s:property>" width="100" height="100">

                </td>

                <td>
                    <s:url action="ajouterphoto" var="lien">
                        <s:param name="idproduit"><s:property value="id"/> </s:param>
                    </s:url>
                    <s:a href="%{lien}">Ajouter Une Nouvelle Image</s:a>
                </td>
            </tr>
        </s:iterator>
    </table>
</div>
</body>
</html>
