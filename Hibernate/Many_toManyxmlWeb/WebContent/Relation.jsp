<jsp:useBean id="rd" class="pp.Rdao"></jsp:useBean>
<%

String id=request.getParameter("tid");
int tid=Integer.parseInt(id);
String sid[]=request.getParameterValues("sid");
rd.updateData(tid, sid);
response.sendRedirect("Show.jsp");

%>