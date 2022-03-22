<%@page import="pp.Student"%>
<%@page import="pp.Trainer"%>
<%@page import="java.util.List"%>
<jsp:useBean id="rd" class="pp.Rdao"></jsp:useBean>
<form action="Relation.jsp">
Trainer<select name="tid">
<%
List<Trainer> tr=rd.ShowTrainer();
for(Trainer t:tr)
{
	%>
	<option value="<%=t.getTid()%>"><%=t.getTid()+" "+t.getTname()+" "+t.getLanguages()%></option>
	<%
}
%>
</select><br><br>
Students<select name="sid" multiple >
<%
List<Student> st=rd.ShowStudent();
for(Student s:st)
{
	%>
	<option value="<%=s.getSid()%>"><%=s.getSid()+" "+s.getSname()+" "+s.getBranch()%></option>
	<%
}
%>
</select><br><br>
<input type="submit" value="assign list" />
</form>