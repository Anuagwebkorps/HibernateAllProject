<%@page import="pp.Student"%>
<jsp:useBean id="rd" class="pp.Rdao"></jsp:useBean>
<%
Student s=new Student();
String p=request.getParameter("del");
int del=Integer.parseInt(p);
s.setSid(del);
rd.delStudent(s);
response.sendRedirect("Show.jsp");
%>