
<jsp:useBean id="t" class="pp.Trainer"></jsp:useBean>
<jsp:setProperty property="*" name="t"/>
<jsp:useBean id="rd" class="pp.Rdao"></jsp:useBean>
<%
try
{
int i=rd.addTrainer(t);
out.println(i+" added");
}
catch(Exception e)
{
	out.print("Sorry UserName or Password Error!");  
	%>
	<h3 style="color:red;">Sorry UserName or Password Error!</h3>
	<%
    RequestDispatcher rdd=request.getRequestDispatcher("index.html");  
    rdd.include(request, response);  
	out.print("Sorry UserName or Password Error!");  

}
%>