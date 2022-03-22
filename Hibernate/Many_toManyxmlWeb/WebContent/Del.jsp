<jsp:useBean id="d" class="pp.Rdao"></jsp:useBean>
<%@page import="pp.Trainer" %>
<%
Trainer t=new Trainer();
String dell=request.getParameter("del");
int del=Integer.parseInt(dell);
t.setTid(del);
d.delTrainer(t);
out.println("Del");
response.sendRedirect("Show.jsp");
%>