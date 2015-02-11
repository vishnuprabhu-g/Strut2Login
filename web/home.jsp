<%@taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User home</title>
    </head>
    <body>
        <h3>welcome <s:property value="uname" default="ItsD"></s:property> </h3>
        <p> ${uname} </p>
    </body>
</html>
