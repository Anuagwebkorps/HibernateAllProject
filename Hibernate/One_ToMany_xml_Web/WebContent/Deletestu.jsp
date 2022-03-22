<%@page import="pp.Student"%>
<jsp:useBean id="r" class="pp.Rdao"></jsp:useBean>
<%
String ss=request.getParameter("stu");
int stu=Integer.parseInt(ss);
Student s=new Student();
s.setSid(stu);
r.delStu(s);
%>