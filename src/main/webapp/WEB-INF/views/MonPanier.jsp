<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 21/05/2016
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Mon Panier</title>
</head>
<body>
<center><strong>Mon Panier</strong></center>
<div>
    <table>
        <tr>
            <th>ID</th>
            <th>REFERENCE</th>
            <th>PRIX UNITAIRE</th>
            <th>QUANTITY</th>
        </tr>
        <s:iterator value="panier">
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
                    <s:property value="quantity"/>
                </td>
                <td>
                    <s:url action="supprimerproduitpanier" var="lien">
                        <s:param name="idproduit"><s:property value="id"/> </s:param>
                    </s:url>
                    <s:a href="%{lien}">Supprimer Du Panier</s:a>
                </td>
            </tr>
        </s:iterator>
        <td>
            <strong>PRIXTOTALE :</strong> <s:property value="courant.panier.price"/>
        </td>
    </table>
    <s:form action="validerpanier.action">
        <s:submit value="valider mon panier" id="submit"/>
    </s:form>
</div>
</body>
</html>
