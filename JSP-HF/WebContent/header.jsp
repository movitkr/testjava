<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%! 
 int pageCount = 0;
 void addCount() {
   pageCount++;
 }
%>
<% addCount(); %>
<html>
<head>
<title>The include Directive Example</title>
</head>
<body>
<center>
<h2>The include Directive Example</h2>
<p>This site has been visited <%= pageCount %> times.</p>
</center>
<br/><br/>