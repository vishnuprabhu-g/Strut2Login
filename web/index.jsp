<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login using Struts2</title>
    </head>
    <body>
        <s:form action="login">
            <s:textfield name="uname" label="Enter your uname"></s:textfield>
            <s:textfield name="pass" label="Enter your password"></s:textfield>
            <s:submit value="Login" align="center"></s:submit>
        </s:form>
    </body>
</html>
