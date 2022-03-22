<%@page import="pp.Student"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.List"%>
<%@page import="pp.Trainer"%>
<style>
.train:hover{
background-color:pink;
color:red;
}

.hii
{
background-color:pink;
color:red;}

</style>
<jsp:useBean id="rd" class="pp.Rdao"></jsp:useBean>
<table align="center" border="1px">
<th class="hii">Trainer Detail</th>
<th class="hii">Student Detail</th>

<%
List<Trainer> al=rd.ShowTrainer();
for(Trainer t:al)
{
	%>
	<tr>
	<td class="train">
	Tid:<%=t.getTid() %> |Name:<%=t.getTname() %> |Languages:<%=t.getLanguages() %> 
	&nbsp;&nbsp;<a href="UpdateTrainer.jsp?tid=<%=t.getTid()%>&tname=<%=t.getTname()%>&languages=<%=t.getLanguages() %> ">Update_Add</a>
    &nbsp;<a href="Del.jsp?del=<%=t.getTid() %>">Del</a>
	
	</td>
	<td class="train">
	<%
	Set<Student>s =t.getStudents();
	for(Student ss:s)
	{
		%>
		
	Sid:<%=ss.getSid() %> |Name:<%=ss.getSname()  %> |Branch:<%=ss.getBranch() %>
  &nbsp;&nbsp;<a href="UpdateStudent.jsp?sid=<%=ss.getSid()%>&sname=<%=ss.getSname()%>&branch=<%=ss.getBranch()%> ">Update</a>
	
	 &nbsp;<a href="Del1.jsp?del=<%=ss.getSid() %>">Del</a>
	<br> 
	
	<%}%>
	
	</td>
	
	</tr>
		
	
<%
}
%>

</table>
<div style="text-align:center;"><br>
<a href="index.html">Index page</a><br>
<a href="Store.jsp">assign Batch To Trainer</a><br>

</div>

