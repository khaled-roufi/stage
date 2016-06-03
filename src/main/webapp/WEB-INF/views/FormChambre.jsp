<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 18/05/2016
  Time: 00:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>AjouterChambre</title>
</head>
<body>
<div>
    <fieldset> Ajouter un Composant De Chambre</fieldset>
    <ul>
        <li><s:url action="ajoutcomp.action" var="link1">
        </s:url>
            <s:a href="%{link1}">Ajouter Un Composant</s:a></li>
    </ul>
</div>

<fieldset> Ajouter une Chambre à Coucher</fieldset>
<div>
    <s:form action="validerchambre.action" enctype="multipart/form-data">
        <s:select label="lit" name="lit" list="AllLits" listValue="reference" listKey="id" ></s:select>
        <s:select label="commode" name="commode" list="AllCommodes" listValue="reference" listKey="id" ></s:select>
        <s:select label="armoire" name="armoire" list="AllArmoires" listValue="reference" listKey="id" ></s:select>
        <s:select label="chevet" name="chevet" list="AllChevets" listValue="reference" listKey="id" ></s:select>
        <s:select label="miroirs" name="miroir" list="AllMiroirs" listValue="reference" listKey="id" ></s:select>
        <s:select label="coiffeuses" name="coiffeuse" list="AllCoiffeuses" listValue="reference" listKey="id" ></s:select>
        <s:select label="pouffe" name="pouffe" list="AllPouffes" listValue="reference" listKey="id" ></s:select>

        <s:textfield name="reference" placeholder="reference" label="Reference"/>
        <s:textfield name="price" placeholder="prix" label="Prix"/>
        <s:file name="userImage" label="Image"/>
        <s:submit value="ajouter" id="submit"/>
    </s:form>

</div>
</body>
</html>