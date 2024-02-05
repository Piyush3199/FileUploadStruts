<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- <%@ taglib uri="http://struts.apache.org/tags-html" prefix="s" %>
 --%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>File Upload Form</title>
</head>
<body>
    <h2>File Upload Form</h2>
    <s:form action="fileUpload" method="post" enctype="multipart/form-data">
        <s:file name="file" label="Select a file"/>
        <s:submit value="Upload"/>
    </s:form>
</body>
</html>
