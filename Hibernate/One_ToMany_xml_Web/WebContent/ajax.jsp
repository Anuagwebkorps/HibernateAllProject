<%
String t=request.getParameter("val");
if(t==null ||t.equals(""))
{%>
	<h2>Enter number please!!!!</h2>
<% 
}
else
{	
int no=Integer.parseInt(t);
for(int i=1;i<=no;i++)
{
%>
<%=i%> STUDENT ID<input type="number" name="sid"/><br>
<%=i %> STUDENT NAME<input type="text" name="sname"/><br>
<%=i %> STUDENT BRANCH<input type="text" name="branch"/><br>
<%=i %> STUDENT YEAR<input type="number" name="year"/><br>
<hr>
<%
}
}
%>
<input type="submit"/>