<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Hello World</title>
</head>
<p>
<h1>Hello World From Struts2</h1>
<div>
    <p>Hello World</p>
    <form action="hello">
  <label for="name">Please enter your name</label><br/>
  <input type="text" name="name"/>
  <input type="submit" value="Say Hello"/>
</form></div>

<div>
    <p>Upload</p>
    <form action="upload" method="post" enctype="multipart/form-data">
  <label for="myFile">Upload your file</label>
  <input type="file" name="myFile" />
  <input type="submit" value="Upload"/>
</form></div>

<div>
    <p> Login </p>
  <form action="loginaction" method="post">
    User:<br/><input type="text" name="user"/><br/>
    Password:<br/><input type="password" name="password"/><br/>
    <input type="submit" value="Login"/>
  </form>
</div>


<div>
    <p> Email </p>
    <em>The form below uses Google's SMTP server.
        So you need to enter a gmail username and password
    </em>
    <form action="emailer" method="post">
        <label for="from">From</label><br/>
        <input type="text" name="from"/><br/>
        <label for="password">Password</label><br/>
        <input type="password" name="password"/><br/>
        <label for="to">To</label><br/>
        <input type="text" name="to"/><br/>
        <label for="subject">Subject</label><br/>
        <input type="text" name="subject"/><br/>
        <label for="body">Body</label><br/>
        <input type="text" name="body"/><br/>
        <input type="submit" value="Send Email"/>
    </form>
</div>

<div>
    <p>Validation</p>
    <s:form action="empinfo" method="post">
        <s:textfield name="name" label="Name" size="20" />
        <s:textfield name="age" label="Age" size="20" />
        <s:submit name="submit" label="Submit" align="center" />
    </s:form>
</div>
</body>
</html>