<%@page import="pp.Student"%>
<%@page import="pp.Trainer"%>
<%@page import="java.util.List"%>
<jsp:useBean id="d" class="pp.Rdao"></jsp:useBean>
<table align="center" border="1px">


<%
List<Trainer> al=d.show();
for(Trainer t:al)
{
%>
<tr>
<td><%=t.getTid() %></td>
<td><%=t.getTname() %></td>
<td><%=t.getLanguages() %></td>
<%
List<Student> al1=t.getStudents();
for(Student s:al1)
{
%>
<td><%=s.getSid() %></td>
<td><%=s.getSname() %></td>
<td><%=s.getBranch() %></td>
<td><%=s.getYear() %></td>
<td><%=s.getYear() %></td>
<%	
}
%>
</tr>
<%	
}
%>
</table>