<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 20/05/2016
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Success: Upload Product Image</title>
</head>
<body>
<h2>
    Struts2 File Upload Example
</h2>
Product Image: <s:property value="userImage" /><br/>
Content Type:<s:property value="userImageContentType" /><br/>
File Name:  <s:property value="userImageFileName" /><br/>
Uploaded Image:    <img src="<s:property value="userImageFileName"/>"/>

</body>
</html>