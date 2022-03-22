<jsp:useBean id="s" class="pp.Student"></jsp:useBean>
<jsp:setProperty property="*" name="s"/>
<jsp:useBean id="rd" class="pp.Rdao"></jsp:useBean>
<%
rd.addStudent(s);
out.println("added");
%>