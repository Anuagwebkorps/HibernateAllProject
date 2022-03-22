<%@page import="java.util.List"%>
<%@page import="pp.Student"%>
<%@page import="java.util.Set"%>
<%@page import="pp.Trainer"%>
<jsp:useBean id="rd" class="pp.Rdao"></jsp:useBean>
<%
String tid=request.getParameter("tid");
String tname=request.getParameter("tname");
String languages=request.getParameter("languages");
Trainer t=rd.findTrainer(Integer.parseInt(tid));
Set<Student> al1=t.getStudents(); //only previous student
List<Student> al=rd.ShowStudent(); //all trainer
%>
<form action="UpdateTrainers.jsp">
<input type="text" name="tid" value="<%=tid %>" readonly /><br>
TrainerName<input type="text" name="tname" value="<%=tname %>" /><br>
Languages<input type="text" name="languages" value="<%=languages %>" /><br>
Students<select name="students" multiple>
<%
String temp="";
for(Student s:al) //al :all trainer
{
	temp="false";
	for(Student s1:al1) //al1 previous student: 
	{
		if(s.getSid()==s1.getSid())
		
		{
			temp="true";
			break;
		}
	}
	if(temp.equals("true"))
	{
		%>
		<option value="<%=s.getSid() %>" selected><%=s.getSid() %> <%=s.getSname() %> <%=s.getBranch() %></option>
		<%
	}
	else
	{
		%>
		<option value="<%=s.getSid() %>"><%=s.getSid() %> <%=s.getSname() %> <%=s.getBranch() %></option>
		<%
	}
}
%>
</select>
<input type="submit" value="Update" />
</form>
<div style="text-align:center;"><br>
<a href="index.html">Index page</a><br>
<a href="Store.jsp">assign Batch To Trainer</a><br>
<a href="Show.jsp">show all data</a><br>
</div>
 id of previous Students:
<%
for(Student s:al1) 
{ %>
	<%=s.getSid()%>
<%
}

%>

