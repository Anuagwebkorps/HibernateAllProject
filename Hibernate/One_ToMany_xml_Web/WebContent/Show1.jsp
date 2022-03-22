<%@page import="pp.Student"%>
<%@page import="pp.Trainer"%>
<%@page import="java.util.List"%>
<jsp:useBean id="d" class="pp.Rdao"></jsp:useBean>
<style>
.hi {
color:red;

}
</style>
<table align="center" border="1px sloid green">
<th class="hi">Tid</th>
<th>Tname</th>
<th>Tlanguage</th>
<th>Sid</th>
<th>Sname</th>
<th>Branch</th>
<th>year</th><br>
<th>Sid</th>
<th>Sname</th>
<th>Branch</th>
<th>year</th>
<th>Sid</th>
<th>Sname</th>
<th>Branch</th>
<th>year</th>




<%
List<Trainer>al=d.show();
for(Trainer t:al)
{
%>
<tr>
<td><%=t.getTid() %></td>
<td><%=t.getTname() %></td>
<td><%=t.getLanguages() %> </td>

<%
List<Student>all=t.getStudents();
for(Student s:all)
{
%>

<td><%=s.getSid() %></td>	
<td><%=s.getSname() %></td>	
<td><%=s.getBranch() %></td>	
<td><%=s.getYear() %></td>	
<% } %>
</tr>	
<%} %>

</table>