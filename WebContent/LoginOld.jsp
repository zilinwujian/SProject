<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <link rel="stylesheet" href="/SSHProject/css/styles.css">
<title>User Register Page</title>
</head>
<body>

	<s:form action="check">
      		<label for="login">Email:</label>
      		<input type="text" name="user.username" id="login" value="name@example.com">
      		<label for="password">Password:</label>
      		<input type="password" name="user.password" id="password" value="qwert">

    	<p class="login-submit">
      		<button type="submit" class="login-button">Login</button>

    <p class="forgot-password"><a href="Register.jsp">Not Sign in?Sign in </a>
	</s:form>
  <section class="about">
    <p class="about-links">
      <a href="http://www.cssflow.com/snippets/dark-login-form" target="_parent">View Article</a>
      <a href="http://www.cssflow.com/snippets/dark-login-form.zip" target="_parent">Download</a>
    </p>
    <p class="about-author">
      &copy; 2012&ndash;2013 <a href="http://thibaut.me" target="_blank">Thibaut Courouble</a> -
      <a href="http://www.cssflow.com/mit-license" target="_blank">MIT License</a><br>
      Original PSD by <a href="http://365psd.com/day/2-234/" target="_blank">Rich McNabb</a>
  </section>
</body>
</html>