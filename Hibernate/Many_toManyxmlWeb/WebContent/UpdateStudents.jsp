<%@page import="java.util.Set"%>
<%@page import="java.util.LinkedHashSet"%>
<%@page import="pp.Trainer"%>
<%@page import="java.util.List"%>
<jsp:useBean id="rd" class="pp.Rdao"></jsp:useBean>
<jsp:useBean id="ss" class="pp.Student"></jsp:useBean>
<jsp:setProperty property="sid" name="ss"/>
<jsp:setProperty property="sname" name="ss"/>
<jsp:setProperty property="branch" name="ss"/>
<%
String trainers[]=request.getParameterValues("trainers");
Set<Trainer> al=new LinkedHashSet<Trainer>();
for(String s:trainers)
{
	int tidd=Integer.parseInt(s);
	Trainer t1=rd.findTrainer(tidd);//sare trainer tid ki madet se aagaye 
	//if(t1!=null)
	//{
	al.add(t1);//trainer add in al
	//}
}


ss.setTrainers(al);
rd.UpdateStudent(ss);
response.sendRedirect("Show.jsp");

%>