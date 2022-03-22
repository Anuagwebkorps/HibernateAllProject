<%@page import="pp.Student"%>
<%@page import="java.util.Set"%>
<%@page import="pp.Trainer"%>
<%@page import="java.util.List"%>
<jsp:useBean id="rd" class="pp.Rdao"></jsp:useBean>
<table align="center" border="1px">
<th>Trainer Detail</th>
<th>Student Detail</th>
<%
List<Trainer> al=rd.ShowTrainer();
for(Trainer t:al)
{
	%>
	<tr>
	<td>
	TID : <%=t.getTid() %> NAME : <%=t.getTname() %> LANGUAGES : <%=t.getLanguages() %>
	<a href="updatetrainer.jsp?tid=<%=t.getTid() %>">Update</a>
	</td>
	<td>
	<%
	Set<Student> st=t.getStudents();
	for(Student s:st)
	{
		%>
		SID : <%=s.getSid() %> NAME : <%=s.getSname() %> BRANCH : <%=s.getBranch() %>
		<a href="updatestudent.jsp?sid=<%=s.getSid() %>">Update</a><br/>
		<%
	}
	%>
	</td>
	<td>
	<a href="">Update Batch</a>
	</td>
	</tr>
	<%
}
%>
</table>