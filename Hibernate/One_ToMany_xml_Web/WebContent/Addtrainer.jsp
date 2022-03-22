<%@page import="pp.Trainer"%>
<%@page import="pp.Student"%>
<%@page import="java.util.ArrayList"%>
<jsp:useBean id="d" class="pp.Rdao"></jsp:useBean>
<%
int i=0;
String id=request.getParameter("tid");
int tid=Integer.parseInt(id);
String tname=request.getParameter("tname");
String language=request.getParameter("language");
/* Student class */
String sids[]=request.getParameterValues("sid");
String sname[]=request.getParameterValues("sname");
String branch[]=request.getParameterValues("branch");
String years[]=request.getParameterValues("year"); 
ArrayList<Student> al=new ArrayList<Student>();
for(String s:sname)  /* yaha kuch bhi le lo branch,year koi fark nahi padhtha ku ki sabhi equal time hi add hoge */ 
{
Student s1=new Student();
s1.setSid(Integer.parseInt(sids[i]));
s1.setSname(sname[i]);
s1.setBranch(branch[i]);
s1.setYear(Integer.parseInt(years[i]));
al.add(s1);
i++;
}
Trainer t=new Trainer();
t.setTid(tid);
t.setTname(tname);
t.setLanguages(language);
t.setStudents(al);
int u=d.addTrain(t); //method
out.println(u+"  added");
%>