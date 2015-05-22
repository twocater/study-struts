<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<%@ taglib prefix="s" uri="/struts-tags"%>
	<s:if test="hasFieldErrors()">
		<s:iterator value="fieldErrors">
			<font color="red"><s:property value="value[0]"/></font><br>
		</s:iterator>
	</s:if>
	
	
	<form action="/study-struts/hi.action" method="post">
		<input type="hidden" name="user.submitFlag" value="login" /> 账号：<input
			type="text" name="user.account" /> 密码：<input type="password"
			name="user.password"><br> <input type="submit" value="提交">
	</form>
</body>
</html>