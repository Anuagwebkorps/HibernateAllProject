<%@page import="java.util.List"%>
<%@page import="java.util.Set"%>
<%@page import="pp.Student"%>
<%@page import="pp.Trainer"%>
<%-- <jsp:setProperty property="*" name="s"/>
from get property=<jsp:getProperty property="sname" name="s"/> --%>
<jsp:useBean id="rd" class="pp.Rdao"/>

<%
String sidd=request.getParameter("sid");
int sid=Integer.parseInt(sidd);
String sname=request.getParameter("sname");
String branch=request.getParameter("branch");
Student t=rd.findStudent(sid);
List<Trainer> al2=rd.ShowTrainer();
%>
<form action="UpdateStudents.jsp">
ID:<input type="text" name="sid" value= "<%=sid %>" readonly/><br>
sname:<input type="text" name="sname" value="<%=sname %>" /><br>
branch:<input type="text" name="branch" value="<%=branch %>" /><br>
<h4>Trainer</h4>
<select name="trainers" multiple><br>

<%
Set<Trainer> al1=t.getTrainers();//Trainer ke obj set me mile ge //Trainers matlab combine wali table[trst]
String temp="";
for(Trainer tt:al2) //al2 all Trainer 
{
	temp="false";

	for(Trainer tt1:al1)//al1 previous Trainer 
	{
		if(tt.getTid()==tt1.getTid())
		{
         	temp="true";
         	break;
		}
		
	}
	if(temp.equals("true"))
	{%>
		<option value="<%=tt.getTid() %>" selected><%=tt.getTid() %> <%=tt.getTname() %> <%=tt.getLanguages() %></option>
	    

	<%}
	else
	{
		%>
		<option value="<%=tt.getTid() %>" ><%=tt.getTid() %> <%=tt.getTname() %> <%=tt.getLanguages() %></option>
	    <%
	   	
	}

}


%>
</select>
<input type="submit" value="Update">
</form>



