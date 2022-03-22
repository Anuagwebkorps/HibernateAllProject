<%@page import="java.util.LinkedHashSet"%>
<%@page import="pp.Student"%>
<%@page import="java.util.Set"%>
<jsp:useBean id="rd" class="pp.Rdao"></jsp:useBean>
<jsp:useBean id="t" class="pp.Trainer"></jsp:useBean>
<jsp:setProperty property="tid" name="t"/>
<jsp:setProperty property="tname" name="t"/>
<jsp:setProperty property="languages" name="t"/>
<%
String sids[]=request.getParameterValues("students"); //all sid we get
Set<Student> st=new LinkedHashSet<Student>();
for(String id:sids)
{
	int sidd=Integer.parseInt(id);
	Student s=rd.findStudent(sidd); //findStudent sid ki muded se student ke obj laye gaa
	/* if(s!=null) //s agar null huaa to student hai hi nahi
	{
		st.add(s);	
	} */
	st.add(s);	
}
t.setStudents(st);
rd.UpdateT(t);
response.sendRedirect("Show.jsp");
%>
